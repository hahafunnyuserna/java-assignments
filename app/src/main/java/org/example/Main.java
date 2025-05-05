
package org.example;

public class Main {
    public static void main(String[] args) {
        Squirrel cheeks = new Squirrel("Cheeks");
        Node nodeOne = new Node(cheeks);
        
        Squirrel squeaks = new Squirrel("Squeaks");
        Node nodeTwo = new Node(squeaks);
        
        Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");
        Node nodeThree = new Node(fluffybutt);
        
        nodeOne.setLeft(nodeTwo);
        nodeOne.setRight(nodeThree);
        
        Node retrievedLeft = nodeOne.left();
        Node retrievedRight = nodeOne.right();
    }
}