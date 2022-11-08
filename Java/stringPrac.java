import java.util.Scanner;
public class stringPrac {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = "  Sachin    1";
        System.out.println(s);
        System.out.println(s.trim());

        String newUp = s.toUpperCase();
        String newlow = s.toLowerCase();

        System.out.println(newUp);
        System.out.println(newlow);
        sc.close();
    }
}
