package com.service.javamid.clazz.exception.ex4.exception;

public class SendExceptionV4 extends NetworkClientExceptionV4 {
    private final String sendDate;
    public SendExceptionV4(String message, String sendDate) {
        super(message);
        this.sendDate = sendDate;
    }

    public String getSendDate() {
        return sendDate;
    }
}
