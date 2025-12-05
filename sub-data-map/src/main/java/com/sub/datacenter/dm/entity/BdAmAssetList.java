package com.sub.datacenter.dm.entity;


import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.dromara.easyes.annotation.IndexField;
import org.dromara.easyes.annotation.IndexId;
import org.dromara.easyes.annotation.IndexName;
import org.dromara.easyes.annotation.rely.Analyzer;
import org.dromara.easyes.annotation.rely.FieldType;
import org.dromara.easyes.annotation.rely.IdType;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 资产管理-资产总表(BdAmAssetList)实体类
 *
 * @author Armeal
 * @since 2022-11-07 17:16:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@IndexName(value = "bd_am_asset_list")
public class BdAmAssetList implements Serializable {
    private static final long serialVersionUID = 837161322870170340L;

    @IndexId(type = IdType.CUSTOMIZE)
    private String id;

    @IndexField(fieldType = FieldType.KEYWORD)
    private Integer delFlag;

    /**创建时间*/
    @IndexField(fieldType = FieldType.DATE, dateFormat = "yyyy-MM-dd HH:mm:ss||yyyy-MM-dd||epoch_millis||yyyy-MM-dd'T'HH:mm:ss.SSS'Z'||yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private LocalDateTime createTime;

    @IndexField(fieldType = FieldType.DATE, dateFormat = "yyyy-MM-dd HH:mm:ss||yyyy-MM-dd||epoch_millis||yyyy-MM-dd'T'HH:mm:ss.SSS'Z'||yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private LocalDateTime updateTime;


    @IndexField(fieldType = FieldType.TEXT,analyzer = Analyzer.IK_MAX_WORD,searchAnalyzer = Analyzer.IK_MAX_WORD)
    private String assetName;

    /**
     * 资产类型 1:数据表资产 2:文件资产 3:接口资产
     */
    @IndexField(fieldType = FieldType.KEYWORD)
    private String assetType;


    @IndexField(fieldType = FieldType.TEXT,analyzer = Analyzer.IK_SMART)
    private String assetCode;

    /**
     * 数据资产简介
     */
    @IndexField(fieldType = FieldType.TEXT,analyzer = Analyzer.IK_SMART)
    private String assetIntroduction;

    /**
     * 部门挂载目录id
     */
    @IndexField(fieldType = FieldType.KEYWORD)
    private String deptDirId;

    /**
     * 行业目录id
     */
    @IndexField(fieldType = FieldType.KEYWORD)
    private String industryDirId;

    /**
     * 主题目录id
     */
    @IndexField(fieldType = FieldType.KEYWORD)
    private String themeDirId;


    /**
     * 接口状态(0草稿、1已上线、2已下架 3:已提交)
     * @link com.digitalgd.ds.datacenter.asset.common.constant.CommonConstants.AssetStatus
     */
    @IndexField(fieldType = FieldType.KEYWORD)
    private Integer assetStatus;


    @IndexField(fieldType = FieldType.TEXT,analyzer = Analyzer.IK_SMART)
    private String remarks;


}
