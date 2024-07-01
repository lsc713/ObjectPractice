package com.service.javamid.clazz.exception.ex4;

public class NetworkServiceV5 {

    public void sendMessage(String data) {
        String address = "http://localhost:8080";

        try (NetworkClientV5 client = new NetworkClientV5(address)){
            client.initError(data);
            client.connect();
            client.send(data);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }

    }

}
