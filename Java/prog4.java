import java.util.Scanner;
public class prog4 {
    //Program number 4
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String user_input_string = sc.nextLine();

        solve(user_input_string, user_input_string.length());
        sc.close();
    }

    static void solve(String userString, int string_length)
    {
        int counter = 0;
        for (int i = 0; i < string_length - 1; ++i)
        {
            if (userString.charAt(i) == ' ')
            {
                char ch = userString.charAt(i + 1);
                if (Character.isUpperCase(ch))
                {
                    counter++;
                }
            }
        }

        System.out.println("Required situations = " + counter);
    }
}
