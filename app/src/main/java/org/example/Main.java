package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {


        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.getGreeting());

        Scanner scan = new Scanner(System.in);

        int oz;

        bool repeat = true;
        while (repeat)
        {
            System.out.println("Please input a weight in ounces.");
            while (scan.hasNext())
            {
                if (scan.hasNextInt())
                {
                    toPounds ellbeeess = new toPounds(scan.nextInt());
                }
            }
        }


    }
}