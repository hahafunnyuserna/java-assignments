package org.example;

class Calculator
{
    int value(int input)
    {
        if (input <= 1)
        {
            return 1;
        }

        return (input + value(input - 1));
    }

    int add(int inputOne, int inputTwo)
    {
        return (value(inputOne) + value(inputTwo));
    }

    int subtract(int inputOne, int inputTwo)
    {
        return (value(inputOne) - value(inputTwo));
    }
}
