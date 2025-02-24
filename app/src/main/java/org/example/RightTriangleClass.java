package org.example;

class RightTriangle extends Shape 
{
    public RightTriangle(double width, double height)
    {
        super.sideOne = width;
        super.sideTwo = height;
    }

    @Override public double getArea()
    {
        return (0.5 * sideOne * sideTwo);
    }

    @Override public double getPerimeter()
    {
        return (sideOne + sideTwo + Math.sqrt((sideOne * sideOne) + (sideTwo * sideTwo)));
    }

    @Override public String getShape()
    {
        return "Right Triangle";
    }

    @Override public int getSides()
    {
        return 3;
    }
}