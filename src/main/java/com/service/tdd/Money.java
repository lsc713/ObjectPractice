package com.service.tdd;

import java.util.Objects;

public class Money implements Expression{

    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    String currency(){
        return currency;
    }

    Money times(int multiplier){
        return new Money(amount*multiplier,currency);
    }

    public Expression plus(Money addend) {
        return new Sum(this,addend);
    }

    static Money dollar(int amount) {
        return new Money(amount,"USD");
    }

    static Money franc(int amount) {
        return new Money(amount,"CHF");
    }

    public boolean equals(Object object) {
        if (object == null) return false;
        if (!(object instanceof Money)) return false;
        Money money = (Money) object;
        return this.amount == money.amount && currency().equals(money.currency());
    }

    public int hashCode(){
        return Objects.hash(amount, currency);
    }

    public String toString(){
        return amount + " " + currency;
    }

    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }
}
