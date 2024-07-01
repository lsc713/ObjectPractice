package com.service.javamid.clazz.exception.ex3;

import com.service.javamid.clazz.exception.ex2.NetworkClientExceptionV3;
import com.service.javamid.clazz.exception.ex2.NetworkClientV2;
import com.service.javamid.clazz.exception.ex3.exception.ConnectExceptionV3;
import com.service.javamid.clazz.exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {

    public void sendMessage(String data) {
        String address = "http://localhost:8080";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);

        } catch (ConnectExceptionV3 e) {
            System.out.println(e.getAddress() + e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.println(e.getSendDate() + e.getSendDate());
        }finally {
            client.disconnect();

        }
    }

}
