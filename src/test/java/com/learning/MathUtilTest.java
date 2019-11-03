package com.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathUtilTest {
    @Test
    void test() {
        MathUtil mathUtil = new MathUtil();
        int expected = 3;
        int actual = mathUtil.add(1, 1);
        assertEquals(expected, actual, "The add method should add two numbers");
    }
}