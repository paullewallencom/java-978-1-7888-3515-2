package nestedclasses;

public class Main 
{

    public static void main(String[] args) 
    {
        BankAccount bankAccount = new BankAccount(1000);
        
        System.out.println(bankAccount.getAccountBalance());
        
        bankAccount.calculateInterest(5);
        
        System.out.println(bankAccount.getAccountBalance());
        
        bankAccount.calculateInterest(5);
        
        System.out.println(bankAccount.getAccountBalance());

        bankAccount.calculateInterest(5);
        
        System.out.println(bankAccount.getAccountBalance());        
    }
    
}

class BankAccount
{
    public BankAccount(double accountBalance) 
    {
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() 
    {
        return accountBalance;
    }
    
    public void calculateInterest(final double interestRate)
    {
        
        class Interest
        {
            public Interest() 
            {
                this.interestRate = interestRate;
            }

            public double getInterestRate() 
            {
                return interestRate;
            }
            public void changeAccountBalance()
            {
                double interest = (accountBalance * interestRate) / 100;
                accountBalance += interest;
            }

            private double interestRate;
        }        
        
        Interest interest = new Interest();
        
        interest.changeAccountBalance();
        
    }
    
    private double accountBalance;
    

}