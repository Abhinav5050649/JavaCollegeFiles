class employee{
    private String name;
    protected int salary;

    public

    employee()
    {
        this.name = "XYZ";
        this.salary = 10000;
    }
}

class salesperson extends employee{
    private int sales;

    public int getSales() {
        return sales;
    }

    public void setSales(int sales)
    {
        this.sales = sales;
    }

    public void changeSalary()
    {
        if (this.sales > 100000)
        {
            this.salary += (int)(0.1 * this.salary);
        }
        else
        {
            this.salary += (int)(0.01 *this.salary);
        }
    }
}

public class emp {
    public static void main(String[] args) {
        
    }
}
