package com.service.tdd;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoneyTest {

    @Test
    void testMultiplication(){
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    void testCurrency(){
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    void testEquality(){
        assertEquals( Money.dollar(5),Money.dollar(5));
        assertNotEquals(Money.franc(5),Money.franc(6));
        assertNotEquals(Money.franc(5),Money.dollar(5));
    }

    @Test
    void testSimpleAdd(){
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        assertEquals(five, sum.augend);
        assertEquals(five, sum.addend);
    }

    @Test
    void testReduceSum(){
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1), "USD");
        assertEquals(result, Money.dollar(1));
    }

    @Test
    void testReduceMoneyDifferentCurrency(){
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        bank.addRate("USD", "CHF", 1);
        Money result = bank.reduce(Money.dollar(1), "CHF");
        assertEquals(Money.franc(1), result);
    }
}
