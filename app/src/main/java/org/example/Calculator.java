package org.example;

import java.lang.Math;
import java.util.*;
 
public class Calculator {
    public double netPay(int hours, double deps)
    {
        double totalPay = 0;

        if (hours > 40)
        {
            totalPay += (40 * 16.78);
            totalPay += ((hours - 40) * 25.17);
        } else {
            totalPay += hours * 16.78;
        }

        double netPay = totalPay * 0.94; //SS tax
        netPay -= (totalPay * 0.14); //fed. tax
        netPay -= (totalPay * 0.05); //state tax
        netPay -= 10; //union fees

        if (deps >= 3)
        {
            netPay -= 35; //insurance fees for 3 or more dependants
        } else {
            netPay -= 15; //insurance fees for less than 3 dependants
        }

        return netPay;
    }


}