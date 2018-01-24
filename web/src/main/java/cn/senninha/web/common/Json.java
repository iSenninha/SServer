package cn.senninha.web.common;

import java.util.HashMap;

/**
 * 通用Json模板
 * Coded by senninha on 18-1-22
 */
public class Json {
    private int code;
    private String info;
    private Object data;

    public static Json valueOf(ResConstant resConstant){
        Json j = new Json();
        j.setCode(resConstant.getCode());
        j.setInfo(resConstant.getInfo());
        j.setData(new HashMap<>());
        return j;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
