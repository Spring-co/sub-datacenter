package com.sub.datacenter.common.client.fallback;

import com.sub.datacenter.common.client.SubAssetManageClient;
import org.springframework.stereotype.Component;

/**
 * @ClassName SubAssetManageFallback
 * @Description: TODO
 * @Author Submerge.
 * @Since 2025/9/19 16:19
 * @Version 1.0
 */
@Component
public class SubAssetManageFallback implements SubAssetManageClient {


    @Override
    public String connCheck() {
        return "服务 >>>sub-asset-manage<<< 异常降级，请稍后再试！";
    }
}
