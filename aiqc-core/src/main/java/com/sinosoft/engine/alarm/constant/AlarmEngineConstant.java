package com.sinosoft.engine.alarm.constant;

import java.util.HashMap;
import java.util.Map;


public class AlarmEngineConstant {
    public static final String ALARM_RESULT_YES = "1";
    public static final String ALARM_RESULT_NO = "0";
    public static final String ALARM_STATUS_YES = "1";
    public static final String ALARM_STATUS_NO = "0";
    public static final String ALARM_SEND_TYPE_SMS = "1";
    public static final String ALARM_SEND_TYPE_EMAIL = "2";
    public static final int ALARM_LEVEL_1 = 1;
    public static final int ALARM_LEVEL_2 = 2;
    public static final int ALARM_LEVEL_3 = 3;
    public static final Map<Integer, String> ALARM_LEVEL_MAP = new HashMap();

    static {
        ALARM_LEVEL_MAP.put(Integer.valueOf(1), "高");
        ALARM_LEVEL_MAP.put(Integer.valueOf(2), "中");
        ALARM_LEVEL_MAP.put(Integer.valueOf(3), "低");
    }
}
