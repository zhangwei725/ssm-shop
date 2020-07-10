package com.smart.shop.utils;

public enum ErrorStatus {
    SUCCESS(20000, "success", "成功"),

    POST_SUCCESS(20001, "success", "提交数据成功"),

    SERVICE_ERROR(40001, "service  error", "数据异常, 请重新在试"),

    DAO_ERROR(40001, "service  error", "数据层异常"),

    SYS_ERROR(40004, "sys  error", "系统繁忙, 请重新在试");

    int status;
    String msg;
    String tip;

    ErrorStatus(int status, String msg, String tip) {
        this.status = status;
        this.msg = msg;
        this.tip = tip;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
