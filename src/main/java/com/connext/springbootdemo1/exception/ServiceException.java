package com.connext.springbootdemo1.exception;

/**
 * @author Chuckie
 * @Description
 * @date 19-3-21
 */
public class ServiceException extends RuntimeException  {
    public ServiceException(String msg) {
        super(msg);
    }
}
