package com.sinosoft.aiqc.zj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.servlet.MultipartConfigElement;

@SpringBootApplication(scanBasePackages = {"com.sinosoft.aiqc.db", "com.sinosoft.aiqc.core", "com.sinosoft.aiqc.zj", "com.sinosoft.aiqc.asr"})
@MapperScan("com.sinosoft.aiqc.db.dao")
@EnableTransactionManagement
@EnableScheduling
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * @Description: 配置上传文件大小的配置
     * @Author: vdi100
     * @CreateDate: 2019/4/24 15:57
     * @Version: 1.0
     */
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        // 单个数据大小
        factory.setMaxFileSize("1024000KB");
        // 总上传数据大小
        factory.setMaxRequestSize("1024000KB");
        return factory.createMultipartConfig();
    }
}