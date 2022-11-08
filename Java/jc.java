public class jc {
    public static void main(String[] args)
    {
        Product[] p =  new Product[5];
        int sum = 0;
        for (int i =0; i < 5; ++i)
        {
            p[i] =  new Product();
            p[i].setRate(i);
        }

        for (int i = 0; i < 5; ++i)
        {
            sum += p[i].getRate();
        }
        System.out.println("Sum = " + sum);
    }
}

// Create Employee class with necessary info

class Product{
    private String namae;
    private int Id;
    private int Rate;
    static int count;

    public

    Product(String name, int id, int rate)
    {
        this.namae = name;
        this.Id = id + ++count;
        this.Rate = rate;
        
    }

    Product()
    {
        this(null, 0, 0);
    }

    int getCount()
    {
        return count;
    }
    String getNamae()
    {
        return this.namae;
    }

    void setNamae(String nam)
    {
        this.namae = nam;
    }

    void setId(int i)
    {
        this.Id = i;
    }

    int getId()
    {
        return this.Id;
    }

    void setRate(int rate)
    {
        this.Rate = rate;
    }

    int getRate()
    {
        return this.Rate;
    }
}