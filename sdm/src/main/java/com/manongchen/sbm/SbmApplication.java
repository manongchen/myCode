package com.manongchen.sbm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.manongchen.sbm.**.dao")
public class SbmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbmApplication.class, args);
    }

}
