package com.kt.exercises;

class RectanglesIntersection {

    public static void main(String[] args) {

//        This problem was asked by Google.
//        Given two rectangles on a 2D graph,
//        return the area of their intersection.
//        If the rectangles don't intersect, return 0.

//        For example, given the following rectangles:
//        {
//            "top_left": (1, 4),
//            "dimensions": (3, 3) # width, height
//        }
//        and
//        {
//            "top_left": (0, 5),
//            "dimensions": (4, 3) # width, height
//        }
//        return 6.

//
//        1,4--------4,4
//
//
//        1,7--------4,7
//
//
//
//        0,5---------4,5
//
//
//
//        0,8---------4,8

        int x2 = 10;
        int y2 = 4;
        int x2Add = 3;
        int y2Add = 3;

        int x1 = 0;
        int y1 = 5;
        int x1Add = 4;
        int y1Add = 3;

        int yFirstIntersectedValue = -1;
        int xFirstIntersectedValue = -1;

        int ySecondIntersectedValue = -1;
        int xSecondIntersectedValue = -1;

        int yFirstTmpValue = y2;
        int xFirstTmpValue = x2;

        int ySecondTmpValue = y2 - y2Add;
        int xSecondTmpValue = x2 + x2Add;

        boolean intersect = false;

        for (int i = y2Add; i > 0; i--) {
            if (yFirstTmpValue <= y1 && yFirstTmpValue >= y1 - y1Add) {
                yFirstIntersectedValue = yFirstTmpValue;
                intersect = true;
                break;
            } else {
                yFirstTmpValue--;
            }
        }

        for (int i = x2Add; i > 0; i--) {
            if (xFirstTmpValue >= x1 && xFirstTmpValue <= x1 + x1Add && intersect == true) {
                xFirstIntersectedValue = xFirstTmpValue;
                break;
            } else {
                xFirstTmpValue--;
            }
        }

        for (int i = y2Add; i > 0; i--) {
            if (ySecondTmpValue <= y1 && ySecondTmpValue >= y1 - y1Add && intersect == true) {
                ySecondIntersectedValue = ySecondTmpValue;
                break;
            } else {
                ySecondTmpValue++;
            }
        }

        for (int i = x2Add; i > 0; i--) {
            if (xSecondTmpValue >= x1 && xSecondTmpValue <= x1 + x1Add && intersect == true) {
                xSecondIntersectedValue = xSecondTmpValue;
                break;
            } else {
                xSecondTmpValue++;
            }
        }
        if (intersect == true) {
            System.out.println(Math.abs(xSecondIntersectedValue-xFirstIntersectedValue)*Math.abs(ySecondIntersectedValue-yFirstIntersectedValue));
        }else{
            System.out.println(0);
        }
    }

}
