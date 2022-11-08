class Con
{
    Con()
    {
        this(5);
        System.out.println("Constructor 1");
    }
 
    Con(int x)
    {
        System.out.println("Constructor 2");
        System.out.println(x);
    }
}

public class java8 {
    public static void main(String[] args) {
        Con c = new Con();
    }
}
