package java_programs_interview;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int num = sc.nextInt(); 
        
        int i;
        
        int temp=0;

       for(i=2; i<num; i++) {
    	   
    	   if(num%i==0) {
    		   
    		   temp++;
    		   
    		   
    	   }
    	   
       }
       
       if(temp==0) {
    	   
    	   System.out.println("The given numnber is Prime number");
    	   
       }else {
    	   
    	   System.out.println("The given number is not Prime nnumber");
       }

      
    }
		
	
}
