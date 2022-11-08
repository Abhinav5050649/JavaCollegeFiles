import java.util.Scanner;
public class lin {
    //Vowel and Consonant counter
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String user_input_string = sc.nextLine();

        int vowel = 0, consonant = 0;
        for (int i = 0, n = user_input_string.length(); i < n; ++i)
        {
            char ch = user_input_string.charAt(i);

            switch(ch)
            {
                case ' ':
                    break;
                case 'A':
                case 'a':
                case 'E':
                case 'e':
                case 'I':
                case 'i':
                case 'o':
                case 'O':
                case 'U':
                case 'u':
                    vowel++;
                default:
                    consonant++;
            }
        }

        System.out.println("Vowel = " +vowel+"\nConsonant = " + consonant + "\n");
    }
}
