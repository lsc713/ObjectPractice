package com.service.javamid2.generic.test.ex1;

public class Container<T> {

    private T value;
    public boolean isEmpty() {
        return value == null;
    }


    public void setItem(T data1) {
        this.value = data1;
    }


    public T getItem() {
        return value;
    }

}
