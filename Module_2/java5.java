import java.io.*;
import java.util.*;
import java.util.prefs.BackingStoreException;

class bankAcc
{
    private int accBalance;
    public String NameAccHolder;

    final int Pre = 1;

    bankAcc()
    {
        this.accBalance = 0;
        this.NameAccHolder = "";
    }

    bankAcc(int b, String name)
    {
        this.accBalance = b;
        this.NameAccHolder = name;
    }

    void setBalance(int b)
    {
        this.accBalance = b;
    }

    int getBalance()
    {
        return this.accBalance;
    }

    void printDetails()
    {
        System.out.println("Pre value = " + this.Pre);
        System.out.println("Name of account holder = " + this.NameAccHolder);
        System.out.println("Balance in Account = " + this.getBalance());
    }

    bankAcc returnDummyAccount()
    {
        bankAcc b =  new bankAcc();
        return b;
    }
}

public class java5 {
    public static void main(String[] args) {

        bankAcc ac = new bankAcc(0, "a");
        System.out.println(ac.getBalance());
        ac.setBalance(1000);
        System.out.println(ac.getBalance());

        bankAcc ac1 =  new bankAcc(1009, "b");

        ac.printDetails();
        ac1.printDetails();

        bankAcc n = ac.returnDummyAccount();

        n.printDetails();
    }
}