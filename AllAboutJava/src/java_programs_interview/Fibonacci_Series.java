package java_programs_interview;

public class Fibonacci_Series {

    public static void main(String[] args) {
    	
    	
    	
        int n = 10;  // Number of terms in the Fibonacci series

        int first = 0, second = 1;
 
       

       
        
        for (int i = 0; i < n; i++) {
        	
           
            
            int nextTerm = first + second;  // Calculate the next term
            
            first = second;  // Move the first term to second
            
            second = nextTerm;  // Move the second term to next term
            
            System.out.println(nextTerm);
        }
    }
}
