package java_programs_interview;

public class Prime_Number {

	
	public static void main(String[] args) {
		
		// Prime Number: Prime number is the number which is divisible by 1 and the number itslef 
		//e.g. 2, 3 , 5 , 7, 11, 13
		 
		
		int number = 10;
		
		int count=0;
		
		for(int i=1;i<=number;i++) {
			
			
			if(number%i==0) {
				
				count++;
				
			}
			
		}
	
		if (count == 2) {
			
            System.out.println(number + " is a prime number.");
            
        } else {
        	
            System.out.println(number + " is not a prime number.");
        }
		
		
		
		
	}
}
