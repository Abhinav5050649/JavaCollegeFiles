import java.util.Scanner;
public class Q12 {
    public static void main(String[] args)
    {
        System.out.print("Enter sentence: ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        SentenceOps s1 = new SentenceOps(userInput);

        s1.DigitsCounter();
        s1.vowelCounter();

        sc.close();
    }
}

class SentenceOps
{
    public
    String sentence;
    int countOfA = 0, countOfE = 0, countOfI = 0, countOfU = 0, countOfO = 0, countOfDigits = 0, countOfVowels = 0;

    SentenceOps(String userInput)
    {
        sentence = userInput;
    }

    void vowelCounter()
    {
        for (int i = 0, n = sentence.length(); i < n; ++i)
        {
            char ch = sentence.charAt(i);
            if (ch == 'A' || ch == 'a') ++countOfA;
            else if (ch == 'E' || ch == 'e')    ++countOfE;
            else if (ch == 'I' || ch == 'i')    ++countOfI;
            else if (ch == 'O' || ch == 'o')    ++countOfO;
            else if (ch == 'U' || ch == 'u')    ++countOfU;
        }  
    
        countOfVowels = countOfA + countOfE + countOfI + countOfO + countOfU;
        System.out.println("Total number of vowels: " + countOfVowels);
        System.out.println("Total number of A\'s: " + countOfA);
        System.out.println("Total number of E\'s: " + countOfE);
        System.out.println("Total number of I\'s: " + countOfI);
        System.out.println("Total number of O\'s: " + countOfO);
        System.out.println("Total number of U\'s: " + countOfU);
    }

    void DigitsCounter()
    {
        for (int i = 0, n = sentence.length(); i < n; ++i)
        {
            char ch = sentence.charAt(i);
            if (ch >= '0' && ch <='9')  ++countOfDigits; 
        }

        System.out.println("Number of Digits in sentence: " + countOfDigits);
    }
}
