package com.kt.exercises;

class OverlapingRectangles {

//    This problem was asked by Google.
//    You are given given a list of rectangles represented
//    by min and max x- and y-coordinates. Compute whether
//    or not a pair of rectangles overlap each other.
//    If one rectangle completely covers another,
//    it is considered overlapping.
//
//    For example, given the following rectangles:
//    {
//        "top_left": (1, 4),
//        "dimensions": (3, 3) # width, height
//    },
//    {
//        "top_left": (-1, 3),
//        "dimensions": (2, 1)
//    },
//    {
//        "top_left": (0, 5),
//        "dimensions": (4, 3)
//    }
//return true as the first and third rectangle overlap each other.

    public static void main(String[] args) {
        int x1 = 1;
        int y1 = 4;
        int x1Add = 3;
        int y1Add = 3;

        int x2 = -1;
        int y2 = 3;
        int x2Add = 2;
        int y2Add = 1;

        int x3 = 0;
        int y3 = 5;
        int x3Add = 4;
        int y3Add = 3;

        int yFirstTmpValue = y2;
        int xFirstTmpValue = x2;

        int ySecondTmpValue = y2 - y2Add;
        int xSecondTmpValue = x2 + x2Add;

        boolean overlaping = false;
        boolean isFirstXIntersect = false;
        boolean isFirstYIntersect = false;
        boolean isSecondXIntersect = false;
        boolean isSecondYIntersect = false;

        for (int i = x2Add; i > 0; i--) {
            if (xFirstTmpValue > x1 && xFirstTmpValue < x1 + x1Add) {
                isFirstXIntersect = true;
                break;
            } else {
                xFirstTmpValue++;
            }
        }

        for (int i = y2Add; i > 0; i--) {
            if (yFirstTmpValue < y1 && yFirstTmpValue > y1 - y1Add) {
                isFirstYIntersect = true;
                break;
            } else {
                yFirstTmpValue--;
            }
        }

        for (int i = x2Add; i > 0; i--) {
            if (xSecondTmpValue > x1 && xSecondTmpValue < x1 + x1Add) {
                isSecondXIntersect = true;
                break;
            } else {
                xSecondTmpValue--;
            }
        }

        for (int i = y2Add; i > 0; i--) {
            if (ySecondTmpValue < y1 && ySecondTmpValue > y1 - y1Add) {
                isSecondYIntersect = true;
                break;
            } else {
                ySecondTmpValue++;
            }
        }

        if (isFirstXIntersect && isFirstYIntersect || isSecondXIntersect && isSecondYIntersect) {
            overlaping = true;
        }
        System.out.println(overlaping);
    }
}
