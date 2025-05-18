package strings.in.java;

public class String_functions {

	public static void main(String[] args) {
		
		//String is the Class in Java, and this class has number if methods/functions 
		
		
		String s1 = "Vivek Vardhan"; 
		
		String s2 = "QA Engineer"; 
		
		
		System.out.println(s1.length());     // its return type is int
		
		System.out.println(s1.startsWith("V"));  // its return type is boolean 
		
		System.out.println(s2.endsWith("x"));   // its return type is boolean 
		
		System.out.println(s2.toLowerCase());   // its return type is string 
		 
		System.out.println(s1.toUpperCase());   // its return type is string 
		
		
		
		
		//To check both strings are equals or not we use equals 
		
		System.out.println(s1.equalsIgnoreCase(s2));    // its return type is false 
		
		
		
		//Ignore the case sensitivity 
		
		System.out.println(s1.equalsIgnoreCase(s2));  // its return type is boolean
		
		//to check the given string is empty or not 
		
		System.out.println(s2.isEmpty());            // its return type is false 
		
		
		// if the given string or char contains or not 
		
		System.out.println(s2.contains("Q"));         // its return type is boolean 
		
		
		//to concatinate two strings 
		
		System.out.println(s1.concat(s2));   // its return type is string 
		
		
		// to print the char of the given index in the string 
		
		System.out.println(s2.charAt(3));          // its return type is Char
		
		//to find the index of the given char 
		
		System.out.println(s2.indexOf("Q"));        //its resturn type is int
		
		
		// to remove the space in the string 
		
		System.out.println(s2.trim());          // its resturn type is string 
		
		// to replace the string 
		
		System.out.println(s1.replace("Vivek", "Vardhan"));
 		 
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
