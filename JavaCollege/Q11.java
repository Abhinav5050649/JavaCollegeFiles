import java.util.Scanner;
public class Q11 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String userInput = sc.nextLine();

        int count = 0;
        
        if (Character.isUpperCase(userInput.charAt(0))) ++count;
        for (int i = 0, lenOfUserInput = userInput.length(); i < lenOfUserInput - 1; ++i)
        {
            if (userInput.charAt(i) == ' ' && Character.isUpperCase(userInput.charAt(i + 1)))   ++count;
        }

        System.out.println("Number of words as per the condition specified are: " + count);
        sc.close();
    }
}
