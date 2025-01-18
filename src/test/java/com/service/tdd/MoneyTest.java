package com.service.tdd;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoneyTest {

    @Test
    void testMultiplication(){
        Money five = Money.dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    void testEquality(){
        assertEquals(new Dollar(5),(new Dollar(5)));
        assertNotEquals(new Dollar(5),(new Dollar(6)));
        assertEquals(new Franc(5),(new Franc(5)));
        assertNotEquals(new Franc(5),(new Franc(6)));
        assertNotEquals(new Franc(5),(new Dollar(5)));
    }
}
