package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {   
        Scanner scan = new Scanner(System.in);


        System.out.println("Welcome!\nPlease input the number of hours you have worked this week:");
        int hoursWorked = scan.nextInt();
        System.out.println("Please enter the number of dependants on your insurance plan:");
        int dependants = scan.nextInt();

        double newPay = netPay(hoursWorked, dependants);
      
        
    }
}
