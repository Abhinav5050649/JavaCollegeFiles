import java.io.Serializable;
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




public class ProductTest{

    public static int totalRate(Product[] prd){
        int sum=0 ;
        for (int i = 0; i < prd.length; i++) {
            sum = sum + prd[i].getpRate();
        }
        return sum;
    }
     public static void main(String[] args) {

        List store = new ArrayList();

        Product p1 = new Product("ABC" , 100);

        Product p2 = new Product("XYZ", 1000);

        // System.out.println(p1.getName());

        // System.out.println(p2);

        Product[] prd = { new Product("Book ", 35), new Product(" gg", 56)};


        store.add(p1);
        store.add(p2);

        Iterator i = store.iterator();
		
		while (i.hasNext())
		{
			Product p = (Product) i.next();
			System.out.println(p + "\t" + p.getName());
		}

        //System.out.println(totalRate(prd));
     }

}