package org.program;

public class EvenOddCount {

	
	public static void main(String[] args) {
		
		int n=10;
		int evencount=0;
		int oddcount=0;
		
		for (int i = 0; i <= n; i++) {
			
			if (i%2==0) {
			
				evencount=evencount+1;
				
			}
			
			else {
				oddcount=oddcount+1;
			}
			
			
		}
		
		System.out.println("Count:"+evencount);
		System.out.println("Count:"+oddcount);
		
	}
}
