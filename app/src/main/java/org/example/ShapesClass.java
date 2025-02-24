package org.example;

import java.util.*;
 
abstract class Shape
{
    double sideOne;
    double sideTwo;
    abstract double getArea();
    abstract double getPerimeter();
    abstract String getShape();
    abstract int getSides();
}

interface Polygon
{

}
