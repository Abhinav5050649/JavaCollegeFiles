public class mainOverloading{
    public static void main(String agrs)
    {
        System.out.println("Hello");
    }

    public static void main(String[] args)
    {
        System.out.println("hello arr");
        main();
        main("xyz");
    }

    public static void main()
    {
        System.out.println("hello none");
    }
}