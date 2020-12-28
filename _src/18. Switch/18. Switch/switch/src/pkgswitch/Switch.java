package pkgswitch;

public class Switch {

    public static void main(String[] args) {
        /*
            Switch 
        */
        
        int a = 50;
        
        switch(a)
        {
            case 50:
            case 100:
                System.out.println("a is equal to 50 or 100");
                break;
            case 150:
                System.out.println("a is equal to 150");   
                break;
            default:
                System.out.println("a is different it's not 50,100,150. A equals " + a);
        }
    }
    
}
