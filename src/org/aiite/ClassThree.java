package org.aiite;

public class ClassThree extends ClassTwo{

	/*
	 * override a parametrised method created in ClassTwo and change the 
	 * business logic and store the output of the method in a variable 
	 * and print the varaible.
	 *
	 */
	
	public String me(String a , int b) {
		
		return a + " Technologys";
	}
	
	
	public static void main(String[] args) {
		ClassThree c = new ClassThree();
		String s =c.me("Aiite", 20);
		System.out.println(s);
	}
	
	
}
