package com.sub.datacenter.common.client.fallback;

import com.sub.datacenter.common.client.SubServiceCenterClient;
import org.springframework.stereotype.Component;

/**
 * @ClassName SubAssetManageFallback
 * @Description: 降级处理类
 * @Author Submerge.
 * @Since 2025/9/19 16:19
 * @Version 1.0
 */
@Component
public class SubServiceCenterFallback implements SubServiceCenterClient {


    @Override
    public String visit() {
        return "服务 >>>sub-service-center<<< 异常，请稍后再试！";
    }
}
