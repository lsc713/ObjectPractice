package com.service.javamid.clazz.exception.ex3;

import com.service.javamid.clazz.exception.ex2.NetworkClientExceptionV3;
import com.service.javamid.clazz.exception.ex3.exception.ConnectExceptionV3;
import com.service.javamid.clazz.exception.ex3.exception.SendExceptionV3;

public class NetworkClientV3 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV3(String address) {
        this.address = address;
    }

    public void connect() throws ConnectExceptionV3 {
        if (connectError) {
            throw new ConnectExceptionV3("connectError", "failed connect");
        }
        System.out.println(address + " success");
    }

    public void send(String data) throws SendExceptionV3 {
        if (sendError) {
            throw new SendExceptionV3("sendError", data);
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
