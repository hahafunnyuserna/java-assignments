package org.example;

import java.util.ArrayList;
import java.util.Collections;


public class Main
{
    

    public static void main(String[] args)
    {
        FuzzyListGenerator maker = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();

        ArrayList<Fuzzy> sortedFuzzies = maker.sortedRainbowFuzzies();
        ArrayList<Fuzzy> randomFuzzies = maker.randomizedRainbowFuzzies();

        Fuzzy key = new Fuzzy("gold");
      
        int testOne = finder.linear(sortedFuzzies, key);
        int testTwo = finder.binary(sortedFuzzies, key);
        int testThree = finder.linear(randomFuzzies, key);
        int testFour = finder.binary(randomFuzzies, key);
      
        System.out.println(testOne);
        System.out.println(testTwo);
        System.out.println(testThree);
        System.out.println(testFour);

        System.out.println("Your code goes here!");


    }
}
