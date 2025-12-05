package com.sub.datacenter.dm.entity;

import org.dromara.easyes.annotation.IndexName;

@IndexName
public class Document {
    /**
     * es中的唯一id
     */	
    private String id;
    /**
     * 文档标题
     */
    private String title;
    /**
     * 文档内容
     */
    private String content;


    public void setContent(String content) {
        this.content = content;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
