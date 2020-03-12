package com.stylefeng.guns.rest;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.stylefeng.guns"})
@DubboComponentScan(basePackages = "com.stylefeng.guns.rest.modular.order.impl")
public class OrderStartApp {

    public static void main(String[] args) {
        SpringApplication.run(OrderStartApp.class, args);
    }
}
