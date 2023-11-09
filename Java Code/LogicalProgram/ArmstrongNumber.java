package com.logical;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int number,temp,result=0,d;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number:");
		number=scanner.nextInt();
		temp=number;
		while(number>0) {
			d=number%10;
			result=result+(d*d*d);
			number=number/10;
		}
		if(temp==result) {
			System.out.println("Number is armstrong.");
		}
		else {
			System.out.println("Not armstrong");
		}
		
	}

}
