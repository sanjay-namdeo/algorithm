package com.learning.daily;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ElementAppearingOnceTest {
    @Test
    public void findElementAppearingOnceTest() {
        ElementAppearingOnce appearingOnce = new ElementAppearingOnce();
        assertEquals(2, appearingOnce.findNumberAppearingOnce(new int[] { 1, 1, 2, 5, 5 }));
        assertEquals(20, appearingOnce.findNumberAppearingOnce(new int[] { 2, 2, 5, 5, 20, 30, 30 }));
        assertEquals(17, appearingOnce.findNumberAppearingOnce(new int[] { 0, 0, 17, 34, 34 }));
        assertEquals(24, appearingOnce.findNumberAppearingOnce(
                new int[] { 5, 5, 8, 8, 11, 11, 12, 12, 14, 14, 24, 27, 27, 28, 28, 31, 31, 45, 45 }));

        assertEquals(45, appearingOnce.findNumberAppearingOnce(
                new int[] {2,2,3,3,4,4,27,27,32,32,36,36,41,41,42,42,45}));

    }
}