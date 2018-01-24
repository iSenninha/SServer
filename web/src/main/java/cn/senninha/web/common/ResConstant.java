package cn.senninha.web.common;

/**
 * Json信息枚举
 * Coded by senninha on 18-1-22
 */
public enum ResConstant {
    LOGIN(0, "已经登陆"),
    NOT_LOGIN(-1, "未登陆"),
    ;


    private int code;
    private String info;

    public String getInfo(){
        return info;
    }

    public int getCode(){
        return code;
    }

    private ResConstant(int code, String info){
        this.code = code;
        this.info = info;
    }
}
