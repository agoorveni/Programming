package org.program;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int n = s.nextInt();
		int remainder=0;
		int rev=0;
		while (n>0) {
			
			remainder=n%10;
			rev=rev*10+remainder;
			n=n/10;
		}
		
System.out.println("Reversed number:" +rev);
	}
}
//		int num=123456;
//		int remainder=0;
//		int mul=1;
//		while (num>0) {
//			
//			
//			remainder=num%10;
//			mul=mul*remainder;
//			num=num/10;
//			
//			
//		}
//		System.out.println(mul);
//		
//		
//	}
//	
//	
	
	

