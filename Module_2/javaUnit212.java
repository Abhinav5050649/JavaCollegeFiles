import java.util.Scanner;
import java.util.Arrays;

public class javaUnit212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word 1: ");
        String word1 = sc.nextLine();
        char[] words1 = word1.toCharArray();

        System.out.println("Enter word 2: ");
        String word2 = sc.nextLine();
        char[] words2 = word2.toCharArray();

        Arrays.sort(words1);
        Arrays.sort(words2);

        String newWord1 = new String(words1);
        String newWord2 = new String(words2);

        if (newWord1.equals(newWord2))
        {
            System.out.println("Rotation!");
        }
        else{
            System.out.println("Not rotation!");
        }
        sc.close();
    }   
}
