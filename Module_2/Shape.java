public class Shape{

    public static void main(String args[]) 
	{
	//    area(5);
	   area(11,12f);
	//    area(2.5);
    }

    // static void area(int x, float y)
    // {
    //     System.out.println("the area of the square is "+ x*y +" sq units");
    // }
    static void area(float x , float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    static void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }

}