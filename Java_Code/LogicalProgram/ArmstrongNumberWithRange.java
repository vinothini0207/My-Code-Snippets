package com.logical;

public class ArmstrongNumberWithRange {
public static void main(String[] args) {
	int d,sum=0,temp;
   for(int i=100;i<500;i++) {
	  temp=i;
	 while(temp>0) {
		 d=temp%10;
		 sum=sum+(d*d*d);
		 temp=temp/10;
	 }
	   
	 if(i==sum) {
	 System.out.println(i+" amstrong number");
	 }
	 sum=0;
   }
}
}
