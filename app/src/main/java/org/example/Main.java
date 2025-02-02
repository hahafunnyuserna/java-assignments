package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {   
        Scanner scan = new Scanner(System.in);

        int hoursWorked = -5;
        int dependants;
        double wage = -5;

        System.out.println("Welcome!\n");

        while (wage < 0)
        {
            System.out.println("Please input your hourly wage:");
            wage = scan.nextDouble();
            if (wage < 0)
            {
                System.out.println("ERROR - Negative value detected.");
            }
        }
        
        System.out.println("Please input the number of hours you have worked this week:");
        hoursWorked = scan.nextInt();
        if (hoursWorked < 0)
        {
            hoursWorked = 0;
        }

        System.out.println("Please enter the number of dependants on your insurance plan:");
        dependants = scan.nextInt();
        if (dependants < 0)
        {
            dependants = 0;
        }

        double gross = hoursWorked * wage;
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
        double finalPay = calculator.netPay(wage, hoursWorked, dependants);

        System.out.println("\nYou've worked " + hoursWorked + " hours.");
        System.out.println("Your wage is $" + wage + " an hour.");
        System.out.println("Your gross pay is $" + gross + ".");
        System.out.println("\nYou're paying $" + socSec + " for social security.");
        System.out.println("You're paying $" + fedTax + " in federal taxes.");
        System.out.println("You're paying $" + staTax + " in state taxes.");

        if (finalPay > insurance + 10)
        {
            System.out.println("You're paying $10 in union fees.");
            System.out.println("You're paying $" + insurance + " for insurance.");
        } else {
            finalPay += (10 + insurance);
        }
        
        System.out.println("\nYour final pay is $" + finalPay + ".");

        if (finalPay < insurance + 10)
        {
            System.out.println("\nYou still need to pay $10 in union fees and $" + insurance + " for insurance.");
        }

        System.out.println("Goodbye!");
    }
}
