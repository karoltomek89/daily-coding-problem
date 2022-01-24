package com.kt.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IntervalsNonOverlapping {
    public static void main(String[] args) {

//        This problem was asked by Stripe.
//        Given a collection of intervals,
//        find the minimum number of intervals
//        you need to remove to make the
//        rest of the intervals non-overlapping.
//
//        Intervals can "touch", such as [0, 1] and [1, 2],
//        but they won't be considered overlapping.
//        For example, given the intervals (7, 9), (2, 4), (5, 8), return 1 as the
//        last interval can be removed and the first two won't overlap.
//        The intervals are not necessarily sorted in any order.

        int[] array1 = {7,9};
        int[] array2 = {2,4};
        int[] array3 = {5,8};
        int[] array4 = {1,2};
        int[] array5 = {3,5};
        List<int[]> list = Arrays.asList(array1,array2,array3,array4,array5);

        int numberOfIntervalsToRemove = 0;

        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i +1; j < list.size(); j++) {
                if( checkOverlapping(list.get(i), list.get(j) )){
                    numberOfIntervalsToRemove++;
                }
            }
        }
        System.out.println(numberOfIntervalsToRemove);
    }

    public static boolean checkOverlapping(int[] firstArray, int [] secondArray) {

        if((firstArray[0] > secondArray[0]) && (firstArray[0]<secondArray[1])) {
            return true;
        }else return (firstArray[1] > secondArray[0]) && (firstArray[0] < secondArray[1]);
    }
}
