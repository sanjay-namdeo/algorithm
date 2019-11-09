package com.learning.daily;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ProductArrayPuzzleTest {
    @Test
    void testProductPuzzleWithDivison() {
        assertArrayEquals(ProductArrayPuzzle.getProductArrayWithDivision(new int[] { 1, 2, 3, 4, 5 }), new int[]{120,60,40,30,24});
        assertArrayEquals(ProductArrayPuzzle.getProductArrayWithDivision(new int[] { 10, 3, 5, 6, 2 }), new int[]{180,600,360,300,900});
    }

    @Test
    void testProductPuzzleWithoutDivison() {
        assertArrayEquals(ProductArrayPuzzle.getProductArrayWithoutDivision(new int[] { 1, 2, 3, 4, 5 }), new int[]{120,60,40,30,24});
        assertArrayEquals(ProductArrayPuzzle.getProductArrayWithoutDivision(new int[] { 10, 3, 5, 6, 2 }), new int[]{180,600,360,300,900});
    }
}