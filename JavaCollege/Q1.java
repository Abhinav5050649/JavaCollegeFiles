import java.util.Scanner;
public class Q1{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = sc.next();
        System.out.println("Hello " + userName);
        sc.close();
    }
}