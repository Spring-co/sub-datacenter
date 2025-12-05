package com.sub.datacenter.common.client.fallback;

import com.sub.datacenter.common.client.SubDataWorkClient;
import org.springframework.stereotype.Component;

/**
 * @ClassName SubAssetManageFallback
 * @Description: TODO
 * @Author Submerge.
 * @Since 2025/9/19 16:19
 * @Version 1.0
 */
@Component
public class SubDataWorkFallback implements SubDataWorkClient {


    @Override
    public String connCheck() {
        return "服务 >>>sub-data-work<<< 异常降级，请稍后再试！";
    }
}
