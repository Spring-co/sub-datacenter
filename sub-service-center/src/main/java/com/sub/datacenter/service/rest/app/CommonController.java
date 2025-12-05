package com.sub.datacenter.service.rest.app;

import com.sub.datacenter.common.client.SubAssetManageClient;
import com.sub.datacenter.common.client.SubDataWorkClient;
import com.sub.datacenter.service.forest.CommonApiClient;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private SubAssetManageClient assetManageClient;

    @Autowired
    private SubDataWorkClient dataWorkClient;

    @GetMapping("/api")
    public Object api(String method,String url){
        return apiClient.api(method,url);
    }

    @GetMapping("/visit")
    public String visit(){
        return "service >>>sub-service-center<<< visit success!";
    }

    @GetMapping("/visitAsset")
    public String visitAsset(){
        return assetManageClient.connCheck();
    }

    @GetMapping("/visitDataWork")
    public String visitDataWork(){
        return dataWorkClient.connCheck();
    }
}
