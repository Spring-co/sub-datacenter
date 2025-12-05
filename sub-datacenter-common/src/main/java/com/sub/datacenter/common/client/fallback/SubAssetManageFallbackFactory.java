package com.sub.datacenter.common.client.fallback;

import com.sub.datacenter.common.client.SubAssetManageClient;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @ClassName SubAssetManageFallback
 * @Description: TODO
 * @Author Submerge.
 * @Since 2025/9/19 16:19
 * @Version 1.0
 */
@Component
public class SubAssetManageFallbackFactory implements FallbackFactory<SubAssetManageClient> {


    public String connCheck() {
        return "服务 >>>sub-asset-manage<<< 异常降级，请稍后再试！";
    }

    @Override
    public SubAssetManageClient create(Throwable cause) {
        System.out.println("调用 user-service 失败，触发降级。原因: "+ cause.getMessage());

        return new SubAssetManageClient() {
            @Override
            public String connCheck() {
                return "服务 >>>sub-asset-manage<<< 异常降级，请稍后再试！";
            }
        };
    }
}
