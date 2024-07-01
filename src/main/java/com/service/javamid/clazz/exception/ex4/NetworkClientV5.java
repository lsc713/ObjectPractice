package com.service.javamid.clazz.exception.ex4;

import com.service.javamid.clazz.exception.ex4.exception.ConnectExceptionV4;
import com.service.javamid.clazz.exception.ex4.exception.SendExceptionV4;

public class NetworkClientV5 implements AutoCloseable{
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV5(String address) {
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

    @Override
    public void close(){
        System.out.println("NetworkClientV5.close");
        disconnect();
    }
}
