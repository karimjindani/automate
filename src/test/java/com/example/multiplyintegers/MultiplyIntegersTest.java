package com.example.multiplyintegers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplyIntegersTest {

    @Test
    public void testSingleNumber() {
        int result = MultiplyIntegers.multiply("5");
        assertEquals(5, result);
    }

    @Test
    public void testTwoNumbers() {
        int result = MultiplyIntegers.multiply("5", "6");
        assertEquals(30, result);
    }

    @Test
    public void testThreeNumbers() {
        int result = MultiplyIntegers.multiply("5", "6", "7");
        assertEquals(210, result);
    }

}
