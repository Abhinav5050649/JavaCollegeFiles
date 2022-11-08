import java.util.*;

class InvalidException extends Exception{
    
}
public class bankAcc{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of accounts: ");
        int numberOfAccounts = sc.nextInt();
        bankAccount[] accounts = new bankAccount[numberOfAccounts];
        
        for (int i = 0; i < numberOfAccounts; i++)
        {
            
            System.out.println("Enter Bank Name: ");
            String bName = sc.nextLine();
            
            System.out.println("Enter name of account holder: ");
            String nameOfAccountHolder = sc.nextLine();
            
            
            System.out.println("Enter Account Id: ");
            String id = sc.nextLine();

            System.out.println("Enter balance in account: ");
            int balance = sc.nextInt();
            
            accounts[i] = new bankAccount(bName, id, nameOfAccountHolder, balance);
            accounts[i].printDetailsOfAccountHolder();
        }

        int op = -1;
        do
        {   
            System.out.print("Enter name of user: ");
            String nameOfUser = sc.nextLine();
            bankAccount accountObj= null;
            for (int i= 0; i < numberOfAccounts; ++i)
            {
                if (accounts[i].getaccHolderName().equals(nameOfUser))
                {
                    accountObj =accounts[i];
                }
            }

            if (accountObj == null)
            {
                break;
            }
            else
            {
                System.out.print("Do you wish to carry out any transactions[1/0]: ");
                op = sc.nextInt();

                if (op == 1)
                {
                    System.out.print("Press 1 to withdraw and 2 to deposit: ");
                    int choice = sc.nextInt();
                    
                    if (choice == 1)
                    {
                        System.out.print("Enter amount to withdraw: ");
                        int amountToWithdraw = sc.nextInt();

                        if (amountToWithdraw < accountObj.getaccBalance())
                        {
                            System.out.println("Bhai ruko zara! Sabar karo!");
                        }
                        else 
                        {
                            accountObj.setaccBalance(accountObj.getaccBalance() - amountToWithdraw);
                        }
                    }
                    else if (choice == 2)
                    {
                        System.out.print("Enter amount to deposit: ");
                        int amountToDeposit = sc.nextInt();

                        accountObj.setaccBalance(accountObj.getaccBalance() + amountToDeposit);
                    }
                }
                else
                {
                    System.out.println("Ok. Chalo khatam. Tata. Bye bye!");
                }
            }
        }   
        while (op != 0);
        sc.close();
    }
}

class bankAccount{
    private String accId;
    private String accHolderName;
    private int accBalance;
    
    public
    String bankName;
    static int count;
    
    bankAccount(String bName, String accid, String accName, int balance)
    {
        this.accBalance = balance;
        bName = bankName;
        this.accId = accid;
        this.accHolderName = accName;
        count++;
    }

    {
        System.out.println(" Initilizer block super class");
    }

    // bankAccount()
    // {
    //     bankName = "XYZ";
    //     count++;
    //     this.accBalance = 0;
    //     this.accHolderName = "To be filled later";
    //     this.accId = "0x0x0x0";
    // }
    
    int getCountOfAccounts()
    {
        return count;
    }

    String getaccId()
    {
        return this.accId;
    }

    void setaccId(String id)
    {
        this.accId = id;
    }

    String getaccHolderName()
    {
        return this.accHolderName;
    }

    void setaccHolderName(String nameHolder)
    {
        this.accHolderName = nameHolder;
    }

    int getaccBalance()
    {
        return this.accBalance;
    }

    void setaccBalance(int balance)
    {
        this.accBalance = balance;
    }

    void printDetailsOfAccountHolder()
    {
        System.out.print("Account Holder Name: " + getaccHolderName() + "\nAccount ID: " + getaccId() + "\nBalance: " + getaccBalance() + "\nBank Name: " + bankName + "\nNumber of Accounts in Bank: " + getCountOfAccounts() + "\n\n");
    }
}

class SavingAccount extends bankAccount{
    private int accBalance;

    public SavingAccount(String bName, int i, String accName, int balance) {
        super(bName, i, accName, balance);
        
    }

    {
        System.out.println(" initilizer block of saving acoount ");
    }

    int getaccBalance()
    {
        return this.accBalance;
    }

    void setaccBalance(int balance)
    {
        this.accBalance = balance;
    }

    if(accBalance >=1000){
        System.out.println("You have appropriate balance");
    }
}



