package com.let_code_kaushik;

public class LearnStaticFunction_9 { //CallStaticFunction_9

	int a=10;
	static int b=34;
	public static void displayName() {
	//	System.out.println(a);
	//	System.out.println(this.a); //static field not access this keyword.
		System.out.println("vinothini Kaushik...");
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {
		
		LearnStaticFunction_9.displayName();
		
		String a="23";
		String b="24";
		int c=Integer.parseInt(a);
		int d=Integer.parseInt(b);
		
		System.out.println(a+b);
		
		System.out.println(c+d);
	}

}
