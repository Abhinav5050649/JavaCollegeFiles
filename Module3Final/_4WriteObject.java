import java.io.*;
import java.util.*;

class Product implements Serializable{
    protected int pId;
    protected String pName;
    protected int pRate;

    static int count;
    {
        count++;
    }

    public static void getProductCount(){
        System.out.println(count);
    }

    public String getName(){
        return pName;
    }

    public void setpName(String pName){
        this.pName= pName;
    }

    public int getpId(){
        return pId;
    }

    public void setpId( int id){
        pId = id;
    }

    public int getpRate(){
        return pRate;
    }

    public int getCount(){
        return count;
    }

    public Product(String name , int rate , int id){
        pName = name;
        pRate = rate;
        pId = id;
    }

    public String toString(){
        return " Product id is " + pId + " name is " +pName ;
    }

        
    public Product() {
    }
}

public class _4WriteObject {
    public static void main(String[] args) {
        Product p1 = new Product("ABC" , 100 , 11);

        Product p2 = new Product("Week", 1000 , 12);

        Product p3 = new Product("DGH" , 100, 13);
        
        try {
            FileOutputStream fileOut = new FileOutputStream("ProductDetails.dat");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(p1);
            objOut.writeObject(p2);
            objOut.writeObject(p3);

            objOut.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}