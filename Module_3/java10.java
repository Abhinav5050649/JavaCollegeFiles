import java.util.Scanner;

class InsufficientFundsException extends Exception
{
    public InsufficientFundsException(String str)
    {
        super(str);
    } 
}

class BankAccount{
    int Balance;
    String Name;
    String Id;

    BankAccount()
    {
        Balance = 0;
        Name = "";
        Id = "";
    }

    BankAccount(int b, String N, String id)
    {
        this.Balance = b;
        this.Name = N;
        this.Id = id;
    }

    public void Deposit(int amount)
    {
        this.Balance += amount;
    }

    public void Withdraw(int b) throws InsufficientFundsException
    {
        if (this.Balance - b < 0)
        {
            throw new InsufficientFundsException("Not Sufficient Funds");
        }
        else{
            System.out.println("Sufficient Balance");
            this.Balance -= b;
        }
    }

    public void PrintDetails()
    {
        System.out.println("Account Holder Name: " + this.Name);
        System.out.println("Account Id: " + this.Id);
        System.out.println("Account Balance: " + this.Balance);
    }
}

public class java10 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        BankAccount ac1 = new BankAccount(0, "X", "696io6");
        
        ac1.PrintDetails();
        System.out.println();
        
        ac1.Deposit(1000);

        try{
            ac1.Withdraw(400);
            ac1.PrintDetails();
            System.out.println();
            
            ac1.Withdraw(300);
            ac1.PrintDetails();
            System.out.println();
            
            ac1.Withdraw(500);
            ac1.PrintDetails();
            System.out.println();

        }catch(InsufficientFundsException e)
        {
            System.out.println("Exception caught");
            System.out.println("Insufficient Funds Exception: " + e);
        }finally{
            System.out.println();
            System.out.println("Exiting Program!");
            System.out.println();
        }

        sc.close();
    }
}