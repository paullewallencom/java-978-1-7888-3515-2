package bottle;

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
    boolean pour(double amount)
    {
        if (this.waterAmount > amount)
            this.waterAmount -= amount;
        else
            return false;
        
        return true;
    }    
    
    void transferWater(double amount, Bottle transferToBottle)
    {
        if (this.pour(amount))
        {
            transferToBottle.fill(amount);
        }
        else
            System.out.println("Tere is not enough water to transfer");
        
    }
    
    
    public static void main(String[] args) {
        
        Bottle[] bottle = new Bottle[3]; // NULL
        
        
        bottle[0] = new Bottle(10);
        bottle[1] = new Bottle(5);
        bottle[2] = new Bottle(1);
 
        bottle[0].transferWater(155, bottle[1]);
        
        System.out.println(bottle[0].getWaterAmount());
        System.out.println(bottle[1].getWaterAmount());
        
    }
    
}
