package org.example;

import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Puppy puppy = new Puppy();
        Kitty kitty = new Kitty();
        
        CuteQueue queue = new CuteQueue(9);
        
        queue.size();
        
        queue.enqueue(puppy);
        queue.enqueue(kitty);
        
        queue.size();
        
        queue.dequeue();
        queue.dequeue();
        
        queue.size();

        for (int i = 0; i < 3; i++)
        {
            queue.enqueue(puppy);
            queue.enqueue(kitty);
        }
        queue.size();
        queue.clear();
        queue.size();
      }
}