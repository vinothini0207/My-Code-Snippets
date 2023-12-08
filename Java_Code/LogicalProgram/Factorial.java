import java.util.Scanner;
public class Factorial{
   public static void main(String[] args){
     int number,fact=1; 
     Scanner sc=new Scanner(System.in);
     System.out.print("Emter a number: ");
     number=sc.nextInt();
     System.out.println("Factorial number of "+number+" is : ");
     for(int i=number;i>=1;i--){ 
        fact=fact*i;
     }
      System.out.print(fact);
   }
}