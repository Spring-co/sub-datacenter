package com.sub.datacenter.service;

import com.dtflys.forest.springboot.annotation.ForestScan;
import com.sub.datacenter.common.client.SubAssetManageClient;
import com.sub.datacenter.common.client.SubDataWorkClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName SubServiceCenterApplication
 * @Description: TODO
 * @Author Submerge.
 * @Since 2024/6/11 11:09
 * @Version 1.0
 */
//@ForestScan(basePackages = "com.sub.datacenter.service.api")
@EnableFeignClients(basePackageClasses = {
        SubAssetManageClient.class, SubDataWorkClient.class
})
//@EnableCircuitBreaker // 启用 Hystrix
@SpringBootApplication(scanBasePackages = "com.sub.datacenter")
public class SubServiceCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(SubServiceCenterApplication.class,args);
    }
}
