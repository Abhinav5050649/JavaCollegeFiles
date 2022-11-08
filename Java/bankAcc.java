import java.util.Scanner;

public class bankAcc{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        // savingsAccount s = new savingsAccount();
        // s.getAccDetails();
        
        System.out.print("Enter number of accounts: ");
        int numberOfAccounts = sc.nextInt();

        bankAccount[] accounts = new bankAccount[numberOfAccounts];
        
        //String name1 = "A", id1 = "Id1";
        System.out.println();
        //int  balance = 10;
        for (int i = 0; i < numberOfAccounts; ++i)
        {
            System.out.println("Enter account holder name: ");
            String nameOfAccountHolder = sc.nextLine();
            //name1 = name1 + "A";
            System.out.println("Enter account id: ");
            String id = sc.nextLine();
            //id1 = id1 + "A"; 
            System.out.println("Enter balance in account: ");
            int balance = sc.nextInt();
            accounts[i] = new bankAccount(id, nameOfAccountHolder, balance);
            //balance *= 10;
            accounts[i].printDetailsOfAccountHolder();
        }

        int op =-1;
        do
        {   
            System.out.println("Enter name of User: ");
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

                        if (amountToWithdraw > accountObj.getaccBalance())
                        {
                            System.out.println("Lack of funds!");
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

                        accountObj.setaccBalance(accountObj.gektaccBalance() + amountToDeposit);
                    }
                }
                else
                {
                    System.out.println("Bye!");
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
    private String bankName;
    
    public
    static int count;
    
    bankAccount(String accid, String accName, int balance)
    {
        this.accBalance = balance;
        this.bankName = "HDFC";
        this.accId = accid;
        this.accHolderName = accName;
        count++;
    }

    bankAccount()
    {
        bankName = "HDFC";
        count++;
        this.accBalance = 0;
        this.accHolderName = "To be filled later";
        this.accId = "0x0x0x0";
    }
    
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
        System.out.print("Account Holder Name: " + getaccHolderName() + "\nAccount ID: " + getaccId() + "\nBalance: " + getaccBalance() + "\nBank Name: " + this.bankName + "\nNumber of Accounts in Bank: " + getCountOfAccounts() + "\n\n");
    }
}

class savingsAccount extends bankAccount{
    public
    void getAccDetails(){
        System.out.println("Money in account: " + getaccBalance());
    }
}