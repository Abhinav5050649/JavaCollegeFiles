
class EmployeeTest{
    private String name;
    private int id=100;
    private int hour;
    private int rate;

    static int count;

    {
        count++;
        id = id +1;
    }

    public String getName(){
        return name;
    }

    public int getid(){
        return id;
    }

    public int gethour(){
        return hour;
    }

    public int getrate(){
        return rate;
    }

    public EmployeeTest(String name , int hour , int rate){
        this.name=name;
        this.hour = hour;
        this.rate=rate;
    }

}

class SalesEmployee extends EmployeeTest{
    private int sales;

    public SalesEmployee(String name, int hour, int rate ) {
        super(name, hour, rate);
        System.out.println(" Specialemployee constructor ");
    }

    public int getsales(){
        return sales;
    }


    // if(sales >=100000){
    //     rate +=10;
    // }
}

public class Employee{

    public static int getIncome(EmployeeTest[] emp){
        int product=1;

        for (int i = 0; i < emp.length; i++) {
            product *= emp[i].getrate()* emp[i].gethour();
        }
        return product;
    }

    public static void main(String args[]) {
        EmployeeTest obj1 = new EmployeeTest("Dhvani", 12, 120);
        EmployeeTest obj2 = new EmployeeTest("Murli", 10, 110);

        SalesEmployee s1 = new SalesEmployee("Murli", 123, 1000);
        //  EmployeeTest obj1 = new EmployeeTest();
        // EmployeeTest obj2 = new EmployeeTest();
        EmployeeTest[] empTests = {obj1 , obj2};

        System.out.println(getIncome(empTests));

    }

}