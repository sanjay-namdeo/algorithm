package com.learning.daily;

import java.util.Arrays;

/**
 * Given an array of integers, return a new array such that each element at
 * index i of the new array is the product of all the numbers in the original
 * array except the one at i. For example, if our input was [1, 2, 3, 4, 5], the
 * expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1],
 * the expected output would be [2, 3, 6]. Follow-up: what if you can't use
 * division?
 */
public class ProductArrayPuzzle {
    public static void main(String[] args) {
        int[] result = getProductArrayWithoutDivision(new int[] { 1, 2, 3, 4, 5 });
        Arrays.asList(result).stream().forEach(x -> System.out.println(x));
    }

    /**
     * product all array element, save the result. Loop over all elements and set
     * new array as product divided by current element
     */
    public static int[] getProductArrayWithDivision(int[] inputArray) {
        int[] newArray = new int[inputArray.length];

        int product = 1;
        for (int i = 0; i < inputArray.length; i++) {
            product = product * inputArray[i];
        }

        for (int i = 0; i < inputArray.length; i++) {
            newArray[i] = product / inputArray[i];
        }

        return newArray;
    }

    public static int[] getProductArrayWithoutDivision(int[] inputArray) {
        int[] newArray = new int[inputArray.length];

        int temp = 1;

        // temp will contain product o all numbers to the left
        for (int i = 0; i < inputArray.length; i++) {
            newArray[i] = temp;
            temp = temp * inputArray[i];
        }

        temp = 1;

        for (int i = newArray.length - 1; i >= 0; i--) {
            newArray[i] = newArray[i] * temp;
            temp = temp * inputArray[i];
        }

        return newArray;
    }
}
