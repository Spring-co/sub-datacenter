package com.sub.datacenter.service.api;


import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.JSONBody;
import com.dtflys.forest.annotation.Post;
import com.dtflys.forest.annotation.XMLBody;

import java.util.Map;


public interface ICommonApi {

    /**
     * 聪明的你一定看出来了@Get注解代表该方法专做GET请求
     * 在url中的{0}代表引用第一个参数，{1}引用第二个参数
     */
    @Get("http://172.16.32.23:31191/szrzyt/data_center/gateway/asset/bdAmAssetCatalog/getSmallCount")
    Object testApi();


    /**
     * JSON
     */


    /**
     * 将对象参数解析为JSON字符串，并放在请求的Body进行传输
     */
    @Post("/register")
    String registerUser(@JSONBody Map user);

    /**
     * 将Map类型参数解析为JSON字符串，并放在请求的Body进行传输
     */
    @Post("/test/json")
    String postJsonMap(@JSONBody Map mapObj);

    /**
     * 直接传入一个JSON字符串，并放在请求的Body进行传输
     */
    @Post("/test/json")
    String postJsonText(@JSONBody String jsonText);



    /**
     * XML
     */


    /**
     * 将一个通过JAXB注解修饰过的类型对象解析为XML字符串
     * 并放在请求的Body进行传输
     */
    @Post("/message")
    String sendXmlMessage(@XMLBody Map message);

    /**
     * 直接传入一个XML字符串，并放在请求的Body进行传输
     */
    @Post("/test/xml")
    String postXmlBodyString(@XMLBody String xml);

}
