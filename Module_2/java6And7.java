import java.util.*;
import java.io.*;

class Obj
{
    int num;
    Obj()
    {
        num = 0;
    }

    Obj(int n)
    {
        this.num = n;
    }
}

public class java6And7 {

    public static void printNumber(int n)
    {
        System.out.println("Number = " + n);
    }

    public static int returnNumber(int n)
    {
        return (n + 1);
    }

    public static int numberOfCLIArgs(String[] args)
    {
        return args.length;
    }

    public static Obj ObjMaker(int n)
    {
        Obj o = new Obj(n);
        return o;
    }
    public static void main(String[] args)
    {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        num = sc.nextInt();

        System.out.println();
        
        printNumber(num);
        System.out.println("Number + 1 = " + returnNumber(num));
        
        int len_args_length = numberOfCLIArgs(args);

        for (int i = 0; i < len_args_length; ++i)
        {
            System.out.print(args[i] + " ");
        }
        System.out.println();

        Obj ans = ObjMaker(num);
        System.out.println("Value stored in obj = " + ans.num);
        
        sc.close();
    }
}
