package com.liuyanqun.localproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liuyanqun.localproject.dao")
public class LocalProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocalProjectApplication.class, args);
    }

}
