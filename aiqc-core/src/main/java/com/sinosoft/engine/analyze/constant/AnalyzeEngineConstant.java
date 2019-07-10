package com.sinosoft.engine.analyze.constant;

import com.sinosoft.engine.analyze.utils.CommonTools;

import java.util.HashMap;
import java.util.Map;


public class AnalyzeEngineConstant {
    public static final String ENGINE_TYPE_QUALITY = "1";
    public static final String ENGINE_TYPE_SEARCH = "2";
    public static final String RULE_TYPE_SIMPLE = "1";
    public static final String RULE_TYPE_COMPLEX = "2";
    public static final String USER_ROLE_ALL = "0";
    public static final String USER_ROLE_SERVER = "1";
    public static final String USER_ROLE_CLIENT = "2";
    public static final String EMOTION_HAPPY = "1";
    public static final String EMOTION_ANGRY = "2";
    public static final String EMOTION_NEU = "3";
    public static final Map<Integer, String> EMOTION_ROLE_MAP_1 = new HashMap();
    public static final Map<String, Integer> EMOTION_ROLE_MAP_2;
    public static final Map<Integer, String> EMOTION_TYPE_MAP_1;
    public static final Map<String, Integer> EMOTION_TYPE_MAP_2;
    public static final String QUERY_WORD = "1";
    public static final String QUERY_ACTION_SHOW = "1";
    public static final String QUERY_STR_COMMON = "1";
    public static final String QUERY_STR_REGULAR = "2";
    public static final String YYZJ_R_BASE_DATA_XML_PROPERTY = "1";
    public static final String YYZJ_R_BASE_DATA_XML_NODE = "0";
    public static final String MOUNT_ROOT_DIR;

    static {
        EMOTION_ROLE_MAP_1.put(Integer.valueOf(1), "坐席");
        EMOTION_ROLE_MAP_1.put(Integer.valueOf(2), "客户");

        EMOTION_ROLE_MAP_2 = new HashMap();

        EMOTION_ROLE_MAP_2.put("坐席", Integer.valueOf(1));
        EMOTION_ROLE_MAP_2.put("客户", Integer.valueOf(2));


        EMOTION_TYPE_MAP_1 = new HashMap();

        EMOTION_TYPE_MAP_1.put(Integer.valueOf(1), "[Happy]");
        EMOTION_TYPE_MAP_1.put(Integer.valueOf(2), "[Angry]");
        EMOTION_TYPE_MAP_1.put(Integer.valueOf(3), "[Neu]");

        EMOTION_TYPE_MAP_2 = new HashMap();

        EMOTION_TYPE_MAP_2.put("[Happy]", Integer.valueOf(1));
        EMOTION_TYPE_MAP_2.put("[Angry]", Integer.valueOf(2));
        EMOTION_TYPE_MAP_2.put("[Neu]", Integer.valueOf(3));


        MOUNT_ROOT_DIR = CommonTools.getApplicationConf("yyzj.mount.root.dir").replaceAll("\\\\", "/");
    }


}


