package org.example;

class Rectangle extends Shape 
{
    public Rectangle(double width, double height)
    {
        super.sideOne = width;
        super.sideTwo = height;
    }

    @Override public double getArea()
    {
        return (sideOne * sideTwo);
    }

    @Override public double getPerimeter()
    {
        return (2 * (sideOne + sideTwo));
    }

    @Override public String getShape()
    {
        return "Rectangle";
    }

    @Override public int getSides()
    {
        return 4;
    }
}