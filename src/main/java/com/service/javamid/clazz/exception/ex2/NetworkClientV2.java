package com.service.javamid.clazz.exception.ex2;

public class NetworkClientV2 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV3 {
        if (connectError) {
            throw new NetworkClientExceptionV3("connectError", "failed connect");
        }
        System.out.println(address + " success");
    }

    public void send(String data) throws NetworkClientExceptionV3 {
        if (sendError) {
//            throw new NetworkClientExceptionV2("sendError", "failed send");
            throw new RuntimeException("ex");
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
