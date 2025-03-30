package com.sub.datacenter.service.rest.app;

import com.sub.datacenter.service.api.ICommonApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DemoController
 * @Description: TODO
 * @Author Submerge.
 * @Since 2024/6/11 16:22
 * @Version 1.0
 */
@RequestMapping("/demo")
@RestController
public class DemoController {


    @Autowired
    private ICommonApi commonApi;

    @GetMapping("/testApi")
    public Object testApi(){
        return commonApi.testApi();
    }
}
