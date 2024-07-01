package com.service.javamid.clazz.exception.ex2;

public class NetworkServiceV2_4 {

    public void sendMessage(String data) {
        String address = "http://localhost:8080";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);

        } catch (NetworkClientExceptionV3 e) {
            System.out.println(e.getErrorCode() + "error" + e.getErrorCode());
        }

        client.disconnect();
    }

}
