package com.sub.datacenter.common.client;


import com.sub.datacenter.common.client.fallback.SubServiceCenterFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "sub-service-center",
        path = "/service-center",
        fallback = SubServiceCenterFallback.class
)
public interface SubServiceCenterClient {

    @GetMapping("/common/visit")
    String visit();
}
