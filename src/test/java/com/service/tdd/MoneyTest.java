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
}
