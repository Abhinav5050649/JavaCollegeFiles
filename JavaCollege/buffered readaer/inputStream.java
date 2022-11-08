import java.util.*;
import java.io.*;

public class inputStream {
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
        int i;
        char c;
        // create object of file input stream by opening connection data.txt file
        try {
            
        FileInputStream fptr = new FileInputStream("./ReaderTest.java");
        while((i = fptr.read())!=-1)
        {
            c = (char) i;
            System.out.print(c);
        }
        fptr.close();
        }catch(Exception e)
        {
        System.out.println(e);
        }
        
        System.out.println();

        sc.close();
    }
}
