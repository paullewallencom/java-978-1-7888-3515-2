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
        
        for(int j = 1; j <= 10; j++) //j =   
        {
            for(int i = 1; i <= 10; i++) //i = 5
            {               
                System.out.print(i * j + " ");
            }
            System.out.println();            
        }
        
        
//         for (int i = 0; i < 1255; i++)
//         {
//             if (i % 2 != 0)
//                 continue; //STOP EXECUTION OF THE CURRENT ITERATION BUT CONTINUE!!
//             
//             System.out.println(i);
//
//         }
    }
    
}
