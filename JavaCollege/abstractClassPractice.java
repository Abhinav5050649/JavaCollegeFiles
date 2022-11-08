import java.util.Scanner;

public class abstractClassPractice {
   public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);

        Rectangle r1 = new Rectangle(1 ,2);
        Triangle t1 = new Triangle(2, 4);

        r1.getArea();
        t1.getArea();
        
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

class Triangle extends abstractClassPractice{
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
