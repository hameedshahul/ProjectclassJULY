package org.aiite;

public class ClassTwo {

	/*
	 * create two parametrised return statement method each with two arguments
	 * and store the output of the methods in a variable.
	 * 
	 */
	
	public String me(String a , int b) {
		
		return a;
	}
		
	public int met(String a , int b) {
		
		return b;
	}
		
	
	public static void main(String[] args) {
		ClassTwo c = new ClassTwo();
		String s = c.me("Aiite", 100);
		int a = c.met("Aiite", 100);
		System.out.println(s + a);
	}
	
}
