package org.example;

import java.io.*;
import java.util.*;

public class Main {

    


    public static void main(String... args) {

        Calculator calc = new Calculator();

        System.out.println(calc.value(1));
        System.out.println(calc.value(2)); 
        System.out.println(calc.value(4)); 

        System.out.println(calc.add(1, 1));
        System.out.println(calc.add(2, 3)); 
        System.out.println(calc.add(4, 2)); 

        System.out.println(calc.subtract(1, 1));
        System.out.println(calc.subtract(2, 3));
        System.out.println(calc.subtract(4, 2)); 
    }

}