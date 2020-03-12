package com.stylefeng.guns.rest;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.stylefeng.guns"})
@DubboComponentScan(basePackages = "com.stylefeng.guns.rest.modular.user.impl")
public class UserStartApp {

    public static void main(String[] args) {
        SpringApplication.run(UserStartApp.class, args);
    }
}
