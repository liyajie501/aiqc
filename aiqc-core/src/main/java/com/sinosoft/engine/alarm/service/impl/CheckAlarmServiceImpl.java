package com.sinosoft.engine.alarm.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sinosoft.engine.alarm.model.MsgScore;
import com.sinosoft.engine.alarm.service.AlarmConfigService;
import com.sinosoft.engine.alarm.service.CheckAlarmService;
import com.sinosoft.engine.analyze.dao.AlarmLogMapper;
import com.sinosoft.engine.analyze.dao.AlarmMapper;
import com.sinosoft.engine.analyze.model.Alarm;
import com.sinosoft.engine.analyze.model.AlarmLog;
import com.sinosoft.engine.analyze.utils.CommonTools;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;


@Service
public class CheckAlarmServiceImpl implements CheckAlarmService {
    private static final Logger logger = Logger.getLogger(CheckAlarmServiceImpl.class);
    private static SimpleDateFormat YYYYMM = new SimpleDateFormat("yyyyMM");

    private static List<Alarm> alarmConfig = AlarmConfigService.alarmConfig;

    @Autowired
    private AlarmMapper alarmMapper;

    @Autowired
    private AlarmLogMapper alarmLogMapper;
    private String tableNameSuffix = null;


    public boolean runCheck(MsgScore msg) {

        if (msg == null) return false;


        List<Alarm> violateList = new ArrayList<Alarm>();

        try {

            synchronized (alarmConfig) {

                for (Alarm a : alarmConfig) {

                    violateList.add(a);
                }
            }


            violateList = AlarmFilter(violateList);
            if (violateList == null || violateList.size() == 0) return false;


            for (Alarm a : violateList) {
                AlarmLog record = new AlarmLog();
                record.setTableNameSuffix(this.tableNameSuffix);
                record.setAlarmLogId(CommonTools.getUUID(12));
                record.setAlarmId(a.getAlarmId());
                record.setBaseId(msg.getBaseId());
                record.setContent(null);
                record.setReceiveUser(a.getReceiveUser());
                record.setResult(null);
                record.setResultText(null);
                record.setRuleId(msg.getRuleId());


                record.setSendTime(null);
                record.setStatus("0");
                record.setSysId(msg.getSysId());
                record.setCreateTime(new Date());
                record.setLevel(a.getLevel());
                record.setAudioCode(msg.getAudioCode());
                record.setRecordFile(msg.getRecordFile());


                record.setSendType(a.getSendType());

                record.setAgentId(msg.getAgentId());
                record.setStartTime(msg.getStartTime());
                record.setResultFlag(Integer.valueOf(1));
                record.setMark("0");
                this.alarmLogMapper.insertSelective(record);
            }

        } catch (Exception e) {
            logger.error("执行告警检测异常", e);
        }
        return (violateList.size() > 0);
    }


    private List<Alarm> AlarmFilter(List<Alarm> violateList) {
        if (violateList == null || violateList.size() == 0) return null;


        Collections.sort(violateList, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Alarm) o2).getLevel().intValue() - ((Alarm) o1).getLevel().intValue();
            }
        });
        int level = -1;
        List<Alarm> list1 = new ArrayList<Alarm>();
        for (Alarm a : violateList) {
            JSONArray jsonArray = JSONArray.parseArray(a.getCategoryIdLevel());
            for (int i = 0; i < jsonArray.size(); ) {
                JSONObject job = jsonArray.getJSONObject(i);
                String categoryLevel = job.getString("CategoryLevel");
                if (level <= Integer.parseInt(categoryLevel)) {
                    level = Integer.parseInt(categoryLevel);

                    a.setLevel(Integer.valueOf(level));


                    list1.add(a);
                    i++;
                }
            }
        }

        Alarm reObj = null;

        if (reObj == null)
            for (Alarm a : list1) {

                if (StringUtils.isNotBlank(a.getSysId())) {
                    reObj = a;
                    break;
                }

            }

        if (reObj == null) return null;

        List<Alarm> result = new ArrayList<Alarm>();

        result.add(reObj);

        return result;
    }


    public boolean checkAndSendAlarm(MsgScore msg) {
        return runCheck(msg);
    }
}


