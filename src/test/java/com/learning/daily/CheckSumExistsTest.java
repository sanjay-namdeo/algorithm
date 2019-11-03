package com.learning.daily;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
*/
public class CheckSumExistsTest {
    @Test
    public void checkSumExists() {
        CheckSumExists checkSumExists = new CheckSumExists();

        // Test 1 - true
        assertEquals(true, checkSumExists.checkSumExists(new int[] { 10, 15, 3, 7 }, 17));

        // Test 2 - false
        assertEquals(false, checkSumExists.checkSumExists(new int[] { 10, 15, 3, 7 }, 19));

        // Test 3 - false
        assertEquals(false, checkSumExists.checkSumExists(new int[] { 10, 15, 3, 7 }, 0));

        // Test 4 - true
        assertEquals(true, checkSumExists.checkSumExists(new int[] { 10, 15, 3, 7 }, 10));

        // Test 5 - false
        assertEquals(false, checkSumExists.checkSumExists(new int[] { 10, 15, 3, 7 }, 50));

        // Test 6 - false
        assertEquals(false, checkSumExists.checkSumExists(new int[] { 10, 15, 3, 7 }, 16));

        // Test 7 - false
        assertEquals(false, checkSumExists.checkSumExists(new int[] { 10, 15, 3, 7 }, -20));

        // Test 8 - true
        assertEquals(true, checkSumExists.checkSumExists(new int[] { 10, 15, 3, 7 }, 25));

        // Test 9 - true
        assertEquals(true, checkSumExists.checkSumExists(new int[] { 10, 15, 3, 7 }, 13));

        // Test 10 - true
        assertEquals(true, checkSumExists.checkSumExists(new int[] { 10, 15, 3, 7 }, 18));

        // Test 11 - true
        assertEquals(true, checkSumExists.checkSumExists(new int[] { 10, 15, 3, 7 }, 22));
    }
}