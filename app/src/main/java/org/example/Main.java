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
            System.out.println("Please enter your age.\nEnter 'DEFAULT' for a default value, or 'EXIT' to close the program.\n");
            input = scan.nextLine();

            input = input.toUpperCase();

            if (input == "DEFAULT")
            {
                temp = 35;
            } else if (input.matches("\\d+")) {
                temp = Integer.parseInt(input);
            }

            if (temp != 8675309) {

                if (temp >= minimum)
                {
                    System.out.println("You're able to run for president!");
                } else {
                    System.out.println("You're too young for the oval office.");
                }

                isValid = true;
            } else {
                input.toUpperCase();

                if (input == "EXIT")
                {
                    System.out.println("Goodbye.");
                    isValid = true;
                } else {
                    System.out.println("ERROR: Not a valid number.\n");
                }
            }
            
        }
        
        scan.close(); 
    }
}
