package com.along.sofademo.services;

/**
 * @author: zhengjianglong
 * @create: 2018-08-05 20:28
 */
public class SampleJvmServiceImpl implements SampleJvmService {
    private String message;

    public SampleJvmServiceImpl(String message) {
        this.message = message;
    }

    public SampleJvmServiceImpl() {
    }

    public String message() {
        return message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}