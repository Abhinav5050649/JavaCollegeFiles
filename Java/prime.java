import java.util.*;
import java.util.Scanner;
import java.lang.Math;

public class prime {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of primes required: ");
        int number_of_primes = sc.nextInt();
        primes(number_of_primes);
    }

    static void primes(int n)
    {
        int[] arrs = new int[n];

        int start = 2, count = 0;
        
        while (count != n)
        {
            int flag = 0;
            for (int i = 2, st = (int)Math.sqrt(start); i <= st; ++i)
            {
                if (start % i == 0)
                {
                    flag++;
                }
            }

            if (flag == 0)
            {
                arrs[count] = start;
                count++;
            }
            
            start++;
        }

        for (int i = 0; i < n; ++i)
        {
            System.out.print(arrs[i] + " ");
        }
        System.out.println();
    }
}
