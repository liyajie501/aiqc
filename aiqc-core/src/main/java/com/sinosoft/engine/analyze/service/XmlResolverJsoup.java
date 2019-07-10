package com.sinosoft.engine.analyze.service;

import com.sinosoft.engine.analyze.cassandra.model.BaseData;
import com.sinosoft.engine.analyze.cassandra.model.WordRecord;
import com.sinosoft.engine.analyze.utils.CommonTools;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;


public class XmlResolverJsoup {
    private static Logger logger = Logger.getLogger(XmlResolverJsoup.class);

    private String xmlFile;
    private File file;
    private Document document;
    private static final String DECOLLATOR1 = "|";
    private static final String DECOLLATOR2 = ">>";

    public XmlResolverJsoup(String xmlFile) {
        this.xmlFile = xmlFile;
    }


    public Document getDocument() throws IOException {
        if (this.document != null) return this.document;
        this.file = new File(this.xmlFile);
        return Jsoup.parse(this.file, "UTF-8");
    }


    public List<WordRecord> getWordList() throws Exception {
        List<WordRecord> list = new ArrayList<WordRecord>();

        Map<String, Integer> countMap = new HashMap<String, Integer>();

        Document doc = getDocument();
        Elements resultInfo = null;

        resultInfo = doc.select("root record sentence_list sentence");
        for (Element o : resultInfo) {
            String role = o.attr("role");
            Elements wlist = o.select("word_list word");
            for (Element w : wlist) {
                String word = w.attr("text");
                String key = role + "|" + word;
                if (!countMap.containsKey(key)) {
                    countMap.put(key, Integer.valueOf(1));
                    continue;
                }
                countMap.put(key, Integer.valueOf(((Integer) countMap.get(key)).intValue() + 1));
            }
        }

        for (String key : countMap.keySet()) {

            String[] arr = key.split("\\|");
            if (StringUtils.isBlank(arr[0]) || StringUtils.isBlank(arr[1]))
                continue;
            WordRecord word = new WordRecord();

            word.setRole(Integer.valueOf(Integer.parseInt(arr[0])));
            word.setWord(arr[1]);
            word.setCount((Integer) countMap.get(key));
            list.add(word);
        }
        return list;
    }

    public static void main(String[] args) throws IOException {
        XmlResolverJsoup j = new XmlResolverJsoup("D:/work/workspace/analyze2.0/video/静音/a2.xml");

        Document doc = j.getDocument();
        String cssQuery = null;
        Elements resultInfo = null;


        cssQuery = "root record silence_list silence";
        resultInfo = doc.select(cssQuery);
        StringBuilder s = new StringBuilder();
        for (Element o : resultInfo) {
            s.append(o.attr("start_time")).append("|").append(o.attr("end_time")).append(">>");
        }
        if (s.length() > 0) s.delete(s.length() - 2, s.length());
        System.out.println(s.toString());
    }


