package com.praveen;

public class FrogJump {

    public static void main(String[] args) {

        System.out.println(findFrogJump(5, 105, 3));

    }

    private static int findFrogJump(int X, int Y, int D) {

        int iteration = (Y - X) / D;

        if ((Y - X) % D != 0) {
            iteration++;

        }


        return iteration;


    }

}
