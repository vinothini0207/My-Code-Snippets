package org.task1;

public class Number_Increasing_reverse_Pattern {
    
	public static void main(String[] args) {
		/*

1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
		 * 
		 */
		
		int i,j;
		int n=6;
		for(i=n;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
