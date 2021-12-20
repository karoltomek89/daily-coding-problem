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

        int y3 = -1;
        int x3 = -1;

        int y4 = -1;
        int x4 = -1;

        int y2TMP = y2;
        int x2TMP = x2;

        int y4TMP = y2 - y2Add;
        int x4TMP = x2 + x2Add;

        boolean intersect = false;

        for (int i = y2Add; i > 0; i--) {
            if (y2TMP <= y1 && y2TMP >= y1 - y1Add) {
                y3 = y2TMP;
                intersect = true;
                break;
            } else {
                y2TMP--;
            }
        }

        for (int i = x2Add; i > 0; i--) {
            if (x2TMP >= x1 && x2TMP <= x1 + x1Add && intersect == true) {
                x3 = x2TMP;
                break;
            } else {
                x2TMP--;
            }
        }

        for (int i = y2Add; i > 0; i--) {
            if (y4TMP <= y1 && y4TMP >= y1 - y1Add && intersect == true) {
                y4 = y4TMP;
                break;
            } else {
                y4TMP++;
            }
        }

        for (int i = x2Add; i > 0; i--) {
            if (x4TMP >= x1 && x4TMP <= x1 + x1Add && intersect == true) {
                x4 = x4TMP;
                break;
            } else {
                x4TMP++;
            }
        }
        if (intersect == true) {
            System.out.println(Math.abs(x4-x3)*Math.abs(y4-y3));
        }else{
            System.out.println(0);
        }
    }

}
