package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAddition() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, calc.divide(10, 5));
        assertThrows(IllegalArgumentException.class, () -> calc.divide(1, 0));
    }

    @Test
    void testArrayEquals() {
        assertArrayEquals(new int[]{1, 2, 3}, calc.getArray());
    }

    @Test
    void testNullAndNotNull() {
        assertNotNull(calc.getGreeting(true));
        assertNull(calc.getGreeting(false));
    }

    @Test
    void testTrueAndFalse() {
        assertTrue(calc.add(2, 2) == 4);
        assertFalse(calc.add(2, 2) == 5);
    }
}
