//import java.util.Scanner;
public class FactorialWithRange{
   public static void main(String[] args){
     int fact=1;
     for(int i=1;i<=10;i++){
          fact=1;
         for(int j=i;j>=1;j--){
              fact=fact*j;
            }
          System.out.println("Factorial "+i+" is : "+fact);
          
      }
   }
}