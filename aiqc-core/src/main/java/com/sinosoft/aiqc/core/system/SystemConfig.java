package com.sinosoft.aiqc.core.system;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * 系统设置
 */
public class SystemConfig {
    // 小程序相关配置
    public final static String aiqc_WX_INDEX_NEW = "aiqc_wx_index_new";
    public final static String aiqc_WX_INDEX_HOT = "aiqc_wx_index_hot";
    public final static String aiqc_WX_INDEX_BRAND = "aiqc_wx_index_brand";
    public final static String aiqc_WX_INDEX_TOPIC = "aiqc_wx_index_topic";
    public final static String aiqc_WX_INDEX_CATLOG_LIST = "aiqc_wx_catlog_list";
    public final static String aiqc_WX_INDEX_CATLOG_GOODS = "aiqc_wx_catlog_goods";
    public final static String aiqc_WX_SHARE = "aiqc_wx_share";
    // 运费相关配置
    public final static String aiqc_EXPRESS_FREIGHT_VALUE = "aiqc_express_freight_value";
    public final static String aiqc_EXPRESS_FREIGHT_MIN = "aiqc_express_freight_min";
    // 订单相关配置
    public final static String aiqc_ORDER_UNPAID = "aiqc_order_unpaid";
    public final static String aiqc_ORDER_UNCONFIRM = "aiqc_order_unconfirm";
    public final static String aiqc_ORDER_COMMENT = "aiqc_order_comment";
    // 商场相关配置
    public final static String aiqc_MALL_NAME = "aiqc_mall_name";
    public final static String aiqc_MALL_ADDRESS = "aiqc_mall_address";
    public final static String aiqc_MALL_PHONE = "aiqc_mall_phone";
    public final static String aiqc_MALL_QQ = "aiqc_mall_qq";

    //所有的配置均保存在该 HashMap 中
    private static Map<String, String> SYSTEM_CONFIGS = new HashMap<>();

    private static String getConfig(String keyName) {
        return SYSTEM_CONFIGS.get(keyName);
    }

    private static Integer getConfigInt(String keyName) {
        return Integer.parseInt(SYSTEM_CONFIGS.get(keyName));
    }

    private static Boolean getConfigBoolean(String keyName) {
        return Boolean.valueOf(SYSTEM_CONFIGS.get(keyName));
    }

    private static BigDecimal getConfigBigDec(String keyName) {
        return new BigDecimal(SYSTEM_CONFIGS.get(keyName));
    }

    public static Integer getNewLimit() {
        return getConfigInt(aiqc_WX_INDEX_NEW);
    }

    public static Integer getHotLimit() {
        return getConfigInt(aiqc_WX_INDEX_HOT);
    }

    public static Integer getBrandLimit() {
        return getConfigInt(aiqc_WX_INDEX_BRAND);
    }

    public static Integer getTopicLimit() {
        return getConfigInt(aiqc_WX_INDEX_TOPIC);
    }

    public static Integer getCatlogListLimit() {
        return getConfigInt(aiqc_WX_INDEX_CATLOG_LIST);
    }

    public static Integer getCatlogMoreLimit() {
        return getConfigInt(aiqc_WX_INDEX_CATLOG_GOODS);
    }

    public static boolean isAutoCreateShareImage() {
        return getConfigBoolean(aiqc_WX_SHARE);
    }

    public static BigDecimal getFreight() {
        return getConfigBigDec(aiqc_EXPRESS_FREIGHT_VALUE);
    }

    public static BigDecimal getFreightLimit() {
        return getConfigBigDec(aiqc_EXPRESS_FREIGHT_MIN);
    }

    public static Integer getOrderUnpaid() {
        return getConfigInt(aiqc_ORDER_UNPAID);
    }

    public static Integer getOrderUnconfirm() {
        return getConfigInt(aiqc_ORDER_UNCONFIRM);
    }

    public static Integer getOrderComment() {
        return getConfigInt(aiqc_ORDER_COMMENT);
    }

    public static String getMallName() {
        return getConfig(aiqc_MALL_NAME);
    }

    public static String getMallAddress() {
        return getConfig(aiqc_MALL_ADDRESS);
    }

    public static String getMallPhone() {
        return getConfig(aiqc_MALL_PHONE);
    }

    public static String getMallQQ() {
        return getConfig(aiqc_MALL_QQ);
    }

    public static void setConfigs(Map<String, String> configs) {
        SYSTEM_CONFIGS = configs;
    }

    public static void updateConfigs(Map<String, String> data) {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            SYSTEM_CONFIGS.put(entry.getKey(), entry.getValue());
        }
    }
}