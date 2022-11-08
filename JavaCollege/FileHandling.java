import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandling {

    public static int encrypt(int data)
    {
        int n_data = data;
        if (n_data >= 65 && n_data <= 90)
        {
            n_data -= 65;
            n_data = (n_data + 4) % 26;
            n_data += 65;
        }   
        else if (n_data >= 97 && n_data <= 122){
            n_data -= 97;
            n_data = (n_data + 4) % 26;
            n_data += 97;   
        }

        return n_data;
    }

    public static int decrypt(int data)
    {
        int n_data = data;
        if (n_data >= 65 && n_data <= 90)
        {
            n_data -= 65;
            n_data = (n_data + 22) %26;
            n_data += 65;
        }   
        else if (n_data >= 97 && n_data <= 122){
            n_data -= 97;
            n_data = (n_data + 22) %26;
            n_data += 97;
        }

        return n_data;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        FileInputStream fin1 = null;
        FileInputStream fin2 = null;
        FileOutputStream fout1 = null;
        FileOutputStream fout2 = null;
        try{
            fin1 = new FileInputStream("tryExcept.java");
            fout1= new FileOutputStream("sample.txt");
            fin2 = new FileInputStream("sample.txt");
            fout2 = new FileOutputStream("sample2.txt");
            int data = 0;

            while (fin1.available() > 0)
            {
                data = fin1.read();
                int e_data = encrypt(data);
                fout1.write((char) e_data);
            }

            System.out.println("\nRead and write Successfully!!!");
            // while (fin.available() > 0)
            // {
            //     data = fin.read();
            //     System.out.print((char)data);
            // }
            
            while (fin2.available() > 0)
            {
                data = fin2.read();
                int e_data = decrypt(data);
                fout2.write((char) e_data);
            }
            System.out.println("\nRead and write Successfully!!!");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            try{
                fin1.close();
                fin2.close();
                fout1.close();
                fout2.close();
            }
            catch(Exception e)
            {}
        }
        
        sc.close();
    }
}
