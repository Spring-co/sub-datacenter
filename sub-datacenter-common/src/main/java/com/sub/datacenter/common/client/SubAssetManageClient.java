package com.sub.datacenter.common.client;


import com.sub.datacenter.common.client.fallback.SubAssetManageFallback;
import com.sub.datacenter.common.client.fallback.SubAssetManageFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "sub-asset-manage",
        path = "/asset",
        fallbackFactory = SubAssetManageFallbackFactory.class
)
public interface SubAssetManageClient {

    @GetMapping("/common/connCheck")
    String connCheck();
}
