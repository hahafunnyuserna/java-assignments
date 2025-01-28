package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int littleW = 0;

        boolean repeat = true;
        while (repeat)
        {
            System.out.println("Please input a weight in ounces.");
            littleW = scan.nextInt(); 
            Converter formula = new Converter();
            String finalBasic = formula.toPounds(littleW);
            String finalComp = formula.toPoundsAndOunces(littleW);
            repeat = false;
            System.out.println(finalBasic);
            System.out.println(finalComp);
        }

        scan.close();
    }
}