package com.let_code_kaushik;

import java.util.Arrays;

public class LearnArrays_10 {

	public static void main(String[] args) {
		
		String[] guns= {"AKM","AUG","AWM","Groza","M416"};
		System.out.println(guns[0]);
		System.out.println(guns[4]);
		
		guns[3]="no";
		System.out.println(guns.length);
		System.out.println(guns);
		System.out.println(Arrays.toString(guns));
		
		int[] a=new int[] {10,20,30,40,50,10,39
				
		};
		a[3]=400;
		
		//a[2]=500;
		System.out.println(Arrays.toString(a));  //10,20,30,400,50,10,39
		a[4]=500;  
		
	}

}
