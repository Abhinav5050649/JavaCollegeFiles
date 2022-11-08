import java.util.Scanner;
public class Q4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int userMarks = sc.nextInt();

        if (userMarks >= 90 && userMarks <= 100)
        {
            System.out.println("A Grade!");
        }
        else if (userMarks >= 80 && userMarks < 90)
        {
            System.out.println("B Grade!");
        }
        else if (userMarks >= 60 && userMarks < 80)
        {
            System.out.println("C Grade!");
        }
        else if (userMarks >= 45 && userMarks < 60)
        {
            System.out.println("D Grade!");
        }
        else if (userMarks >= 35 && userMarks < 45)
        {
            System.out.println("E Grade!");
        }
        else if (userMarks < 35)
        {
            System.out.println("Fail!");
        }

        sc.close();
    }
}
