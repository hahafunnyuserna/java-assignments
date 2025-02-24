package org.example;
 
abstract class Shape implements Polygon
{
    double sideOne;
    double sideTwo;
    abstract double getArea();
    abstract double getPerimeter();
    abstract String getShape();
}

interface Polygon
{
    int getSides();
}
