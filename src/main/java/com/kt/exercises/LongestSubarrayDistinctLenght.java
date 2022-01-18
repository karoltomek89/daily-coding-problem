package com.kt.exercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class LongestSubarrayDistinctLenght {


//    This problem was asked by Google.
//
//    Given an array of elements, return the
//    length of the longest subarray where all its elements are distinct.
//
//    For example, given the array [5, 1, 3, 5, 2, 3, 4, 1],
//    return 5 as the longest subarray of distinct elements is [5, 2, 3, 4, 1].

    public static void main(String[] args) {
        int[] input = {5, 1, 3, 5, 2, 3, 4, 1};

        int maximumLenght = 0;

        Set<Integer> subarrayDist = new HashSet<>();

        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                if (!subarrayDist.contains(input[j])) {
                    subarrayDist.add(input[j]);

                    if (maximumLenght <= subarrayDist.size()) {
                        maximumLenght = subarrayDist.size();
                    }
                } else {
                    subarrayDist = new HashSet<>();
                    break;
                }
            }
        }
        System.out.println(maximumLenght);
    }
}
