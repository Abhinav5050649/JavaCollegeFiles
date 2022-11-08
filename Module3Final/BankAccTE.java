import java.util.Scanner;

class WithdrawError{
    int Balance;

    void deposit(int deposit) {
        Balance = deposit;
    }

    void withdraw(int Amount) throws Exception
    {
        int new_Balance = Balance - Amount;
        if (new_Balance < 0) 
        {
            throw new Exception("Not Sufficient Balance");
        } 
        else 
        {
            Balance = new_Balance;
            System.out.println("Remaining Balance : " + Balance);
        }
    }
}

public class BankAccTE {
    public static void main(String args[])
    {
        WithdrawError b = new WithdrawError();
        b.deposit(1000);
        try
        {
            System.out.println("\nWithdrawing 200");
            b.withdraw(200);
            System.out.println("\nWithdrawing 300");
            b.withdraw(300);
            System.out.println("\nWithdrawing 1000");
            b.withdraw(1000);
        }
        catch(Exception e)
        {
            System.out.println("Insufficient Balance!!");
            System.out.println(e.getMessage());
        }
    }
}

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
        if (this.Balance - b < 0)
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
