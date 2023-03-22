package org.program;

public class Armstrong {

	public static void main(String[] args) {
	
		
		int num=45678;
		
		int temp =num;
		
		int remainder=0;
		
		int mul=0;
		
		while (num>0) {
			
			
			remainder=num%10;
			mul=mul+(remainder*remainder*remainder);
			num=num/10;
			
		}
			if (temp==mul) {
				System.out.println("It is Armstrong");
				
			}
			
			else {
				System.out.println("It is not Armstrong");
			}
			
		}
		
		
	}
	
	
	

