package com.sinosoft.engine.analyze.controller;

import com.sinosoft.engine.analyze.cassandra.java.PageInfoCassandra;
import com.sinosoft.engine.analyze.cassandra.model.ScoreTotalData;
import com.sinosoft.engine.analyze.cassandra.repository.BaseDataRepository;
import com.sinosoft.engine.analyze.constant.AnalyzeEngineConstant;
import com.sinosoft.engine.analyze.dao.AnalyzerMapper;
import com.sinosoft.engine.analyze.dao.ProducerEleGroupMapper;
import com.sinosoft.engine.analyze.dao.RuleMapper;
import com.sinosoft.engine.analyze.model.*;
import com.sinosoft.engine.analyze.service.*;
import com.sinosoft.engine.analyze.service.impl.BaseDataServiceImpl;
import com.sinosoft.engine.analyze.utils.CommonTools;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;


@Controller
@RequestMapping({"/message"})
public class Message {
    private static Logger logger = Logger.getLogger(Message.class);

    @Autowired
    private CassandraOperations cassandraOperations;

    @Autowired
    private BaseDataRepository baseDataRepository;

    private BaseDataService baseSvc = new BaseDataServiceImpl();

    private AnalyzeResource res = new AnalyzeResource();


    @Autowired
    private RuleMapper ruleMapper;


    @Autowired
    private AnalyzerMapper analyzerMapper;


    @Autowired
    private ProducerEleGroupMapper producerEleGroupMapper;


    @RequestMapping({"/send/{sysId}/{date}/{xmlfile}"})
    @ResponseBody
    public String receive(@PathVariable("sysId") String sysId, @PathVariable("date") String date, @PathVariable("xmlfile") String xmlfile) {
        Map<String, String> result = new HashMap<String, String>();
        IndexFile indexFile = new IndexFile();
        indexFile.setSysId(sysId);
        indexFile.setDate(date);
        indexFile.setFileName(xmlfile);
        IndexFileHandleService.addIndexFile(indexFile);
        result.put("code", "0");
        return JSONObject.fromObject(result).toString();
    }


    @RequestMapping({"/againAnalyze/{baseId}"})
    @ResponseBody
    public String againAnalyze(@PathVariable("baseId") String baseId) {
        Map<String, String> result = new HashMap<String, String>();
        try {
            result.put("code", "1");
            if (StringUtils.isNotBlank(baseId)) {
                List<BaseData> list = this.baseDataRepository.getBaseDataById(baseId);
                if (list != null && list.size() > 0) {
                    BaseData base = (BaseData) list.get(0);
                    result.put("code", IndexFileHandleService.addTask(base) ? "0" : "1");
                }
            }
        } catch (Exception e) {
            logger.error("重新分析文件异常", e);
        }
        return JSONObject.fromObject(result).toString();
    }


    @RequestMapping(value = {"/tempAnalyze/{baseId}/{totalScoreId}"}, produces = {"application/json; charset=utf-8"})
    @ResponseBody
    public String tempAnalyze(@PathVariable("baseId") String baseId, @PathVariable("totalScoreId") String totalScoreId) {
        return tempAnalyze(baseId, totalScoreId, null);
    }


    @RequestMapping(value = {"/tempAnalyze/{baseId}/{totalScoreId}/{ruleId}"}, produces = {"application/json; charset=utf-8"})
    @ResponseBody
    public String tempAnalyze(@PathVariable("baseId") String baseId, @PathVariable("totalScoreId") String totalScoreId, @PathVariable("ruleId") String ruleId) {
        Map<String, String> result = new HashMap<String, String>();
        result.put("code", "0");
        result.put("data", "[]");
        result.put("info", "");
        try {
            if (StringUtils.isBlank(baseId)) throw new Exception("参数错误：baseId为空");
            List<BaseData> list = this.baseDataRepository.getBaseDataById(baseId);
            if (list == null || list.size() == 0) throw new Exception("Nosql没有找到数据baseId=" + baseId);
            BaseData base = (BaseData) list.get(0);
            BlockingQueue<List<AnalyzeResult>> queue = new LinkedBlockingQueue<>();
            if (!IndexFileHandleService.addTempTask(base, totalScoreId, ruleId, queue))
                throw new Exception("添加临时质检任务失败");
            List<AnalyzeResult> reList = (List) queue.poll(30L, TimeUnit.SECONDS);
            if (reList == null) throw new Exception("获取质检（标注）结果超时  30秒");


            List<AnalyzeResult> reList2 = new ArrayList<AnalyzeResult>();
            for (AnalyzeResult ar : reList) {
                if (ar.getMarkList().size() > 0) reList2.add(ar);
            }
            reList = reList2;


            logger.info(JSONArray.fromObject(reList).toString());
            result.put("data", JSONArray.fromObject(reList).toString());
        } catch (Exception e) {
            logger.error("临时质检异常", e);
            result.put("info", e.getMessage());
            result.put("code", "1");
        }
        return getJsonStr(result);
    }


