package com.sinosoft.aiqc.asr.config;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.util.unit.DataSize;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import javax.servlet.MultipartConfigElement;

/**
 * Web配置文件,有如下设置：
 * <ul>
 * <li>设置允许GET、POST、OPTIONS请求(设置OPTIONS是为了支持跨域请求)
 * </ul>
 *
 * @author shaoxunxun
 *
 */
@Configuration
public class WebConfig {



    /**
     * 文件上传大小限制配置
     *
     * @return
     */
    @Bean
    public MultipartConfigElement multipartConfigElement() {

        MultipartConfigFactory factory = new MultipartConfigFactory();
        //  单个数据大小  20MB
        factory.setMaxFileSize(DataSize.ofMegabytes(20).toString());
        /// 总上传数据大小 500MB
        factory.setMaxRequestSize(DataSize.ofMegabytes(500).toString());
        return factory.createMultipartConfig();

    }

    /**
     * 跨域配置类
     *
     * @return
     */
    @Bean
    public CorsFilter corsFilter() {
        final UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        final CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod(HttpMethod.GET);
        corsConfiguration.addAllowedMethod(HttpMethod.POST);
        corsConfiguration.addAllowedMethod(HttpMethod.OPTIONS);
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter(urlBasedCorsConfigurationSource);
    }

}