    public BaseData resolverXmlBaseIndex(BaseData b) throws IOException {
        logger.info("获取xml基础指标");

        Document doc = getDocument();
        String cssQuery = null;
        Elements resultInfo = null;


        cssQuery = "root record";
        resultInfo = doc.select(cssQuery);
        Iterator iterator = resultInfo.iterator();
        if (iterator.hasNext()) {
            Element o = (Element) iterator.next();
            String line = o.attr("durtime");
            b.setRecordDuration(Integer.valueOf(Integer.parseInt(line.trim())));
        }


        cssQuery = "root record sentence_list sentence";
        resultInfo = doc.select(cssQuery);
        int agentVal = 0;
        int ConsumerVal = 0;

        for (Element o : resultInfo) {
            int st = Integer.parseInt(o.attr("start_time"));
            int et = Integer.parseInt(o.attr("end_time"));
            int tt = et - st;
            String role = o.attr("role");
            if ("1".equals(role)) agentVal += tt;
            if ("2".equals(role)) ConsumerVal += tt;
        }
        b.setAgentRecordDuration(Integer.valueOf(agentVal));
        b.setConsumerRecordDuration(Integer.valueOf(ConsumerVal));


        cssQuery = "root record silence_list";
        resultInfo = doc.select(cssQuery);
        b.setMuteDuration(Integer.valueOf(Integer.parseInt(resultInfo.attr("total_time"))));


        cssQuery = "root record silence_list silence";
        resultInfo = doc.select(cssQuery);
        b.setMuteTimes(Integer.valueOf(resultInfo.size()));


        cssQuery = "root record silence_list silence";
        resultInfo = doc.select(cssQuery);
        StringBuilder s3 = new StringBuilder();
        for (Element o : resultInfo) {
            s3.append(o.attr("start_time")).append("|").append(o.attr("end_time")).append(">>");
        }
        if (s3.length() > 0) s3.delete(s3.length() - 2, s3.length());
        b.setMuteInfo(s3.toString());


        cssQuery = "root record sentence_list sentence";
        resultInfo = doc.select(cssQuery);
        StringBuilder s1 = new StringBuilder();
        int r1count = 0;
        float r1speed = 0.0F;
        int r2count = 0;
        float r2speed = 0.0F;

        for (Element o : resultInfo) {
            if ("1".equals(o.attr("role"))) {
                r1count++;
                r1speed += Float.parseFloat(o.attr("speed"));
            }
            if ("2".equals(o.attr("role"))) {
                r2count++;
                r2speed += Float.parseFloat(o.attr("speed"));
            }
        }
        if (resultInfo != null && resultInfo.size() > 0) {
            b.setAgentSpeed(Float.valueOf(r1speed / r1count));
            b.setConsumerSpeed(Float.valueOf(r2speed / r2count));
        } else {
            b.setAgentSpeed(Float.valueOf(0.0F));
            b.setConsumerSpeed(Float.valueOf(0.0F));
        }


        cssQuery = "root record interruption_list";
        resultInfo = doc.select(cssQuery);
        b.setRepeatTimes(Integer.valueOf(Integer.parseInt(resultInfo.attr("count").trim())));


        cssQuery = "root record interruption_list inter";
        resultInfo = doc.select(cssQuery);
        StringBuilder s2 = new StringBuilder();
        for (Element o : resultInfo) {

            s2.append(o.attr("start_time")).append("|")
                    .append(o.attr("end_time")).append("|")
                    .append(o.attr("role")).append("|")
                    .append(o.attr("confidence")).append(">>");
        }
        if (s2.length() > 0) s2.delete(s2.length() - 2, s2.length());
        b.setRepeatInfo(s2.toString());


        cssQuery = "root record sentence_list sentence";
        resultInfo = doc.select(cssQuery);
        b.setStatementNumber(Integer.valueOf(resultInfo.size()));


        cssQuery = "root record sentence_list sentence[role=\"1\"]";
        resultInfo = doc.select(cssQuery);
        b.setAgentSayNumber(Integer.valueOf(resultInfo.size()));


        cssQuery = "root record sentence_list sentence[role=\"2\"]";
        resultInfo = doc.select(cssQuery);
        b.setConsumerSayNumber(Integer.valueOf(resultInfo.size()));


        String callV = CommonTools.getApplicationConf("engine.analyze.save.call.info.version");
        String callModel = CommonTools.getApplicationConf("engine.analyze.save.call.info." + callV);
        String[] callModelArr = callModel.split("\\|");

        cssQuery = "root record sentence_list sentence";
        resultInfo = doc.select(cssQuery);
        b.setCallInfo(getCallInfo(resultInfo, callV, callModelArr).toString());


        double m = (b.getMuteDuration() == null) ? 0.0D : b.getMuteDuration().intValue();
        double n = (b.getRecordDuration() == null) ? 0.0D : b.getRecordDuration().intValue();
        if (n != 0.0D) b.setMutoRatio(Double.valueOf(m / n));

        return b;
    }

    private StringBuilder getCallInfo(Elements resultInfo, String callV, String[] callModelArr) {
        StringBuilder s = new StringBuilder();
        for (Element o : resultInfo) {
            s.append(callV).append("|");
            for (String m : callModelArr) {
                s.append(o.attr(m)).append("|");
            }
            s.append(">>");
        }
        return s;
    }
}


