import java.util.*;
import java.util.Scanner;
import java.lang.*;

public class p {

    static void numbers(int n1, int n2, int num1, int num2)
    {
        for (int i = n1; i <= n2; ++i)
        {
            if (i % num1 == 0 && i % num2 == 0)
            {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in); 
       System.out.println();
       System.out.println("Enter numbers defining range\n");

       System.out.println("Enter beginning of range: ");
       int n1 = sc.nextInt();

       System.out.println("Enter end of range:");
       int n2 = sc.nextInt();

        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();

        numbers(n1, n2, num1, num2);
    }

    
}
