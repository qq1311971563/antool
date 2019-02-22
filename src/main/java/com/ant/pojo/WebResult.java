package com.ant.pojo;

public class WebResult {
    public static final int SUCCESS = 200;
    private Integer state;
    private String message;
    private Object data;

    public static WebResult build(Integer state, String message, Object data) {
        return new WebResult(state, message, data);
    }

    public static WebResult build(Integer state, String message) {
        return new WebResult(state, message, null);
    }

    public static WebResult ok() {
        return new WebResult(200, "操作成功。", null);
    }

    public static WebResult ok(String message) {
        return new WebResult(200, message, null);
    }

    public static WebResult ok(Object data) {
        return new WebResult(200, "", data);
    }

    public static WebResult ok(String message, Object data) {
        return new WebResult(200, message, data);
    }

    public static WebResult error() {
        return new WebResult(400, "请求出错，请检查内容后重试。", null);
    }

    public static WebResult error(String message) {
        return new WebResult(400, message, null);
    }

    public static WebResult errorService() {
        return new WebResult(500, "服务器异常，请稍后重试。", null);
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private WebResult() {

    }

    private WebResult(Integer state, String message, Object data) {
        this.state = state;
        this.message = message;
        this.data = data;
    }
}
