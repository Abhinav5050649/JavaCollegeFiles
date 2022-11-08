import java.util.Scanner;
public class ArrayForEach {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // int[] arrNow = {1, 2, 3, 4, 5, 6};

        // for (int value: arrNow)
        // {
        //     System.out.print(value + " ");
        // }
        // System.out.println();

        // System.out.println(java.util.Arrays.toString(arrNow));
        String name1 = "JavaWorld", name2 = "JavaWorld", name4 = new String("JavaWorld"), name3 = name1;
        //Strings created in a program will be stored in a String Pool
        System.out.println(name1 == name4);
        System.out.println(name1.equals(name4));
        System.out.println(name1.length());

        //Always use equals method to compare two strings
        sc.close();
    }
}
