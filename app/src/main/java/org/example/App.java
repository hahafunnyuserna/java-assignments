package org.example;

import java.util.*;

public class App {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter any number.");
        int input = scan.nextInt();

        Factortron factor = new Factortron();
        ArrayList<Integer> finalList = factor.primeFactors(input);
        System.out.println("Prime factors of " + input + ":\n" + finalList);


        scan.close();
    }
}
