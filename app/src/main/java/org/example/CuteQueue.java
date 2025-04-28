package org.example;

import java.util.ArrayList;
import java.util.List;

public class CuteQueue
{
    private List<Cutie> queue;
    private int max;

    public CuteQueue(int max)
    {
        this.max = max;
        this.queue = new ArrayList<>();
    }

    public void enqueue(Cutie cuddly)
    {
        if (queue.size() >= max)
        {
            System.out.println("ERROR: Queue is full.");
            return;
        }
        
        queue.add(cuddly);
    }

    public Cutie dequeue()
    {
        if (queue.isEmpty())
        {
            System.out.println("ERROR: Cannot remove items from an empty queue.");
            return null;
        }
       

        return queue.remove(0);
    }

    public int size()
    {
        System.out.println("The queue currently has " + queue.size() + " queties.");
        return queue.size();
    }

    public void clear()
    {
        while (!queue.isEmpty())
        {
            queue.remove(0);
        }

        System.out.println("Queue cleared.");
    }
}