package com.praveen;

public class FrogRiverRun {

    public static void main(String[] args) {
        System.out.println(findTimeForRiverRun(5, new int[]{1, 2}));
    }

    private static int findTimeForRiverRun(int X, int[] A) {

        int[] tmpArr = new int[X];


        for (int i = 0; i < A.length; i++) {
            if (tmpArr[A[i] - 1] == 0) {
                X--;
            }

            if (X == 0) {
                return i;
            }
            tmpArr[A[i] - 1] = A[i];

        }

        return -1;


    }

}