    private String getJsonStr(Map<String, String> result) {
        return JSONObject.fromObject(result).toString();
    }


    @RequestMapping({"/cql"})
    @ResponseBody
    public String cql(HttpServletRequest request) {
        PageInfoCassandra<ScoreTotalData> p = new PageInfoCassandra<ScoreTotalData>(ScoreTotalData.class);
        p.setCassandraOperations(this.cassandraOperations);
        p.setPageSize(3);

        String cql = "select * from znyyzj.YYZJ_T_SCORE_TOTAL_DATA where sys_id = 'sys1' and start_time > '2017-07-01 14:00:00+0000' and end_time < '2017-07-10 16:20:00+0000' and remote_uri='sip:1001' and local_uri='tel:2001' and call_type=1 and agent_id='1001'";


        List<ScoreTotalData> list = p.query(cql, 1L);
        for (ScoreTotalData d : list) {
            System.out.println(JSONObject.fromObject(d).toString());
        }


        while (true) {
            List<ScoreTotalData> list1 = p.next(cql);
            if (list1 == null)
                break;
            for (ScoreTotalData d : list1) {
                System.out.println(JSONObject.fromObject(d).toString());
            }
        }

        System.out.println("--------------------------------------------------------------");

        while (true) {
            List<ScoreTotalData> list2 = p.previous(cql);
            if (list2 == null)
                break;
            for (ScoreTotalData d : list2) {
                System.out.println(JSONObject.fromObject(d).toString());
            }
        }


        return "index";
    }


    @RequestMapping({"/send/sysId/"})
    @ResponseBody
    public String send(HttpServletRequest request) {
        for (int i = 0; i < 80; i++) {
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Task t = new Task();
            t.setSysId("sys1");
            SoundIndex idx = new SoundIndex();
            idx.setSessionId(CommonTools.getUUID());
            idx.setCallType("1");
            int ttt = RandomUtils.nextInt(5);
            idx.setStartTime("2017-07-0" + ttt + " 16:05:07");
            idx.setEndTime("2017-07-0" + (ttt + RandomUtils.nextInt(4)) + " 16:10:07");
            idx.setDuration("1000");
            idx.setRemoteUri("sip:1001");
            idx.setLocalUri("tel:2001");
            idx.setAgentId("1001");
            idx.setRecordName("/abc/aaaaa/abc.wav");
            idx.setDeviceNumber("sip:1001");
            idx.setDeviceName("ims_191");
            t.setSoundIndex(idx);
            t.setIndexFileName("/abc/aaaaa/abc.csv");
            t.setSoundFileName("/abc/aaaaa/abc.wav");
            t.setXmlFileName("D:/work/workspace/analyze/xml/LHDC_65593a520004cfae_20170609154523_01084661891_sip-913303_1002.xml");
            TaskDispatcherService.addTask(t);
        }


        return "index";
    }


    @RequestMapping({"/send/scoreTotalTask/{scoreTotalId}"})
    @ResponseBody
    public String sendScoreTotalResultTask(HttpServletRequest request, @PathVariable String scoreTotalId) {
        TaskScoreTotalResultDispatcherService.addTask(scoreTotalId);
        return "0";
    }

    private void addData(String sysId) {
        Task t = new Task();
        t.setSysId(sysId);

        SoundIndex idx = new SoundIndex();
        idx.setSessionId(CommonTools.getUUID());
        idx.setCallType("" + (RandomUtils.nextInt(3) + 1));
        long tt = (new Date()).getTime() + RandomUtils.nextInt(100000);
        idx.setStartTime("" + CommonTools.getFormatDate(new Date(tt)));
        idx.setEndTime("" + CommonTools.getFormatDate(new Date(tt + RandomUtils.nextInt(100000))));
        idx.setDuration("" + RandomUtils.nextInt(1000));
        int sip = RandomUtils.nextInt(1000);
        idx.setRemoteUri("sip:" + sip);
        idx.setLocalUri("tel:" + RandomUtils.nextInt(1000));
        idx.setAgentId("" + RandomUtils.nextInt(1000));
        idx.setRecordName("/abc/aaaaa/abc.wav");
        idx.setDeviceNumber("sip:" + sip);
        idx.setDeviceName("ims_" + RandomUtils.nextInt(1000));

        t.setSoundIndex(idx);
        t.setIndexFileName("/abc/aaaaa/abc.csv");
        t.setSoundFileName("/abc/aaaaa/abc.wav");
        t.setXmlFileName("D:/work/workspace/analyze/xml/LHDC_65593a520004cfae_20170609154523_01084661891_sip-913303_1002.xml");


        TaskDispatcherService.addTask(t);
    }


