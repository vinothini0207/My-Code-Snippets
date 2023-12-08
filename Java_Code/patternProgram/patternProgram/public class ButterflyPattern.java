package patternProgram;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter no of rows: ");
       int rows=scanner.nextInt();
        for(int upperRow=1;upperRow<=rows;upperRow++){
            for(int upperColumn=1;upperColumn<=upperRow;upperColumn++){
                System.out.print("*");
            }
            for(int j=2*rows-upperRow;j>upperRow;j--){
                System.out.print(" ");
            }
            for(int upperColumn=1;upperColumn<=upperRow;upperColumn++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int downRow=1;downRow<=rows;downRow++){
            for(int downColumn=downRow;downColumn<=rows;downColumn++){
                System.out.print("*");
            }
            for(int downColumn=2;downColumn<2*downRow;downColumn++){
                System.out.print(" ");
            }
            for(int downColumn=downRow;downColumn<=rows;downColumn++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
