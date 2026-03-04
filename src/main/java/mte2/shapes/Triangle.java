// Question: Q1 (mte2, gcis124, 2255)
// Package name: shapes
// File name: Triangle.java

package mte2.shapes;

public class Triangle 
{
    public static Shape createTriangle(double a , double b, double c )
    {
        return new Shape()
        {
            double s = (a+b+c)/2;

            @Override
            public double area(){return Math.sqrt(s*(s - a)*(s - b)*(s - c));}
            @Override
            public double perimeter(){return a + b + c;}
        };
    }

    public static void main(String[] args) 
    {
        Shape t = createTriangle(5, 2, 4);

        System.out.println(t.area());
        System.out.println(t.perimeter());
      

    }
}