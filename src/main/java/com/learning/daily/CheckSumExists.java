package com.learning.daily;

import java.util.LinkedHashSet;

/*
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
*/
public class CheckSumExists {
    public boolean checkSumExists(int[] inputArray, int sumToFind) {
        LinkedHashSet<Integer> inputSet = new LinkedHashSet<Integer>();
        for (int currentValue : inputArray) {
            int target = sumToFind - currentValue;
            if (inputSet.contains(target))
                return true;
            else
                inputSet.add(currentValue);
        }
        return false;
    }
}