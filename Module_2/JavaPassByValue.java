class JavaPassByValue {
    
    public static void testpassByValue(Account ac , int amount ){
        amount +=1000;

        ac.deposit(7000);

        testpassByValue(ac, 7000);
        System.out.println("balance " , ac.getBalance());

    }

    public static void main(String args[]) {
        int amount = 2000;

        Account ac = new Account();
        
    }
}

class Account {

}