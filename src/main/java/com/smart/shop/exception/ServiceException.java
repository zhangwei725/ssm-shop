package com.smart.shop.exception;

import com.smart.shop.utils.ErrorStatus;
import org.aspectj.lang.annotation.Aspect;


public class ServiceException extends Exception {
    private String msg;
    private int status;

    public ServiceException(String msg, int status) {
        this.msg = msg;
        this.status = status;
    }

    public ServiceException(ErrorStatus status) {
        this.msg = status.getMsg();
        this.status = status.getStatus();
    }
}
