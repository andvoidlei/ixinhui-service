package com.andvoid.ixinhui.dto;


import java.util.List;
import java.util.Map;

public class News {


    /**
     * 用户名称
     */
    private String code;
    /**
     * 平台
     */
    private Map data;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Map getData() {
        return data;
    }

    public void setData(Map data) {
        this.data = data;
    }
}