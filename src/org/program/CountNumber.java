package org.program;

public class CountNumber {

	public static void main(String[] args) {
		
		int num=123456789;
		int count=0;
		int remainder=0;
		
		while (num>0) {
			
			remainder=num%10;
			count=count+1;
			num=num/10;
			
			
		}
		
		System.out.println(count);
		
		
		
		
	}
	
	
	
}
