package org.program;

public class Factorial implements Cloneable{

	
private void name(String name) {

System.out.println(name);
}
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		int n=5;
		int fact=1;
		
		for (int i = 1; i <=5; i++) {
			
			fact=fact*i;
			
			
			
		}
		System.out.println(fact);
	
	Factorial f= new Factorial();
//		
		Factorial g = (Factorial)f.clone();
		
g.name("Veni");	


	

	
Class class1 = f.getClass();
		System.out.println(class1);
	}
	
}
