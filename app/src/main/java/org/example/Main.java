
package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        LoopFunctions loop = new LoopFunctions();
        StreamFunctions stream = new StreamFunctions();
        int[] array = {20, 44, 71, 59, 18, 68, 43, 67};

        System.out.println("Original array: " + Arrays.toString(array));

        System.out.println("Minimum using loops: " + loop.minLoop(array));
        System.out.println("Maximum using loops: " + loop.maxLoop(array));
        System.out.println("Sum using loops: " + loop.sumLoop(array));
        System.out.println("Average using loops: " + loop.avgLoop(array));

        System.out.println("Minimum using stream: " + stream.minStream(array));
        System.out.println("Maximum using stream: " + stream.maxStream(array));
        System.out.println("Sum using stream: " + stream.sumStream(array));
        System.out.println("Average using stream: " + stream.avgStream(array));


    }
}