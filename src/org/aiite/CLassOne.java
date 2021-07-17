package org.aiite;

public class CLassOne {

	public void meth(String a) {
		String s = a + " Technologys";
		System.out.println(s);
	}
	
	public String me(String a , int b) {
		
		return a;
	}
		
	public void methodName(int a) {
		int b = a *10;
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {
		CLassOne n = new CLassOne();
		n.methodName(10);
		n.meth("Aiite");
		n.me("aiite",10);
	}
	
	
	
}
