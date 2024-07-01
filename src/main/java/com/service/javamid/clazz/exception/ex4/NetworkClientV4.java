package com.service.javamid.clazz.exception.ex4;

import com.service.javamid.clazz.exception.ex3.exception.ConnectExceptionV3;
import com.service.javamid.clazz.exception.ex3.exception.SendExceptionV3;
import com.service.javamid.clazz.exception.ex4.exception.ConnectExceptionV4;
import com.service.javamid.clazz.exception.ex4.exception.SendExceptionV4;

public class NetworkClientV4 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV4(String address) {
        this.address = address;
    }

    public void connect() {
        if (connectError) {
            throw new ConnectExceptionV4("connectError", "failed connect");
        }
        System.out.println(address + " success");
    }

    public void send(String data) {
        if (sendError) {
            throw new SendExceptionV4("sendError", data);
        }
        System.out.println("send" + data);
    }

    public void disconnect() {
        System.out.println("disconnect");

    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }

}
