package com.let_code_kaushik;

public class LearnThisAndInstance_6 {
  // instance variable 'c'
	int c;  //default value assign automatically-0
	
	void addTwoNumbers(int a,int b) {
		int c=20;  //local variable first preferences
		System.out.println(c);
		System.out.println(a+b+c);
       
		 System.out.println(this.num());
		System.out.println(this.c);  // refer instance variable
	    // refer method
	}
	
	int num() {
		return this.c=9;
	}
	public static void main(String[] args) {
		LearnThisAndInstance_6 ls=new LearnThisAndInstance_6();
		ls.addTwoNumbers(12, 12);
		
	}
}
