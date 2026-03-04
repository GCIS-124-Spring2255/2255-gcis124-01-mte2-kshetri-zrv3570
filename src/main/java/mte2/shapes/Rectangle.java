// Question: Q1 (mte2, gcis124, 2255)
// Package name: shapes
// File name: Rectangle.java

package mte2.shapes;

public class Rectangle {
    public static Shape createRectangle(double w, double h)
    {
        return new Shape()
        {
            @Override
            public double area(){return w*h;}
            @Override
            public double perimeter(){return 2*w*h;}
        };
    }
    public static void main(String[] args) 
    {
        Shape r = createRectangle(4, 5);
        System.out.println(r.area());
        System.out.println(r.perimeter());
        // ...

    }
    
}