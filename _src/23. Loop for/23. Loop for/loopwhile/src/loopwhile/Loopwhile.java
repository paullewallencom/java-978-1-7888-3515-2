
package loopwhile;

public class Loopwhile {

    public static void main(String[] args) {
        String[] videoCourses = 
        {
            "C++", 
            "C++ operating on files", 
            "Java",    
            "Java Android",
            "JavaScript",
            "Grunt.js",
            "SASS"
        };
        
        //for (INITILIZATION; CONDITION; THINGS TO DO AFTER EACH ITERATION)
        for(int i = 0; i < videoCourses.length;  i++) //6
        {
            System.out.println(videoCourses[i]); 
        }
        //10 20 30 40 50 60 70 80
//        do
//        {
//            System.out.println(videoCourses[i]);            
//            i++;  
//            
//        }while(i < videoCourses.length);

    }
    
}
