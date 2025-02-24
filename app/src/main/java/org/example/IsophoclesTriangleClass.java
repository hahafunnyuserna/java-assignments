package org.example;

class IsophoclesTriangle extends RightTriangle 
{
    public IsophoclesTriangle(double side)
    {
        super(side, side);
    }

    @Override public String getShape()
    {
        return "Isoceles Right Triangle";
    }
}