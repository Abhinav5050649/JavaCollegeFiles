import java.util.Scanner;

public class s {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter word: ");
        String word = sc.next();

        System.out.println("Uppercase: " + word.toUpperCase());
        System.out.println("Lowercase: " + word.toLowerCase());
        System.out.println("Length: " +word.length());
        char ch = ' ';

    }   
}
