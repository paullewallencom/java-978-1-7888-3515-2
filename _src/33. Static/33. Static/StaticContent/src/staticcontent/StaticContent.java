package staticcontent;

public class StaticContent {
    int a;
    void sample()
    {
        this.a = 5;
    }
    
    public static void main(String[] args) {
//        
//
//        double result = Math.add(5, 165);
//        
//        System.out.println(result);
        
        StaticContent blabla = new StaticContent();
        blabla.sample();
        
        Customer[] p = new Customer[3];
        
        p[0] = new Customer("Arkadiusz");
        p[1] = new Customer("Viola");
        p[2] = new Customer("Karol");
  
        System.out.println(p[0].id);
        System.out.println(p[1].id);
        System.out.println(p[2].id);
       
        System.out.println(Customer.nextId);
    }
    
}

class Math
{
    int test;
    static double add(double a, double b)
    {        
        return a + b;
    }
}

class Customer
{
    Customer(String name)
    {
        this.name = name;
        id = nextId;
        
        nextId++;
    }
    String name;
    int id = 0;
    static int nextId = 1;
    
}