package com.service.javamid.clazz.exception.ex0;

public class NetworkServiceV0 {

    public void sendMessage(String data) {
        String address = "http://localhost:8080";
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }

}
