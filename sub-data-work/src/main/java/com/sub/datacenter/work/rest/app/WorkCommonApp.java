package com.sub.datacenter.work.rest.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName WorkCommonApp
 * @Description: TODO
 * @Author Submerge.
 * @Since 2025/9/19 16:40
 * @Version 1.0
 */
@RestController
@RequestMapping("/common")
public class WorkCommonApp {

    @GetMapping("/connCheck")
    public String connCheck(){
        return "service >>>sub-data-work<<< connection success!";
    }
}
