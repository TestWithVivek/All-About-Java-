package basic.of.java;

public class Looing_Nested_For_Loop {
	
	public static void main(String[] args) {
		
		
		int i;
		
		int j;  
		
		for(i=0; i<2; i++) {
			
			for(j=0; j<3; j++) {                    // in this loop, the external loop will execute only when internal look completes
				
			System.out.println(i + "" +j);	
				
				
			}
			
			
		}
		
	}
	

}
