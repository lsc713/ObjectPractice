package com.service.javamid.clazz.exception.basic.unchecked;

public class Client {

    public void call() {
        throw new MyUncheckedException("ex");
    }

}
