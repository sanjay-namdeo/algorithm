package com.learning.daily;

import java.util.HashMap;
import java.util.Map;

/*
 *Given an sorted array A[i] of N positive integers having all the numbers occuring exactly twice, 
 *except for one number which will occur only once. Find the number occuring only once.
 */

public class ElementAppearingOnce {
    public int findNumberAppearingOnce(int[] inputArray) {
        int result = inputArray[0];
        for(int i = 1;i<inputArray.length; i++) {
            result = result ^ inputArray[i];
        }
        return result;
    }

    public int findNumberAppearingOnce2(int[] inputArray) {
        HashMap<Integer, Integer> elementMap = new HashMap<>();
        for (int currentNumber : inputArray) {
            int count = 0;
            if(elementMap.containsKey(currentNumber))
                count = elementMap.get(currentNumber) + 1;
            else
                count = 1;
            elementMap.put(currentNumber, count);
        }
        System.out.println(elementMap);

        int value = elementMap.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst()
                .orElseGet(() -> -1);

        return value;
    }
}

/*
 * Input The first line of input contains an integer T denoting the number of
 * test cases. Then T test cases follow. The first line of each test case
 * contains a positive integer N, denoting the size of the array. The second
 * line of each test case contains a N positive integers, denoting the elements
 * of the array.
 * 
 * Output Print out the singly occuring number.
 * 
 * Constraints 1 <= T <= 100 0 < N <= 100 0 <= A[i] <= 100
 * 
 * Examples
 * 
 * Input 2 
 * 5 
 * 1 1 2 5 5 
 * 
 * 7 
 * 2 2 5 5 20 30 30
 *  
 * Output 2 20
 * 
 * 
 * Expected Complexity
 * 
 * Time : O(N)
 */