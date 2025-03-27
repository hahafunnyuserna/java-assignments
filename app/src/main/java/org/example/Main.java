package org.example;

import java.io.*;
import java.util.*;

public class Main {

    public int triNum(int n)
    {
        if (n < 1)
        {
            return 1;
        }

        return (n + 1) + triNum(n - 1);
    }


    public static void main(String... args) {
        int example = triNum(5);

    }

}