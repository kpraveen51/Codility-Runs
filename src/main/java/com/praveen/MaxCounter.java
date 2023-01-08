package com.praveen;

public class MaxCounter {

    public static void main(String[] args) {
        System.out.println(maxCounter(5, new int[]{3, 4, 4, 6, 1, 4, 4}));
    }

    private static int[] maxCounter(int N, int[] A) {

        int[] counter = new int[N];
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == N + 1) {
                for (int j = 0; j < counter.length; j++) {
                    counter[j] = max;
                }
            } else if ((1 <= A[i]) && (A[i] <= N)) {
                counter[A[i] - 1] = counter[A[i] - 1] + 1;

                if (max < counter[A[i] - 1]) {
                    max = counter[A[i] - 1];
                }
            }
        }

        return counter;

    }

}


