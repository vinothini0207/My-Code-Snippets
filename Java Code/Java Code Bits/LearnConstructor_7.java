package com.let_code_kaushik;

public class LearnConstructor_7 {

	public LearnConstructor_7() {
		this(345);
		this.x=1000;
		this.name="Vinothini";
	}
	public LearnConstructor_7(int a) {
		this.x=a;
		System.out.println(a);
		display();
		
	}
		int x;
		String name;
		void display() {
			System.out.println(x+"---> "+name);
		}
		public static void main(String[] args) {
			LearnConstructor_7 ls=new LearnConstructor_7();
			ls.display();
		}
}


