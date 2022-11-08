import java.io.*;
import java.util.*;

class Product{
    private String pName;
    public int productID;

    Product()
    {
        this.pName = "";
        this.productID = 0;
    }

    Product(String name, int id)
    {
        this.pName = name;
        this.productID = id;
    }

    void setName(String n)
    {
        this.pName = n;
    }
    
    String getName()
    {
        return this.pName;
    }

    
}
public class productTest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        sc.close();
    }
}
