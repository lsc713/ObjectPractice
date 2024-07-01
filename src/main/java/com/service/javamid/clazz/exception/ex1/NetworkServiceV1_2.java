package com.service.javamid.clazz.exception.ex1;

public class NetworkServiceV1_2 {

    public void sendMessage(String data) {
        String address = "http://localhost:8080";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("error code " + connectResult);
            return;
        }

        String sendResult = client.send(data);
        if (isError(sendResult)) {
            System.out.println("error code " + sendResult);
            return;
        }

        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }

}
