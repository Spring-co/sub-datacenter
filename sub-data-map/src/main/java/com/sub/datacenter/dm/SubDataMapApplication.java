package com.sub.datacenter.dm;

import org.dromara.easyes.starter.register.EsMapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EsMapperScan("com.sub.datacenter.dm.mapper")
public class SubDataMapApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubDataMapApplication.class, args);
    }

}
