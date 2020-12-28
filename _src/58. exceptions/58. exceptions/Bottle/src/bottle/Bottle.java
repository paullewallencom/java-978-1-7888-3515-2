package bottle;

class NotEnoughWaterException extends Exception
{

    public NotEnoughWaterException(String string) {
        super(string);
    }
    
}

public class Bottle {
    private double waterAmount;
    
    double getWaterAmount()
    {
        return waterAmount;
    }
    
    Bottle(double waterAmount)
    {
        this.waterAmount = waterAmount;
    }
    
    void fill(double amount)
    {
        this.waterAmount += amount;
    }
    void pour(double amount) throws NotEnoughWaterException
    {
        if (this.waterAmount > amount)
            this.waterAmount -= amount;
        else
            throw new NotEnoughWaterException("There is not enough water");
    }    
    
    void transferWater(double amount, Bottle transferToBottle) throws NotEnoughWaterException
    {
        this.pour(amount);
      
        transferToBottle.fill(amount);
  
        
    }
    
    
    public static void main(String[] args) {
        Bottle b = new Bottle(5);
        Bottle b2 = new Bottle(10);
       
        try 
        {
            b.transferWater(10, b2);
        } 
        catch (NotEnoughWaterException ex) 
        {
            System.out.println("There was not enough water so we transferred the water that was left in the bootle b");
        } 
    
        
        
        
        try
        {
            System.out.println(5/0);
            
            int a = 0;
            if (a  == 0)
                throw new OurException("you are naughty a cannot be 0");
            
            System.out.println("nothing here will execute if exception was ");
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        } 
        finally
        {
            System.out.println("soo this line will execute always");
        }
        /*
            try
            {
                //instrucitons to try
            }
            catch(Exception ex)
            {
                //here are instructions that you do in order to make your program work
            }
        
        
        */
    }
    
}

class OurException extends Exception
{

    public OurException(String string) {
        super(string);
    }
    
}