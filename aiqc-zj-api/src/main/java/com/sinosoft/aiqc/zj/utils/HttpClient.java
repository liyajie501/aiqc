package com.sinosoft.aiqc.zj.utils;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.util.StringUtil;
import com.sinosoft.aiqc.zj.common.Contanst;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class HttpClient {
    private static Logger logger = Logger.getLogger(HttpClient.class);

    public static String post(String url, String data, boolean needResponse) {
        DefaultHttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(url);

        try {
            if (!StringUtils.isEmpty(data)) {
                StringEntity entity = new StringEntity(data, "utf-8");
                entity.setContentEncoding("UTF-8");
                entity.setContentType("application/json");
                post.setEntity(entity);
            }

            HttpResponse result = client.execute(post);
            if (!needResponse) {
                return null;
            }

            if (result.getStatusLine().getStatusCode() == 200) {
                return EntityUtils.toString(result.getEntity());
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            return Contanst.ERROR + "";
        }

        logger.error("post请求" + url + "地址失败！");
        return Contanst.ERROR + "";
    }

    public static String post(String url, String data, boolean needResponse, boolean needEncode) {
        try {
            if (needEncode) {
                url = URLDecoder.decode(url, "UTF-8");
            }
        } catch (UnsupportedEncodingException var5) {
            var5.printStackTrace();
            throw new RuntimeException("url编码异常");
        }

        return post(url, data, needResponse);
    }

    public static String post(String url, String data, boolean needResponse, boolean needEncode, String encodeType) {
        try {
            if (needEncode && StringUtil.isNotEmpty(encodeType)) {
                url = URLDecoder.decode(url, encodeType);
            }
        } catch (UnsupportedEncodingException var6) {
            var6.printStackTrace();
            throw new RuntimeException("url编码异常,编码格式为：" + encodeType);
        }

        return post(url, data, needResponse);
    }

    public static String post(String url, String data) {
        return post(url, data, true);
    }

    public static String post(String url) {
        return post(url, (String)null, true);
    }

}
