package com.service.javamid.immutable.change;

import com.service.javamid.immutable.ImmutableAddress;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public ImmutableObj add(int addValue) {
        return new ImmutableObj(value + addValue);
    }
}
