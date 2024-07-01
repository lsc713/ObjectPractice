package com.service.javamid.clazz.exception.ex4;

import com.service.javamid.clazz.exception.ex3.NetworkClientV3;
import com.service.javamid.clazz.exception.ex3.exception.ConnectExceptionV3;
import com.service.javamid.clazz.exception.ex3.exception.SendExceptionV3;
import com.service.javamid.clazz.exception.ex4.exception.ConnectExceptionV4;
import com.service.javamid.clazz.exception.ex4.exception.SendExceptionV4;

public class NetworkServiceV4 {

    public void sendMessage(String data) {
        String address = "http://localhost:8080";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);

        } finally {
            client.disconnect();

        }
    }

}
