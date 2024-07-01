package com.service.javamid.clazz.exception.ex1;

import com.service.javamid.clazz.exception.ex0.NetworkClientV0;

public class NetworkServiceV1_1 {

    public void sendMessage(String data) {
        String address = "http://localhost:8080";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();
    }

}
