package com.elltor.demo.service;

import com.alibaba.fastjson.JSON;

public class MyJsonService {
    // 前缀
    private String prefixName;
    // 后缀
    private String suffixName;

    public String objectToJson(Object o){
        return prefixName+JSON.toJSONString(o)+suffixName;
    }

    public String getPrefixName() {
        return prefixName;
    }

    public void setPrefixName(String prefixName) {
        this.prefixName = prefixName;
    }

    public String getSuffixName() {
        return suffixName;
    }

    public void setSuffixName(String suffixName) {
        this.suffixName = suffixName;
    }
}
