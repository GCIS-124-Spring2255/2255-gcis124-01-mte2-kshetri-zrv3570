// Question: Q1 (mte2, gcis124, 2255)
// Package name: shapes
// File name: Circle.java

package mte2.shapes;

public class Circle 
{
    public static Shape createCircle(double r)
    {
        return new Shape()
        {
            @Override
            public double area(){return Math.PI*r*r;}
            @Override
            public double perimeter(){return 2*Math.PI*r;}
        };
    }

    public static void main(String[] args) 
    {
        Shape c = createCircle(5);
        System.out.println(c.area());
        System.out.println(c.perimeter());
        
        // ...

    }
}