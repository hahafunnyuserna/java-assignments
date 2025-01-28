package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {   Scanner scan = new Scanner(System.in);
      
        int input = 0;
        
   
        System.out.println("Please enter any number.");
        input = scan.nextInt();

        Factortron factor = new Factortron();
        ArrayList<Integer> finalList = factor.primeFactors(input);
        System.out.println("Prime factors of " + input + ":\n" + finalList);

        scan.close();
    }
}
