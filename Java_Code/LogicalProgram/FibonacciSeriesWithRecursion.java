package com.logical;

import java.util.Scanner;

public class FibonacciSeriesWithRecursion {
	 static int n1=0,n2=1,n3=0;
	public static void main(String[] args) {
		 
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter count:");
		int count=scanner.nextInt();
		System.out.print(n1+" "+n2);
		FibonacciSeries(count);
	}

	private static void FibonacciSeries(int count) {
		if(count>0) {
		n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
		FibonacciSeries(count-1);
		}
	}

}
