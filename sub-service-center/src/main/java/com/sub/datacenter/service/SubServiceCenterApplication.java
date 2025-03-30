package com.sub.datacenter.service;

import com.dtflys.forest.springboot.annotation.ForestScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName SubServiceCenterApplication
 * @Description: TODO
 * @Author Submerge.
 * @Since 2024/6/11 11:09
 * @Version 1.0
 */
//@ForestScan(basePackages = "com.sub.datacenter.service.api")
@SpringBootApplication
public class SubServiceCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(SubServiceCenterApplication.class,args);
    }
}
