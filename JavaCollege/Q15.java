public class Q15 {

    public static int calculateArea(int len, int bre)
    {
        //Square and rectangle
        return len * bre;
    }

    public static double calculateArea(int radius)
    {
        //circle
        return (3.14 * radius * radius);
    }

    public static void main(String[] args)
    {
        System.out.println(calculateArea(1, 2));
        System.out.println(calculateArea(2));
    }
}
