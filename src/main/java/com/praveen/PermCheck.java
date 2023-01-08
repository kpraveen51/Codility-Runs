package com.praveen;

import java.util.Arrays;

public class PermCheck {

    public static void main(String[] args) {
        System.out.println(permCheck(new int[]{1}));
    }

    private static int permCheck(int[] A) {


        if (A.length < 1) {
            return 0;
        }

        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if (A[i] != (i + 1)) {
                return 0;
            }
        }

        return 1;

    }

}



