package com.logical;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int number1=0;
		int number2=1;
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter limit:");
		int limit=scanner.nextInt();
		System.out.print(number1+" "+number2);
		
		for(int i=1;i<=limit;i++) {
			sum=number1+number2;
			System.out.print(" "+sum);
			number1=number2;
			number2=sum;
		}
	}

}
