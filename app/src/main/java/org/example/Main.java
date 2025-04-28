package org.example;

import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        // Create a bunch of objects that conform to the Cutie interface
Puppy puppy = new Puppy();
Kitty kitty = new Kitty();
 
// Create a queue data structure
CuteQueue queue = new CuteQueue(9);
 
// The size of the queue should equal zero since there are no objects in it
queue.size();
 
// Add the cuties to the queue
queue.enqueue(puppy);
queue.enqueue(kitty);
 
// The size of the queue should equal three since there are three objects in it
queue.size();
 
// The first dequeue should return the puppy
queue.dequeue();
 
// The second dequeue should return the kitty
queue.dequeue();
 

      }
}