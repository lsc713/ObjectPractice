package com.service.javamid.clazz.exception.basic.unchecked;

public class Service {

    Client client = new Client();
    public void callCatch() {
        try {
            client.call();
        } catch (MyUncheckedException e) {
            System.out.println("unchecked exception" + e.getMessage());
        }
        System.out.println("정상출력");
    }

    public void callThrow() {
        client.call();
    }

}
