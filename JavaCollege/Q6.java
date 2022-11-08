import java.util.Scanner;

public class Q6 {

    public static void solve(int n)
    {
        int count = 0;
        for (int i = 0; i < Integer.MAX_VALUE && count < n; ++i)
        {
            if (checkPrime(i))
            {
                ++count;
                System.out.print(i + " ");
            }
        }

        return;
    }

    public static Boolean checkPrime(int n)
    {
        int flag = -1;
        if (n == 0 || n == 1)   return false;
        for (int i = 2; i <= Math.sqrt(n); ++i)
        {
            if (n % i == 0)
            {
                flag = 1;
                break;
            }
        }

        if (flag == 1)  return false;
        else    return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range of prime numbers needed:");
        int n = sc.nextInt();

        solve(n);
        sc.close();
    }
}
