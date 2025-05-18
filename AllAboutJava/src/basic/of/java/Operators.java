package basic.of.java;

public class Operators {
	
	

	public static void main(String [] args) {
		
// Artithmatic operators 
		
		int a = 20;
		int b = 10;
		int c = 5;
		
		//Addition  
		int D = a+b;
		System.out.println("The Addition of D- "+ D);
		
		//Substraction
		int E = a-5;
		System.out.println("The Substraction of E- " + E);
		
		//Multiplication 
		int F = c*b;
		System.out.println("The Multiplication of F- " + F);
		
		//Division 
		int G = a/c;
		System.out.println("The Division of G- " +G);
		
		//modules 
		int H = a%c;
		System.out.println("The Moduler if H- " + H);
				
		
// Unary Operator 
		// It has 4 types 
		// Post increment and Post descrement 
		// Pre increment and Pre descrement 
		
	//	1. Post Increment & Post Decrement : first write the value and then at the backend save incresed or descred value 
	//	2. Pre- Increment & Pre Decrement : first write the incresed or descred value and save same value at backend 
		
	   int x = 30;
	   int y = 5;
	   int z = 10;
	   
	   System.out.println(x++ + y-- + ++z + --x); 
	   System.out.println(--y + ++y - y++ + z++ - ++x + x++);
	
	   
// Conditional Operator : To check and verify the condition in java
	   // <  >  <=   >=  ==  !=  
	   
	   System.out.println(x>a);
	   
	   System.out.println(y>b);
	   
	   System.out.println(a>=c);
	   
	   System.out.println(a/2<=b);
	   
	   System.out.println(c==y);
	   
	   System.out.println(c!=x);
	   
	   
// Logical Operator : To perform the logical operator in java
	   
	   // && - both the conditions should be true then only it will return true 
	   // || - any one condition is true, it will return true 
	   
	   System.out.println(a>c && c==y);   // here both the conditions are true, hence it returns true 
	   
	   System.out.println(a>c && c==b);   // here one of the condition is false, hence it returns false 
	   
	   System.out.println(x<a || y<b);    // one of the condition is true, it returns true 
	   
	   System.out.println(x==b || c==a);  // both the conditions are false, hence it returned false 
	   
			   
	   
	   
		
		
		
	}

}
