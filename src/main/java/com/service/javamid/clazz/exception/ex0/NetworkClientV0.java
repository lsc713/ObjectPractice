package com.service.javamid.clazz.exception.ex0;

public class NetworkClientV0 {
    private final String address;

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String connect() {
        System.out.println(address + " success");
        return "success";
    }

    public String send(String data) {
        System.out.println("send" + data);
        return "success";
    }

    public void disconnect() {
        System.out.println("disconnect");
    }
}
