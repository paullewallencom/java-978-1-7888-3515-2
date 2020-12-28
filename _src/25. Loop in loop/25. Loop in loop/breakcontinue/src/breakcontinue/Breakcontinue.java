package breakcontinue;


public class Breakcontinue {

    public static void main(String[] args) {
        /*
            1 2 3 4 5 6 7 8 9 10
        2 * 1 2 3 4 5 6 7 8 9 10
        3 * 1 2 3 4 5 6 7 8 9 10
        
            2 4 6 8 10 12 14 16 18 20
        
            3 6....
            
            4 8
        */
        
        for(int j = 1; j <= 10; j++) //j = 3
        {
            for(int i = 1; i <= 10; i++) //i = 8
            {
                System.out.print(i * j + " ");
            }
            System.out.println();            
        }
        
    }
    
}
