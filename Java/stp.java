import java.util.Scanner;
public class stp {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String string = sc.next();
        for (int i = 0, n = string.length(); i < n; ++i)
        {
            for (int k = n - i; k >= 0; --k)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; ++j)
            {
                System.out.print(string.charAt(j) + " ");
            }
            System.out.println();
        }
    }  
}
