package com.service.javamid.nested.ex1;

public class Network {

    public void sendMessage(String txt) {
        NetworkMessage message = new NetworkMessage(txt);
        message.print();
    }

}
