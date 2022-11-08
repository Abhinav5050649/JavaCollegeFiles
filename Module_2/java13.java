import java.util.Scanner;

public class java13 {
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);

            Rectangle r1 = new Rectangle(1 ,2);
            Triangle t1 = new Triangle(2, 4);
            Circle c1 = new Circle(2);

            r1.getArea();
            t1.getArea();
            c1.getArea();
            
            sc.close();
    } 
}

abstract class TwoDShape{
    abstract void getArea();
}

class Rectangle extends TwoDShape{
    public
    int length, breadth;

    Rectangle()
    {
        this.length = 0; 
        this.breadth = 0;
    }

    Rectangle(int l, int b)
    {
        this.length = l;
        this.breadth = b;
    }

    void getArea()
    {
        System.out.println("Area = " + (this.length * this.breadth));
    }
}

class Triangle extends TwoDShape{
    public 
    int breadth;
    int height;

    Triangle()
    {
        this.height = 0;
        this.breadth = 0;
    }

    Triangle(int h, int b)
    {
        this.height = h;
        this.breadth = b;
    }

    void getArea()
    {
        System.out.println("Area = " + (int)(0.5 * this.height * this.breadth));
    }
}

class Circle extends TwoDShape{
    public
    int radius;

    Circle()
    {
        this.radius = 0;
    }

    Circle(int r)
    {
        this.radius = r;
    }

    void getArea()
    {
        System.out.println("Area = " + (int)(22.7 * this.radius * this.radius));
    }
}