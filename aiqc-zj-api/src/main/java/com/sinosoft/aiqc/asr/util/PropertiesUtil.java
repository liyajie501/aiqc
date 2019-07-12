package com.sinosoft.aiqc.asr.util;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by sys on 2018/1/10.
 */
public class PropertiesUtil {
    public static String getPropertyWithPath(String path, String propertyName){
        Properties properties = getPropertiesByPath(path);
        return properties.getProperty(propertyName);
    }

    public static Properties getPropertiesByPath(String path){
        Properties properties = new Properties();
        try {
            properties.load(PropertiesUtil.class.getResourceAsStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
