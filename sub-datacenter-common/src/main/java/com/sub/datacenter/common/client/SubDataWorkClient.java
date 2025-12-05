package com.sub.datacenter.common.client;


import com.sub.datacenter.common.client.fallback.SubDataWorkFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "sub-data-work",
        path = "/data-work",
        fallback = SubDataWorkFallback.class
)
public interface SubDataWorkClient {

    @GetMapping("/common/connCheck")
    String connCheck();


}
