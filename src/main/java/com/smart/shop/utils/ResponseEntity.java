package com.smart.shop.utils;

import lombok.Data;

@Data
public class ResponseEntity<T> {
    private int status;
    private String msg;
    private T data;

    public static <T> ResponseEntity<T> success(T data) {
        ResponseEntity<T> entity = new ResponseEntity<>();
        entity.setData(data);
        entity.setMsg(ErrorStatus.SUCCESS.getMsg());
        entity.setStatus(ErrorStatus.SUCCESS.getStatus());
        return entity;
    }

    public static <T> ResponseEntity<T> success(ErrorStatus status, T data) {
        ResponseEntity<T> entity = new ResponseEntity<>();
        entity.setData(data);
        entity.setMsg(status.getMsg());
        entity.setStatus(status.getStatus());
        return entity;
    }

    public static <T> ResponseEntity<T> error() {
        ResponseEntity<T> entity = new ResponseEntity<>();
        entity.setMsg(StatusConstants.SUCCESS);
        entity.setStatus(StatusConstants.SUCCESS_CODE);
        return entity;
    }

    public static <T> ResponseEntity<T> error(ErrorStatus status) {
        ResponseEntity<T> entity = new ResponseEntity<>();
        entity.setMsg(status.getMsg());
        entity.setStatus(status.getStatus());
        return entity;
    }
}
