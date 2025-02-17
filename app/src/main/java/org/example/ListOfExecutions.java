package org.example;

import java.util.*;
 
public class ListOfExecutions 
{
    Scanner scan = new Scanner(System.in);

    public Vector<String> list = new Vector<String>();
    public Vector<String> completeList = new Vector<String>();

    public void listAdd(String inputStr)
    {

        if (list.isEmpty())
        {
            list.add(inputStr);
        } else if (list.indexOf(inputStr) >= 0)
        {
            System.out.println("ERROR: Task already in todo list.\n");
        } else {
            list.add(inputStr);
        }
    }

    public void listComplete(String inputStr)
    {

        if (completeList.isEmpty())
        {
            completeList.add(inputStr);
        } else if (completeList.indexOf(inputStr) >= 0)
        {
            System.out.println("ERROR: Task already completed.\n");
        } else if (list.indexOf(inputStr) < 0) {
            System.out.println("ERROR: Task not in todo list.\n");
        } else {
            completeList.add(inputStr);
        }
    }

    public void listClear()
    {
        list.clear();
        completeList.clear();
    }

    public void printAll()
    {
        if (list.isEmpty())
        {
            System.out.println("ERROR: Empty list.");
        } else {
            System.out.println("List:");
            for (int i = 0; i < list.size(); i++)
            {
                System.out.print(list.get(i));
                if (completeList.indexOf(list.get(i)) >= 0)
                {
                    System.out.print(" (complete)\n");
                } else {
                    System.out.print(" (incomplete)\n");
                }
            }
        }
    }

    public void printComplete()
    {
        if (completeList.isEmpty())
        {
            System.out.println("ERROR: Empty list.");
        } else {
            System.out.println("List of complete items:");
            for (int i = 0; i < list.size(); i++)
            {
                if (completeList.indexOf(list.get(i)) >= 0)
                {
                    System.out.println(list.get(i));
                }
            }
        }
    }

    public void printIncomplete()
    {
        if (list.isEmpty())
        {
            System.out.println("ERROR: Empty list.");
        } else {
            System.out.println("List of incomplete items:");
            for (int i = 0; i < list.size(); i++)
            {
                if (completeList.indexOf(list.get(i)) < 0)
                {
                    System.out.println(list.get(i));
                }
            }
        }
    }
}