import java.util.*;
import java.util.Scanner;
import java.lang.*;

// public class prac{
//     public static void main(String args[])
//     {
//         if (args.length <= 1)
//             System.out.println("Dobe do numbers daal!!!");
//         else{
//             System.out.println("Answer: " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
//         }
//     }
// }

/*
 * String n1 = "Abhinav";
    String n2 = "abHinAv";

    if (n1.equalsIgnoreCase(n2))
    {
        System.out.println("True");
    }
    else
    {
        System.out.println("False");
    }
 */
/*
    An example of different main classes
 * // class prac{
//     public static void main(String args[])
//     {
//         System.out.println("Hello");
//     }
// }

// class prac1{
//     public static void main(String args[])
//     {
//         System.out.println("Hello");
//     }
// }
 */


class prac{
    public static void main(String args[]){
        //bool, short, int, float, double, byte, long
        // size of variables --> var.SIZE
        // min value of data --> var.MIN_VALUE
        // max value of data --> var.MAX_VALUE
        
        /*
         * int --> Integer
         * short --> Short
         * long --> Long
         * float --> Float 
         * double --> Double
         * byte --> Byte
        //  */

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println(n);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter data type: ");
        // String ans = sc.next();
        // ans = ans.toUpperCase();
        // System.out.println(ans);
        // if (ans.equalsIgnoreCase("BYTE"))
        // {
        //     System.out.println("Size of byte: " + Byte.SIZE);
        //     System.out.println("Minimum value of byte: " + Byte.MIN_VALUE);
        //     System.out.println("Maximum value of byte: " + Byte.MAX_VALUE);
        // }
        // else if (ans.equals("INTEGER"))
        // {
        //     System.out.println("Size of Integer: " + Integer.SIZE);
        //     System.out.println("Minimum value of Integer: " + Integer.MIN_VALUE);
        //     System.out.println("Maximum value of Integer: " + Integer.MAX_VALUE);
        // }
        // else if (ans.equals("FLOAT"))
        // {
        //     System.out.println("Size of Float: " + Float.SIZE);
        //     System.out.println("Minimum value of Float: " + Float.MIN_VALUE);
        //     System.out.println("Maximum value of Float: " + Float.MAX_VALUE);
        // }
        // else if (ans.equals("LONG"))
        // {
        //     System.out.println("Size of Long: " + Long.SIZE);
        //     System.out.println("Minimum value of Long: " + Long.MIN_VALUE);
        //     System.out.println("Maximum value of Long: " + Long.MAX_VALUE);
        // }
        // else if (ans.equals("DOUBLE"))
        // {
        //     System.out.println("Size of Double: " + Double.SIZE);
        //     System.out.println("Minimum value of Double: " + Double.MIN_VALUE);
        //     System.out.println("Maximum value of Double: " + Double.MAX_VALUE);
        // }
        // else if (ans.equals("SHORT"))
        // {
        //     System.out.println("Size of Short: " + Short.SIZE);
        //     System.out.println("Minimum value of Short: " + Short.MIN_VALUE);
        //     System.out.println("Maximum value of Short: " + Short.MAX_VALUE);
        // }

        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a number: ");
        // int n = sc.nextInt();
        // System.out.println();
        // for (int i = 0; i < n; ++i)
        // {
        //     System.out.println(i);
        // }

        // // String ans = "Hello";
        // System.out.println("Enter number: ");
        // int n = sc.nextInt();
        
        // int[] arrs = {2, 3, 5, 7, 11};
        // for (int i = 0; i < arrs.length; ++i)
        // {
        //     System.out.print(arrs[i] + " ");
        // }
        // // System.out.println();
        // char ch = 'h';
        // char, int, float, double, long, short, String
        // String[] arrs = {"H", "ello"};
        // for (int i = 0, n = arrs.length; i < n; ++i)
        // {
        //     // System.out.print(arrs[i] + " ");
        // }
        // System.out.println();
        // int x;
        // if (5 < 4)
        // {
        //     x = 5;
        // }
        // else{
        //     x = 4;
        // }
        // int x = (5 < 4) ? 5 : 4;
        
        // int[] arrs = {1, 2, 3, 4, 5};
        int size  =10;
        int[] arrs = new int[size];
        for (int i = 0; i < 5; ++i)
        {
            System.out.println("Enter number " + (i) + ": ");
            arrs[i] =  sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < 5; ++i)
        {
            sum += arrs[i];
        }

        System.out.println(sum);
    }
}