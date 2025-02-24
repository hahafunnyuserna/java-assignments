package org.example;

import java.util.*;

class Main {

    static String printShapeToScreen(Shape s)
    {
        String shapeName = s.getShape();
        double shapeArea = s.getArea();
        double shapePerim = s.getPerimeter();
        int shapeSides = s.getSides();

        return ("Shape: " + shapeName + " (" + shapeSides + " sides)\nArea: " + shapeArea + "\nPerimeter: " + shapePerim);
    }

    static void circleCreate()
    {   
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the radius.");
        double length = scan.nextDouble();

        Shape circ = new Circle(length);
        System.out.println(printShapeToScreen(circ));
        scan.close();
    }

    static void rectangleCreate()
    {   
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the width.");
        double width = scan.nextDouble();
        System.out.println("Please enter the height.");
        double height = scan.nextDouble();

        Shape rect = new Rectangle(width, height);
        System.out.println(printShapeToScreen(rect));

        scan.close();
    }
 
    static void rightTriangleCreate()
    {   
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the width.");
        double width = scan.nextDouble();
        System.out.println("Please enter the height.");
        double height = scan.nextDouble();

        Shape rigt = new RightTriangle(width, height);
        System.out.println(printShapeToScreen(rigt));

        scan.close();
    }

    static void squareCreate()
    {   
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the side length.");
        double length = scan.nextDouble();

        Shape squa = new Square(length);
        System.out.println(printShapeToScreen(squa));

        scan.close();
    }

    static void isophoclesCreate()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the side length.");
        double length = scan.nextDouble();

        Shape isoc = new IsophoclesTriangle(length);
        System.out.println(printShapeToScreen(isoc));
        
        scan.close();
    }

    public static void main(String[] args)
    {
        isophoclesCreate();
    }
}