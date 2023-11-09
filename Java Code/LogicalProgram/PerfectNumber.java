package com.logical;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int start,end,sum=0;
		System.out.println("enter start number::");
		start=scanner.nextInt();
		System.out.println("enter last:");
        end=scanner.nextInt();
        for(int i=start;i<end;i++) {
        	for(int j=1;j<=i/2;j++) {
        		if(i%j==0) {
        			sum=sum+j;
        		}
        		else {
        			sum=sum+0;
        		}
        	}
        	if(i==sum) {
        		System.out.println(i+" is perfect number.");
        		
        	}
        	sum=0;
        }
	}

}
