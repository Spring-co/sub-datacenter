package com.sub.datacenter.service.rest.app;

import com.sub.datacenter.service.forest.CommonApiClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName CommonController
 * @Description: TODO
 * @Author Submerge.
 * @Since 2024/6/11 17:12
 * @Version 1.0
 */
@RequestMapping("/common")
@RestController
public class CommonController {

    @Resource
    private CommonApiClient apiClient;

    @GetMapping("/api")
    public Object api(String method,String url){
        return apiClient.api(method,url);
    }
}
