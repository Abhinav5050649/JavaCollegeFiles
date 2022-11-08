import java.io.*;
import java.util.*;

class Product implements Serializable{
    private int pId;
    private String pName;
    private int pRate;

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

    // return total number of id created
    public int getCount(){
        return count;
    }

    public Product(String name , int rate){
        pName = name;
        pRate = rate;
    }

    public String toString(){
        return " Product id is " + pId + " name is" +pName ;
    }

}

public class HashSetTest {
    public static void main(String[] args)
    {
        HashSet ts1 = new HashSet<Product>();
        
        Product emp = new Product("askn", 18);
        ts1.add(new Product("A", 1));
        ts1.add(emp);
        ts1.add(new Product("C", 3));
        ts1.add(new Product("B", 2));
        ts1.add(emp);

        Iterator it = ts1.iterator();

        while (it.hasNext())
        {
            Product p = (Product) it.next();

            System.out.println(p.getName() + " has " + p.getpRate());
        }
    }
}
