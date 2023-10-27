package com.let_code_kaushik;

public class LearnStatic_8 {

	int x=0; // instance variable belongs to method
	static int y=0; //static method belongs to class
	
	void counter() {
		x++;
		y++;
		System.out.println("Non_static => "+x+" Static => "+y);
	}
	
	public static void main(String[] args) {
	
		LearnStatic_8 ls = new LearnStatic_8();
		ls.counter();
		ls.counter();
		System.out.println("once again create object");
         LearnStatic_8 ls1=new LearnStatic_8();
         ls1.counter();
         ls1.counter();
	}

}
