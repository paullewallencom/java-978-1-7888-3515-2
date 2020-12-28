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
        
        Monitor monitor1 = new Monitor();
        
        monitor1.width = 1000;
        
        
        
        Monitor monitor2 = new Monitor();
        
        monitor2.width = 20000;
        
        monitor2.getWidth();
        monitor1.getWidth();
        
        String name = "Arkadiusz";
        
        System.out.println(name.charAt(4));
        
        
        
    }
    
}

class Monitor
{
    int width;
    int height;
    int brightness;
    
    void changeBrigthness()
    {
        /*
            THIS IS PLACE FOR INSTRUCTION TO BE DONE
        */
    }
    void getWidth()
    {
        System.out.println(width);
    }
    
}