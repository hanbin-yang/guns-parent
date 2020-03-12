package com.stylefeng.guns.rest;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.stylefeng.guns"})
@DubboComponentScan(basePackages = "com.stylefeng.guns.rest.modular.film.impl")
public class FilmStartApp {

    public static void main(String[] args) {
        SpringApplication.run(FilmStartApp.class, args);
    }
}
