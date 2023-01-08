package com.praveen;

public class Gap {

    public static void main(String[] args) {
        System.out.println(findMinGap(new int[]{1, 2}));
    }

    private static int findMinGap(int[] A) {

        int sum = 0;
        int diff = Integer.MAX_VALUE;
        int left = 0;
        if (A.length < 2) {
            return 0;
        }
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        for (int i = 0; i < A.length; i++) {
            left += A[i];
            int tmpDiff = left - (sum - left);

            if (tmpDiff < 0) {
                tmpDiff *= -1;

            }
            if (tmpDiff < diff)
                diff = tmpDiff;


        }
        return diff;
    }
}
