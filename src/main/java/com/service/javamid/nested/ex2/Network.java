
package com.service.javamid.nested.ex2;

import com.service.javamid.nested.ex1.NetworkMessage;

public class Network {

    public void sendMessage(String txt) {
        NetworkMessage message = new NetworkMessage(txt);
        message.print();
    }


    private static class NetworkMessage {

        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }


}
