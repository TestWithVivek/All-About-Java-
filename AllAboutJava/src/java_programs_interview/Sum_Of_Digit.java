package java_programs_interview;

import java.util.Scanner;

public class Sum_Of_Digit {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int num = sc.nextInt();
        int original = num; 
        
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev  + digit;
            num = num / 10;
        }

        System.out.println("Sum of digits of " + original + " is: " + rev);

     
    }
	
	
	
}
