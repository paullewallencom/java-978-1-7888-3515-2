
package conditionalstatement;

public class ConditionalStatement {

    public static void main(String[] args) {
        /*
            CONDITIONAL STATEMENTS
            
            true false
            if (EXPRESSION)
                instrucion;
        */
        
        int a = 7,
            b = 7,
            c = 10;
        
        if (a < b || c > 6)
        {
            System.out.println("a < b || c > 6");
            System.out.println("test");            
        }
        else if (a > b)            
            System.out.println("a > b");
        else
        {
            System.out.println("something else happend");
            System.out.println("messageeHEREISGONNAEXECUTELAWAYS");
        }
        
        
        
    }
    
}
