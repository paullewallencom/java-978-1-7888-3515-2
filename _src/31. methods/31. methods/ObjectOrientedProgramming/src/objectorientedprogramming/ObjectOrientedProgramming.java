package objectorientedprogramming;


public class ObjectOrientedProgramming {


    public static void main(String[] args) {
        /*
            Objects - containers that stores variables and functions thematically 
                      connected to each other for easier future usage
            Classes - blueprint for creating instances (copies) of objects      
            
            Properties - features (part of something)
            Methods - functions
        */

        
        Test a = new Test();
        
        a.printSomethingOut("Arek", "Włodarczyk");
        a.printSomethingOut("Viola", "Włodarczyk");
        a.printSomethingOut("Viola", "Włodarczyk");
        a.printSomethingOut("Viola", "Włodarczyk");
        a.printSomethingOut("Viola", "Włodarczyk");
        a.printSomethingOut("Viola", "Włodarczyk");
        
        double result = a.divide(100, 0);
        
        System.out.println(result);
    }
    
}

class Test
{
    void printSomethingOut(String name, String surname)
    {
        System.out.println("Name: " + name);
        System.out.println("Surname " + surname);
    }
    
    int add(int x, int y)
    {
        return x + y;
    }
    
    double divide(double x, double y)
    {
        if (y == 0)
            return 0;
        
        
        System.out.println("test");
        return x / y;
    }
    
}
