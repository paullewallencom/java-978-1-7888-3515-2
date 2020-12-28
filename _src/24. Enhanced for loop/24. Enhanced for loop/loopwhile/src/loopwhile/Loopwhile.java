
package loopwhile;

public class Loopwhile {

    public static void main(String[] args) {
        String[] videoCourses = 
        {
            "C++", 
            "C++ operating on files", 
            "Java",    
            "Java Android",
            "Java Database",
            "JavaScript",
            "Grunt.js",
            "SASS"
        };
        
        //for (INITILIZATION; CONDITION; THINGS TO DO AFTER EACH ITERATION)
        for(int i = 0; i < videoCourses.length;  i++) //6
        {
            System.out.println(videoCourses[i]); 
        }
        /*
            ENHANCED FOR - upgraded loop for            
        */
        
        int i = 0;
        
//        for(String myValue: videoCourses)
//        {
//            i++;
//            
//            if (i == 5)
//                System.out.println("lalal");
//            System.out.println(myValue);
//        }
        
        //10 20 30 40 50 60 70 80
//        do
//        {
//            System.out.println(videoCourses[i]);            
//            i++;  
//            
//        }while(i < videoCourses.length);

    }
    
}
