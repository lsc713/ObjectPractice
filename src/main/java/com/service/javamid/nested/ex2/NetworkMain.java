package com.service.javamid.nested.ex2;

import com.service.javamid.nested.ex1.Network;

public class NetworkMain {

    public static void main(String[] args) {
        com.service.javamid.nested.ex1.Network network = new Network();
        network.sendMessage("Hello");
    }

}
