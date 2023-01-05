package com.praveen;

public class BinaryGap {

    public static void main(String[] args) {

        int num = 1041;
        System.out.println("BinaryGap:" + displayBinaryGap(num));
    }

    private static int displayBinaryGap(int num) {

        int binaryGapLength = 0;
        boolean started = false;
        int lengthCounter = 0;

        while (num > 0) {
            int index = num % 2;
            if (index == 1) {

                if (started && binaryGapLength < lengthCounter)
                    binaryGapLength = lengthCounter;

                if (!started)
                    started = !started;

                lengthCounter = 0;

            } else {
                lengthCounter++;
            }

            num = num / 2;
        }

        return binaryGapLength;
    }
}
