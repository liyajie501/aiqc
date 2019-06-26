package com.sinosoft.aiqc.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.sinosoft.aiqc.db", "com.sinosoft.aiqc.core"})
@MapperScan("com.sinosoft.aiqc.db.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}