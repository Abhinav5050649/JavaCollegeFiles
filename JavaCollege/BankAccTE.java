import java.util.Scanner;

class InsufficientFundsException extends Exception
{
    public InsufficientFundsException(String str)
    {
        super(str);
    } 
}

class IllegalTransferException extends Exception
{
    public IllegalTransferException(String str)
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
        if (b < 0)
        {
            throw new InsufficientFundsException("Insufficient Funds");
        }
        else{
            System.out.println("Sufficient Balance");
            this.Balance -= b;
        }
    }

    public void Transfer(BankAccount ac) throws IllegalTransferException
    {   
        Scanner sc = new Scanner(System.in);

        String curName = Name, curId = Id;

        if (curName.equals(ac.Name) && curId.equals(ac.Id))
        {
            throw new IllegalTransferException("Same Account");
        }
        else{
            System.out.println("Transfer Started");
            System.out.println("Enter amount to withdraw: ");
            int amountToWithdraw = sc.nextInt();    

            try{
                Withdraw(amountToWithdraw);
                ac.Deposit(amountToWithdraw);
            }
            catch (InsufficientFundsException e)
            {
                System.out.println("Error caught");
                System.out.println("Lack of Funds: " + e);
            }
        }

        sc.close();
    }

    public void PrintDetails()
    {
        System.out.println("Account Holder Name: " + this.Name);
        System.out.println("Account Id: " + this.Id);
        System.out.println("Account Balance: " + this.Balance);
    }
}

public class BankAccTE {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        BankAccount ac1 = new BankAccount(1000, "X", "696io6");
        BankAccount ac2 = new BankAccount(2000, "Y", "102ur");

        ac1.PrintDetails();
        ac2.PrintDetails();   

        try{
            ac1.Transfer(ac2);
            System.out.println("Transfer Successful!");
            ac1.PrintDetails();
            ac2.PrintDetails();
        }catch(IllegalTransferException e)
        {
            System.out.println("Exception caught");
            System.out.println("Illegal Transfer Exception: " + e);
        }

        sc.close();
    }
}
