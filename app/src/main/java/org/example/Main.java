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

        double gross = hoursWorked * 16.78;
        double socSec = gross * 0.06;
        double fedTax = gross * 0.14;
        double staTax = gross * 0.05;
        int insurance;
        if (dependants > 3)
        {
            insurance = 35;
        } else {
            insurance = 15;
        }

        Calculator calculator = new Calculator();
        double finalPay = calculator.netPay(hoursWorked, dependants);

        System.out.println("You've worked " + hoursWorked + " hours.");
        System.out.println("Your wage is $16.78 an hour.");
        System.out.println("Your gross pay is $" + gross + ".");
        System.out.println("\nYou're paying $" + socSec + " for social security.");
        System.out.println("You're paying $" + fedTax + " in federal taxes.");
        System.out.println("You're paying $" + staTax + " in state taxes.");
        System.out.println("You're paying $10 in union fees.");
        System.out.println("You're paying $" + insurance + " for insurance.");

        System.out.println("\nYour final pay is $" + finalPay + ".");
    }
}
