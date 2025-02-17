package org.example;

import java.util.*;

class Main {
    public static void main(String[] args) {
    ListOfExecutions list = new ListOfExecutions();
   
    list.listAdd("Buy milk");
    list.listAdd("Buy eggs");
    list.listAdd("Prepare a lesson for CSC 122");
    list.listAdd("Sow beet seeds");
   
    list.listComplete("Buy eggs");
   
    // Pretty prints a list of each of the four tasks above
    list.printAll();
   
    // Pretty prints the task "Buy eggs"
    list.printComplete();
   
    // Pretty prints the tasks "Buy milk",
    // "Prepare a lesson for CSC 122", and "Sow beet seeds"
    list.printIncomplete();
   
    // Clears the to-do list
    list.listClear();
   
    // Pretty prints a message saying that the list is empty
    list.printAll();
    
    }
  }