package com.service.tdd;

import java.util.Objects;

public class Dollar {

    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(this.amount*multiplier);
    }

    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Dollar dollar = (Dollar) object;
        return this.amount == dollar.amount;
    }

    public int hashCode(){
        return Objects.hash(amount);
    }
}
