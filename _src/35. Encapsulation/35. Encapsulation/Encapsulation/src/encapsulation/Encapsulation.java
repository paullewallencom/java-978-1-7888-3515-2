package encapsulation;

public class Encapsulation {

    public static void main(String[] args) {
        /*
          Encapsulation        - packing properties that way,
                                 so there is no direct access to them
                                 from other classes

        */
        
        BankAccount a = new BankAccount();
        
        a.deposit(1500);
        
        if (a.withdraw(24))
            System.out.println("OK");
        else
            System.out.println("NOT ENOUGH MONEY");
    
        System.out.println(a.getBalance());
        
    }
    
}

class BankAccount
{

    public BankAccount() 
    {
        balance = 1000;
    }
    
    private int balance;
    
    int getBalance() //getter
    {
        return balance;
    }
    
    private void setBalance(int amount)
    {
        /*
            I CAN MAKE HERE TONS OF CONDITIONS
        */
        balance = amount;
    }
    
    boolean withdraw(int amount)
    {
        if (balance > amount)
            setBalance(balance - amount);
        else
            return false;
        
        return true;
    }
    boolean deposit(int amount)
    {
        setBalance(balance + amount);
        
        return true;
    }
}