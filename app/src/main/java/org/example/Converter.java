package org.example;

public class Converter {

    public static String toPounds(int ounces) {
        String finalResult;
        
        Double once = Double.valueOf(ounces);
        Double pounds = once / 16;
        int poundsInt = ounces / 16;
        if (pounds != 1)
        {
            if (poundsInt - pounds == 0)
            {
                finalResult = "You have " + poundsInt + " pounds.";
            } else {
                finalResult = "You have " + pounds + " pounds.";
            }
        } else {
            finalResult = "You have 1 pound.";
        }

        return finalResult;
    }

    public static String toPoundsAndOunces(int ounces) {
        String finalResult;
        
        int pounds = ounces / 16;
        ounces = ounces % 16;
        
        if (pounds == 0)
        {
            if (ounces == 0)
            {
                finalResult = "You have 0 ounces.";
            } else if (ounces == 1) {
                finalResult = "You have 1 ounce.";
            } else {
                finalResult = "You have " + ounces + " ounces.";
            }         
    
        } else if (pounds == 1)
        {
            if (ounces == 0)
            {
                finalResult = "You have 1 pound.";
            } else if (ounces == 1) {
                finalResult = "You have 1 pound and 1 ounce.";
            } else {
                finalResult = "You have 1 pound and " + ounces + " ounces.";
            }
        } else {
            if (ounces == 0)
            {
                finalResult = "You have " + pounds + " pounds.";
            } else if (ounces == 1) {
                finalResult = "You have " + pounds + " and 1 ounce.";
            } else {
                finalResult = "You have " + pounds + " and " + ounces + " ounces.";
            }
        }
    
        return finalResult;
    }
}