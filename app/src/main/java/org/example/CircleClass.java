package org.example;

class Circle extends Shape {
    
    public Circle(double radius)
    { 
        super.sideOne = radius;
    }

    @Override public double getArea()
    {
        return (Math.PI * sideOne * sideOne);
    }

    @Override public double getPerimeter()
    {
        return (Math.PI * 2 * sideOne);
    }

    @Override public String getShape()
    {
        return "Circle";
    }

    @Override public int getSides()
    {
        return 0;
    }
}