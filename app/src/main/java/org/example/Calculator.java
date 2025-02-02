package org.example;

import java.lang.Math;
import java.util.*;
 
public class Calculator {
    public double netPay(int hours, double deps)
    {
        double totalPay = 0;

        for (int i = hours; i > 0; i++)
        {
            totalPay += 16.78; //total pay for regular hours
        }
        for (int i = hours - 40; i > 0; i++)
        {
            totalPay += 25.17; //total pay for overtime
        }

        totalPay *= 0.94; //SS tax
        totalPay *= 0.86; //fed. tax
        totalPay *= 0.95; //state tax
        totalPay -= 10; //union fees

        if (deps >= 3)
        {
            totalPay -= 35; //insurance fees for 3 or more dependants
        } else {
            totalPay -= 15; //insurance fees for less than 3 dependants
        }

        return totalPay;
    }


}