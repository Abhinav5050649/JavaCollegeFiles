import java.util.Scanner;
public class pattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        /*
         * 1 2 3 4 5
         * 2 3 4 5
         * 3 4 5 
         * 4 5
         * 5
         */
        System.out.println();
         for (int i = 1; i <= n; ++i)
         {
            for (int j = i; j <= n; ++j)
            {
                System.out.print(j + " ");
            }
            System.out.println();
         }
        /*
        * 5 4 3 2 1
        * 4 3 2 1
        * 3 2 1
        * 2 1
        * 1 
        */
        for (int i = n; i >= 1; --i)
         {
            for (int j = i; j >= 1; --j)
            {
                System.out.print(j + " ");
            }
            System.out.println();
         }
         System.out.println();
    }
}
