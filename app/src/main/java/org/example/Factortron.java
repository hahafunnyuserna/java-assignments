package org.example;

import java.lang.Math;
import java.util.*;
 
class Factortron {
    public ArrayList<Integer> primeFactors(Integer n)
    {
        

        ArrayList<Integer> returnList = new ArrayList<>();

        if (n == 0)
        {
            return returnList;
        }

        while (n % 2 == 0)
        {
            returnList.add(2);
            n /= 2;
        }
 
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            while (n % i == 0)
            {
                returnList.add(i);
                n /= i;
            }
        }

        if (n > 2)
        {
            returnList.add(n);
        }

      
        return returnList;
    }
}