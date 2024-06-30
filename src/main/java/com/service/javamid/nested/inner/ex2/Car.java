package com.service.javamid.nested.inner.ex2;

import com.service.javamid.nested.inner.ex1.Engine;

public class Car {

    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
        System.out.println(model + "start");
    }


    private class Engine {

        public void start() {
            System.out.println(chargeLevel);
            System.out.println(model);
        }

    }

}
