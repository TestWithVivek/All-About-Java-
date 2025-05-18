package java_programs_interview;

public class Armstrong_Number {

	
	 

	    public static void main(String[] args) {
	        int number = 153; 
	        int original = number;
	        int result = 0;

	        int count = 0;
	        int temp = number;

	        // Step 1: Count the number of digits
	        while (temp != 0) {
	            count++;
	            temp = temp / 10;
	        }

	        temp = number;

	        // Step 2: Calculate sum of digits raised to the power of count
	        while (temp != 0) {
	            int digit = temp % 10;
	            int power = 1;

	            // Raise digit to the power of 'count' manually
	            for (int i = 0; i < count; i++) {
	                power = power * digit;
	            }

	            result = result + power;
	            temp = temp / 10;
	        }

	        // Step 3: Compare the result with original number
	        if (result == original) {
	            System.out.println(original + " is an Armstrong number.");
	        } else {
	            System.out.println(original + " is not an Armstrong number.");
	        }
	    }
	}


