package com.praveen;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {

        int[] A = new int[]{1, 2, 3, 4};// 3,2,1,4

        System.out.println(Arrays.toString(cyclicRotate(A, 5)));

    }

    private static int[] cyclicRotate(int[] A, int K) {

        //find position of 1st number and then do 1 loop swap.
        while (K > 0 && A.length != 0) {
            int lastElement = A[A.length - 1];

            for (int i = A.length - 1; i > 0; i--) {
                A[i] = A[i - 1];

            }
            A[0] = lastElement;
            K--;
        }

        return A;

    }
}
