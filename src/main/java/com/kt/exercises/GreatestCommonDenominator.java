package com.kt.exercises;

import java.util.ArrayList;
import java.util.List;

class GreatestCommonDenominator {
    public static void main(String[] args) {

//        This problem was asked by Amazon.
//        Given n numbers, find the greatest common denominator between them.
//        For example, given the numbers [42, 56, 14], return 14.

        int[] input = {42, 56, 14, 2, 7};
        int min = input[0];
        boolean denmoinatorExist = false;

        for (int i = 1; i < input.length; i++) {
            if (input[i] < min) {
                min = input[i];
            }
        }

        for (int i = min; i >= 1; i--) {
            for (int k : input) {
                if (k % i != 0) {
                    denmoinatorExist = false;
                    break;
                } else {
                    denmoinatorExist = true;
                }
            }
            if (denmoinatorExist) {
                System.out.println(i);
                break;
            }
        }
    }
}
