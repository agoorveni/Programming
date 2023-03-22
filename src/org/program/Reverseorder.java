package org.program;

public class Reverseorder {
	
	
	
	
	public static void main(String[] args) {
	
		int num=12345;
		int remainder=0;
		int rev=0;
		
		
		while (num>0) {
			
		remainder=num%10;
		rev=rev*10+remainder;
		num=num/10;
			
			
		}
		System.out.println(rev);
		
		
	}
	
	
	
	
	
//	public static void main(String[] args) {
//	
//		String s = "Veni";
//		
//		if (s.contains("a")||s.contains("e")) {
//			
//			System.out.println("It contains vowel");
//		}
//		
//		else {
//			System.out.println("It does not contain vowel");
//		}
//		
//		
//	}


	
	
	
	
}
