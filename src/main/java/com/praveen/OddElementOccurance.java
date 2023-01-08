package com.praveen;

import java.util.HashMap;

public class OddElementOccurance {

    public static void main(String[] args) {

        System.out.println(findOddElement(new int[]{1, 1, 2, 3, 2}));

    }

    private static int findOddElement(int[] A) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) % 2 != 0)
                return key;

        }

        return -1;
    }
}
