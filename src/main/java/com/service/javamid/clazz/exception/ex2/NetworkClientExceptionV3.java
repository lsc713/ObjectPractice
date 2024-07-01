package com.service.javamid.clazz.exception.ex2;

public class NetworkClientExceptionV3 extends Exception{
    private String errorCode;

    public NetworkClientExceptionV3(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
