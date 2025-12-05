package com.sub.datacenter.asset.rest.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName AssetController
 * @Description: TODO
 * @Author Submerge.
 * @Since 2025/9/19 16:23
 * @Version 1.0
 */
@RestController
@RequestMapping("/common")
public class AssetCommonController {

    @GetMapping("/connCheck")
    public String connCheck(){
        throw new RuntimeException("模拟服务异常");
        //return "service >>>sub-asset-manage<<< connection success!";
    }
}
