package com.sinosoft.engine.analyze.service.impl;

import com.sinosoft.engine.analyze.cassandra.model.BaseData;
import com.sinosoft.engine.analyze.model.AnalyzeResource;
import com.sinosoft.engine.analyze.model.Emotion;
import com.sinosoft.engine.analyze.model.SoundIndex;
import com.sinosoft.engine.analyze.model.Task;
import com.sinosoft.engine.analyze.service.BaseDataService;
import com.sinosoft.engine.analyze.service.CacheService;
import com.sinosoft.engine.analyze.utils.CommonTools;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;
import org.apache.log4j.Logger;

import java.io.File;
import java.util.*;


public class BaseDataServiceImpl
        implements BaseDataService {
    private static Logger logger = Logger.getLogger(BaseDataServiceImpl.class);


    public BaseData generateBaseDataByTask(Task task, AnalyzeResource res) {
        BaseData d = new BaseData();
        try {
            logger.info("1、获取索引文件中信息到BaseData中");
            getPropertyByIndex(d, task.getSoundIndex());

            d.setBaseId(CommonTools.getUUID());
            d.setSequenceNum(Long.valueOf(CacheService.getSequenceVal()));
            d.setCreateTime(new Date());
            d.setSysId(task.getSysId());
            d.setSysIdBak(task.getSysId());
            d.setResolveFile(task.getXmlFileName());
            d.setRecordFile(task.getSoundFileName());
            d.setMoodFile(task.getEmoFileName());
            d.setQualityUserId("");

            logger.info("2、获取XML文件中信息到BaseData中");
            d = res.getXmlJsoup().resolverXmlBaseIndex(d);


            logger.info("3、获取情绪信息到BaseData中");
            addMoodInfo(res, d);
        } catch (Exception e) {
            logger.error("通过task生成basedata异常", e);
        }
        return d;
    }

    public BaseData generateBaseDataByTask(Task task, AnalyzeResource res, BaseData d) {
        try {
            logger.info("1、获取索引文件中信息到BaseData中");
            getPropertyByIndex(d, task.getSoundIndex());

            d.setBaseId(CommonTools.getUUID());
            d.setSequenceNum(Long.valueOf(CacheService.getSequenceVal()));
            d.setCreateTime(new Date());
            d.setSysId(task.getSysId());
            d.setSysIdBak(task.getSysId());
            d.setResolveFile(task.getXmlFileName());
            d.setRecordFile(task.getSoundFileName());
            d.setMoodFile(task.getEmoFileName());
            d.setQualityUserId("");

            logger.info("2、获取XML文件中信息到BaseData中");
            d = res.getXmlJsoup().resolverXmlBaseIndex(d);


            logger.info("3、获取情绪信息到BaseData中");
            addMoodInfo(res, d);
        } catch (Exception e) {
            logger.error("通过task生成basedata异常", e);
        }
        return d;
    }


    public List<Emotion> getEmotionList(String emotionFile) {
        List<Emotion> list = new ArrayList<Emotion>();
        if (StringUtils.isBlank(emotionFile)) return list;
        File f = new File(emotionFile);
        if (!f.exists()) return list;

        try {
            List<String> fl = FileUtils.readLines(f, CommonTools.getApplicationConf("zk.file.code.mood"));
            if (fl == null) return list;

            Map<String, Integer> roleMap = new HashMap<String, Integer>();
            roleMap.put("坐席", Integer.valueOf(1));
            roleMap.put("客户", Integer.valueOf(2));

            Map<String, Integer> typeMap = new HashMap<String, Integer>();
            typeMap.put("[Happy]", Integer.valueOf(1));
            typeMap.put("[Angry]", Integer.valueOf(2));
            typeMap.put("[Neu]", Integer.valueOf(3));

            for (String line : fl) {


                String[] arr = line.split("\\s+");
                if (arr.length < 6)
                    continue;
                Emotion e = new Emotion();

                e.setStartTime(Float.parseFloat(arr[0]));
                e.setEndTime(Float.parseFloat(arr[1]));
                e.setCallInfo(arr[2]);
                e.setRole(((Integer) roleMap.get(arr[3])).intValue());
                e.setEmotionType(((Integer) typeMap.get(arr[4])).intValue());
                e.setEmotionScore(Float.parseFloat(arr[5]));
                list.add(e);
            }
        } catch (Exception e) {
            logger.error("获取情绪列表异常", e);
        }
        return list;
    }


    private void addMoodInfo(AnalyzeResource res, BaseData d) {
        if (d == null)
            return;
        List<Emotion> list = res.getEmotionList();
        if (list == null)
            return;
        int hc1 = 0;
        int ac1 = 0;
        float ht1 = 0.0F;
        float at1 = 0.0F;

        int hc2 = 0;
        int ac2 = 0;
        float ht2 = 0.0F;
        float at2 = 0.0F;

        for (Emotion emo : list) {
            float s = emo.getStartTime();
            float e = emo.getEndTime();

            if (emo.getRole() == 1) {
                if (emo.getEmotionType() == 2) {
                    ac1++;
                    at1 += e - s;
                }
                if (emo.getEmotionType() == 1) {
                    hc1++;
                    ht1 += e - s;
                }
            }

            if (emo.getRole() == 2) {
                if (emo.getEmotionType() == 2) {
                    ac2++;
                    at2 += e - s;
                }
                if (emo.getEmotionType() == 1) {
                    hc2++;
                    ht2 += e - s;
                }
            }
        }
        d.setAgentMoodGood(Integer.valueOf(hc1));
        d.setAgentMoodGoodTime(Float.valueOf(ht1));
        d.setAgentMoodBad(Integer.valueOf(ac1));
        d.setAgentMoodBadTime(Float.valueOf(at1));


        d.setConsumerMoodGood(Integer.valueOf(hc2));
        d.setConsumerMoodGoodTime(Float.valueOf(ht2));
        d.setConsumerMoodBad(Integer.valueOf(ac2));
        d.setConsumerMoodBadTime(Float.valueOf(at2));
    }


    private void addMoodInfo(String moodFile, BaseData d) {
        if (StringUtils.isBlank(moodFile) || d == null)
            return;
        File f = new File(moodFile);
        if (!f.exists())
            return;
        try {
            List<String> list = FileUtils.readLines(f, CommonTools.getApplicationConf("zk.file.code.mood"));
            if (list == null) {
                return;
            }


            int hc1 = 0;
            int ac1 = 0;
            float ht1 = 0.0F;
            float at1 = 0.0F;

            int hc2 = 0;
            int ac2 = 0;
            float ht2 = 0.0F;
            float at2 = 0.0F;

            for (String line : list) {
                String[] arr = line.split("\\s+");
                if (arr.length < 6)
                    continue;
                float s = Float.parseFloat(arr[0]);
                float e = Float.parseFloat(arr[1]);

                if ("坐席".equals(arr[3])) {
                    if ("[Angry]".equals(arr[4])) {
                        ac1++;
                        at1 += e - s;
                    }
                    if ("[Happy]".equals(arr[4])) {
                        hc1++;
                        ht1 += e - s;
                    }
                }

                if ("客户".equals(arr[3])) {
                    if ("[Angry]".equals(arr[4])) {
                        ac2++;
                        at2 += e - s;
                    }
                    if ("[Happy]".equals(arr[4])) {
                        hc2++;
                        ht2 += e - s;
                    }
                }
            }
            d.setAgentMoodGood(Integer.valueOf(hc1));
            d.setAgentMoodGoodTime(Float.valueOf(ht1));
            d.setAgentMoodBad(Integer.valueOf(ac1));
            d.setAgentMoodBadTime(Float.valueOf(at1));


            d.setConsumerMoodGood(Integer.valueOf(hc2));
            d.setConsumerMoodGoodTime(Float.valueOf(ht2));
            d.setConsumerMoodBad(Integer.valueOf(ac2));
            d.setConsumerMoodBadTime(Float.valueOf(at2));

        } catch (Exception e) {
            logger.error("获取情绪指标异常", e);
        }
    }


    public BaseData getPropertyByIndex(BaseData d, SoundIndex i) {
        d.setAudioCode(i.getSessionId());
        if (StringUtils.isNotBlank(i.getCallType())) {
            if (i.getCallType().equals("自动外呼呼出") || i.getCallType().equals("呼出") || i.getCallType().equals("1")) {
                d.setCallType(Integer.valueOf(1));
            } else {
                d.setCallType(Integer.valueOf(2));
            }

        }

        String[] fmt = {"yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy-MM", "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm", "yyyy/MM", "yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm", "yyyy.MM"};


        if (i.getStartTime() != null) {
            try {
                Date date = DateUtils.parseDate(i.getStartTime(), fmt);
                d.setStartTime(date);
            } catch (Exception e) {
                logger.error("生成BaseData:StartTime异常", e);
            }
        }

        if (i.getEndTime() != null) {
            try {
                Date date = DateUtils.parseDate(i.getEndTime(), fmt);
                d.setEndTime(date);
            } catch (Exception e) {
                logger.error("生成BaseData:EndTime异常", e);
            }
        }

        if (StringUtils.isNotBlank(i.getDuration())) {
            if (!i.getDuration().contains(":")) {
                d.setRecordDuration(Integer.valueOf(Integer.parseInt(i.getDuration())));
            } else {
                String time = i.getDuration();
                String[] my = time.split(":");
                int hour = Integer.parseInt(my[0]);
                int min = Integer.parseInt(my[1]);
                int sec = Integer.parseInt(my[2]);
                int duration = hour * 3600 + min * 60 + sec;
                d.setRecordDuration(Integer.valueOf(duration));
            }
        }
        d.setRemoteUri(i.getRemoteUri());
        d.setLocalUri(i.getLocalUri());
        d.setAgentId(i.getAgentId());

        d.setRecordFile(i.getRecordName());


        d.setDeviceNumber(i.getDeviceNumber());
        d.setDeviceName(i.getDeviceName());
        return d;
    }
}


