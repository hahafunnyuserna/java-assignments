package org.example;

import java.util.*;

public class DishStack
{
    private Dish[] dishes;
    private int last;
    private int max;

    public DishStack(int max)
    {
        this.max = max;
        this.dishes = new Dish[max];
        this.last = -1;
    }

    public void push(Dish dish)
    {
        if (last >= (max - 1))
        {
            System.out.println("ERROR: Stack is full. Cannot add the following dish: " + dish.description);
            return;
        }

        System.out.println("Added the following dish: " + dish.description);
        dishes[++last] = dish;
    }

    public Dish pop()
    {
        if (last < 0)
        {
            System.out.println("ERROR: Cannot remove items from an empty stack.");
            return null;
        }

        Dish temp = dishes[last--];
        System.out.println("Removed the following dish: " + temp.description);
        return temp;
    }

    public Dish peek()
    {
        if (last < 0)
        {
            System.out.println("ERROR: Cannot peek an item from an empty stack.");
            return null;
        }

        Dish temp = dishes[last];
        System.out.println("Dish selected: " + temp.description);
        return temp;
    }

    public int size()
    {
        System.out.println("The stack currently has " + (last + 1) + " dishes.");
        return (last + 1);
    }

    public void clear()
    {
        while ((last + 1) > 0)
        {
            Dish temp = dishes[last--];
        }

        System.out.println("Stack cleared.");
    }
}
