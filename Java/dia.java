import java.util.Scanner;

public class dia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; ++i)
        {
            for (int j = n - i; j >= 0; --j)
            {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; ++k)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i =1; i <= n; ++i)
        {
            for (int j = 0; j <= i - 1; ++j)
            {
                System.out.print(" ");
            }

            for (int k = n; k >= i; --k)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
