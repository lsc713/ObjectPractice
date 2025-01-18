package com.service.tdd;

import java.util.Objects;

public abstract class Money {

    protected int amount;

    static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    abstract Money times(int multiplier);

    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Money money = (Money) object;
        return this.amount == money.amount;
    }

    public int hashCode(){
        return Objects.hash(amount);
    }
}
