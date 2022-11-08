import java.util.*;
import java.io.*;


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

public class JavaSet {
    public static void main(String[] args) {
        
        HashSet<String> s1 = new HashSet<String>();

        s1.add("Hello");
        s1.add("World"); s1.add("Hello"); s1.add("ABC");
        String ans = "Hello";
        s1.add(ans);

        Iterator it = s1.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next() + " ");
        }

        System.out.println();
        System.out.println();

        HashSet<Product> p = new HashSet<Product>();

        p.add(new Product("A", 1));
        p.add(new Product("B", 2)); 
        p.add(new Product("C", 3));
        p.add(new Product("A", 1));

        Iterator it1 = p.iterator();

        while (it1.hasNext())
        {
            Product p1 = (Product) it1.next();
            System.out.println(p1.getpRate() + " " + p1.getName());
        }

        System.out.println();
        System.out.println();

        TreeSet<String> ts1 = new TreeSet<String>();
        ts1.add("Hello");
        ts1.add("World"); ts1.add("Hello"); ts1.add("ABC");
        ts1.add(ans);

        it = ts1.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next() + " ");
        }

        System.out.println();
        System.out.println();

        Comparator cmp =  new Comparator() {
            public int compare(Object a, Object b)
            {
                Product fe = (Product) a;
                Product se = (Product) b;

                if (fe.getpRate() != se.getpRate())
                {
                    return (int)(se.getpRate() - fe.getpRate());
                }

                return (fe.getpId() - se.getpId());
            }
        };

        TreeSet<Product> ts2 = new TreeSet<Product>(cmp);
        ts2.add(new Product("C", 1));
        ts2.add(new Product("X", 2)); 
        ts2.add(new Product("C", 1));
        ts2.add(new Product("D", 3));

        Iterator itn = ts2.iterator();

        while (itn.hasNext())
        {
            Product p1 = (Product) itn.next();
            System.out.println(p1.getpRate() + " " + p1.getName());
        }
    }
}