    @RequestMapping(value = {"/detectionMmark/{baseId}/{ruleId}"}, produces = {"application/json; charset=utf-8"})
    @ResponseBody
    public String detectionMmark(@PathVariable("baseId") String baseId, @PathVariable("ruleId") String ruleId) {
        Map<String, String> result = new HashMap<String, String>();
        result.put("code", "0");
        result.put("data", "[]");
        result.put("info", "");
        try {
            Rule r = this.ruleMapper.selectByPrimaryKey(ruleId);
            RuleCore rule = getRuleCore(r);
            Analyzer an = this.analyzerMapper.selectByPrimaryKey("1");

            AnalyzeResult anResult = execRule(an, rule, baseId);
            if (anResult.isResult()) {


                logger.info(JSONArray.fromObject(anResult).toString());
                result.put("data", JSONArray.fromObject(anResult).toString());
            }
        } catch (Exception e) {
            logger.error("【Message】调用detectionMmark异常", e);
            result.put("info", e.getMessage());
            result.put("code", "1");
        }
        return getJsonStr(result);
    }


    private AnalyzeResult execRule(Analyzer analyzer, RuleCore rule, String baseId) throws Exception {
        List<BaseData> base = this.baseDataRepository.getBaseDataById(baseId);
        String fileName = null;
        if (base != null && base.size() > 0) {
            fileName = ((BaseData) base.get(0)).getRecordFile();
            int num = fileName.lastIndexOf(".");
            if (num > -1 && num < fileName.length()) {
                fileName = fileName.substring(0, num);
            }
        }
        String XmlFileName = ".xml";
        String EmoFileName = "_text_role_result_emo.txt";
        Task task = new Task();
        task.setXmlFileName(fileName + XmlFileName);
        task.setEmoFileName(fileName + EmoFileName);
        this.res.setResultXmlFile(AnalyzeEngineConstant.MOUNT_ROOT_DIR + task.getXmlFileName());
        this.res.setEmotionFile(AnalyzeEngineConstant.MOUNT_ROOT_DIR + task.getEmoFileName());
        this.res.init(this.baseSvc);

        try {
            logger.debug("分析器:" + JSONObject.fromObject(analyzer).toString());
            Class cls = DynamicClassLoader.my.loadClass(analyzer.getAnalyzerClass(), analyzer.getVersion());
            Object obj = cls.newInstance();
            AnalyzeService analyObj = (AnalyzeService) obj;
            return analyObj.analyzeRule(rule, this.res);
        } catch (Throwable e) {
            logger.error("分析文件指定规则异常", e);
            AnalyzeResult re = new AnalyzeResult();
            re.setResult(false);
            re.setErrorFlag(true);
            re.setErrorContext("分析文件指定规则异常:" + e.getMessage());
            return re;
        }
    }


    private RuleCore getRuleCore(Rule rule) throws Exception {
        List<SqlResultMap001> list = this.producerEleGroupMapper.getProducerEleValueExt(rule.getRuleId());
        if (list == null || list.size() == 0) {
            logger.warn("规则没有关联元素组、元素等信息");
            return null;
        }
        Map<String, List<ProducerEleValueExt>> eleGroupMap = new HashMap<String, List<ProducerEleValueExt>>();


        String ruleAttrValue = "";
        JSONObject attrValueJson = null;
        if (StringUtils.isNotBlank(ruleAttrValue)) {
            attrValueJson = JSONObject.fromObject(ruleAttrValue);
        }


        for (SqlResultMap001 map001 : list) {
            if (!eleGroupMap.containsKey(map001.getEleGroupId()))
                eleGroupMap.put(map001.getEleGroupId(), new ArrayList());
            ProducerEleValueExt e = new ProducerEleValueExt();
            e.setCode(map001.getCode());
            e.setEleGroupId(map001.getEleGroupId());
            e.setEleId(map001.getEleId());
            e.setEleValue(map001.getEleValue());
            e.setEleValueType(map001.getEleValueType());


            if (map001.getEleValueType().intValue() == 1) {
                if (attrValueJson == null)
                    throw new Exception("规则配置不正确，规则配置了“替换值”，但在YYZJ_C_SCORE_DETAIL.rule_attr_value中未找到！");
                e.setEleValue((String) attrValueJson.get(map001.getCode()));
            }


            ((List) eleGroupMap.get(map001.getEleGroupId())).add(e);
        }

        RuleCore ruleCore = new RuleCore(rule.getRuleId(), rule.getName(), rule.getContext(), rule.getType(), "1");
        ruleCore.setEleGroupMap(eleGroupMap);
        return ruleCore;
    }


    public CassandraOperations getCassandraOperations() {
        return this.cassandraOperations;
    }


    public void setCassandraOperations(CassandraOperations cassandraOperations) {
        this.cassandraOperations = cassandraOperations;
    }

    public static void main(String[] args) {
    }
}


