package com.sub.datacenter.dm.controller;

import com.sub.datacenter.dm.entity.BdAmAssetList;
import com.sub.datacenter.dm.mapper.BdAmAssetListMapper;
import com.sub.datacenter.dm.mapper.DocumentMapper;
import org.dromara.easyes.common.utils.StringUtils;
import org.dromara.easyes.core.biz.EsPageInfo;
import org.dromara.easyes.core.conditions.select.LambdaEsQueryWrapper;
import org.dromara.easyes.core.core.Wrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DataSearchController
 * @Description: TODO
 * @Author Submerge.
 * @Since 2025/8/28 10:40
 * @Version 1.0
 */
@RestController
@RequestMapping("/search")
public class DataSearchController {


    @Autowired
    private DocumentMapper documentMapper;

    @Autowired
    private BdAmAssetListMapper bdAmAssetListMapper;



    @GetMapping("/createIdx")
    public boolean createIndex(){
        String fp= "D:\\Keep-Update\\Study-Way\\projects\\sub-datacenter\\sub-data-map\\res\\kingbase8-8.6.0.jar";
        return bdAmAssetListMapper.createIndex();
    }



    @GetMapping("/search")
    public EsPageInfo<BdAmAssetList> searchAsset(@RequestParam(required = false) String keyword,@RequestParam(defaultValue = "1") Integer pageNo,@RequestParam(defaultValue = "10") Integer pageSize){
        LambdaEsQueryWrapper<BdAmAssetList> wrapper = new LambdaEsQueryWrapper<>();

        //门户搜索查已上线、未删除
        wrapper.eq(BdAmAssetList::getAssetStatus,1);
        wrapper.eq(BdAmAssetList::getDelFlag,0);
        //根据搜索条件可查：资产名称，资产编码，资产简介，备注信息、
        if(StringUtils.isNotBlank(keyword)){
            wrapper.multiMatchQuery(keyword,BdAmAssetList::getAssetCode,
                    BdAmAssetList::getAssetName,
                    BdAmAssetList::getAssetIntroduction,
                    BdAmAssetList::getRemarks);
        }

        wrapper.orderByDesc(BdAmAssetList::getUpdateTime);


        EsPageInfo<BdAmAssetList> pageInfo = bdAmAssetListMapper.pageQuery(wrapper, pageNo, pageSize);

        System.out.println(".....");

        return pageInfo;
    }




}
