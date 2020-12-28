
package conditionalexpression;

public class ConditionalExpression {

    public static void main(String[] args) {
        /*
            CONDITIONAL_EXPRESSION
        
            EXPRESSION ? THE_THING_TO_EXECUTE_IF_EXPRESSION_IS_TRUE : THE_THING_TO_EXECUTE_IF_EXPRESSION_IS_FALSE;
            2 5
        */
        
        int x = 6;
        
//        if (x % 2 == 0)
//            System.out.println("even");
//        else
//            System.out.println("odd");
//        
        String isEven = x % 2 == 0 ? "even" : "odd";
        
        System.out.println(isEven);
    }
    
}
