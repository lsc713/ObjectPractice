package com.service.javamid.clazz.exception.basic.checked;

public class Service {
    Client client = new Client();

    public void callCatch() {
        try {
            client.call();
        } catch (MyCheckedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("flow~~");
    }

    public void catchThrow() throws MyCheckedException {
        client.call();
    }

}
