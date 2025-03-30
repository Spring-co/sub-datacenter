package com.sub.datacenter.service.forest;


import com.dtflys.forest.annotation.Request;
import com.dtflys.forest.annotation.Var;

public interface CommonApiClient {

    @Request(type = "{method}" ,url = "{requestUrl}")
    Object api(@Var("method") String method,@Var("url") String requestUrl);

}
