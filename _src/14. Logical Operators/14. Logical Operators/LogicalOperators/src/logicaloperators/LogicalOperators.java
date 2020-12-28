
package logicaloperators;

public class LogicalOperators {

    public static void main(String[] args) {
        /*
            Logical Operators
            
            true false
        
            ! - NEGATION - NO
        
            !true - false
            !false - true
        
            && - conjunction - AND
        
            expr1 expr2 result
            true  true  true
            true  false false
            false true  false
            false false false
        
            CONJUNCTION IS TRUE ONLY if BOTH expressions are true in the same time
        
            || - alternative - OR - disjunction
        
            expr1 expr2 result
            true  true  true
            true  false true
            false true  true
            false false false
            
            DISJUNCTION IS FALSE ONLY when BOTH expressions are FALSE in the SAME TIME
            
        */
        String password = "asfasf";
        String repeatedPassword = "asdasd";
        boolean isTermsOfConditionChecked = true;

            
        System.out.println(!true);
        int a = 5,
            b = 5,
            c = 7;
            //false  false
        if (a != b || c > 4)
            System.out.println("TEXT IS NOT VISIBLE IF THE CONDITION IS NOT MET");
    }
    
}
