package org.example;

import java.*;
 
abstract class Shape
{

    double width;
    abstract double getArea();
    abstract double getPerimeter();
    abstract String getShape();
}

class Circle extends Shape {
    
    public Circle(double x) { 
        super.width = x; 
    }

    @Override public double getArea()
    {
        return ((super.width / 2) * (super.width / 2) * Math.PI);
    }

    @Override public double getPerimeter()
    {
        return (Math.PI * 2 * (width / 2));
    }

    @Override public String getShape()
    {
        return "Circle";
    }
}