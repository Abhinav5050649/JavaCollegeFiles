import java.util.*;

public class Q13 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string ");
        String s= sc.nextLine();


        System.out.println("Upper case of given string: " + s.toUpperCase());
        System.out.println("Lower case of given string: " + s.toLowerCase());
        System.out.println("Number of words in string: " );
        countwords(s);

        System.out.println("Trimed given string: " + s.trim());
        System.out.println("Length of given string: "+ s.length());
        if((s.substring(s.length()-4 , s.length())).equals("Java")){
            System.out.println(s.concat("standardEdition"));
        }else{
            System.out.println(" String does not contain java");
        }

        String s2="Hello Java";
        if(s.equals(s2)){
            System.out.println(" Given two string are equal");
        }
        sc.close();



    }

    public static void countwords(String str){
        
        int count = 1;
 
        for (int i = 0; i < str.length() - 1; i++)
        {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
            {
                count++;
            }
        }
        System.out.println("Number of words in a string : " + count);

    }   
}