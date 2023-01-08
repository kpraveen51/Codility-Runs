package com.praveen;

import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {

        System.out.println(findMissingNumber(new int[]{}));

    }


    private static int findMissingNumber(int[] A) {

        Arrays.sort(A);

        if (A.length == 0) {
            return 1;
        }

        if (A[A.length - 1] == A.length) {
            return A.length + 1;
        }
        if (A[0] != 1) {
            return 1;
        }
        int start = 1;
        int end = A.length;

        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (A[mid - 1] == mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return mid;

    }
}