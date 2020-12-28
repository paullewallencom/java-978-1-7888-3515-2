
package references;

public class References {

    public static void main(String[] args) {
        
//        int x = 30;
//        int y = x;
//        
//        y = 10;
//        
//        System.out.println(x);
        
//        Test test = new Test(); //reference variable BECAUSE you refer to the place in the memory THIS IS ADDRESS
//        Test test2 = test;
//        
//        test2.a = 50;
//        
//        System.out.println(test.a);
        
        String name = "Arkadiusz";
        String name2 = name;
        
        name2 = "Viola";
        
        System.out.println(name);
      
    }
    
}

class Test
{
    int a = 20;
}