package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int minimum = 35;
        Boolean isValid = false;
        int temp = 8675309;
        String input;

        while (isValid == false)
        {
            System.out.println("Please enter your age.\nEnter 'DEFAULT for a default value, or 'EXIT' to close the program.");
            input = scan.nextLine();
            input.toUpperCase();

            boolean isInt;
            try
            {
                Integer.parseInt(input);
                isInt = true;
            } catch (NumberFormatException ex) {
                isInt = false;
            }

            if (input == "EXIT")
            {
                System.out.println("Goodbye.");
                isValid = true;
            } else if (input == "DEFAULT") {
                temp = 55;
                System.out.println("Your age is " + temp + ".");
            } else if (isInt == true) {

                temp = Integer.parseInt(input);

                if (temp <= 0)
                {
                    System.out.println("ERROR: Impossible age.\nPlease go back to the womb.");
                } else {
                    if (temp >= minimum)
                    {
                        System.out.println("You're able to run for president!");
                    } else {
                        System.out.println("You're too young for the oval office.");
                        
                    }
                    isValid = true;
                }
            } else {
                System.out.println("ERROR: Not an actual number.");
            }
        }
        
        scan.close(); 
    }
}
