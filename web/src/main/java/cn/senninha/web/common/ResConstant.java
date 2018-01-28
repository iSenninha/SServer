package cn.senninha.web.common;

/**
 * Json信息枚举
 * Coded by senninha on 18-1-22
 */
public enum ResConstant {
    LOGIN(0, "已经登陆"),
    NOT_LOGIN(-1, "未登陆"),
    SUCCESS(0, "成功"),
    DONT_EXIST(1, "不存在的协议"),

    /**-----通用类-------------*/
    MISS_PARAM(1, "缺少参数");
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
