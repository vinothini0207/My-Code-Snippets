import java.util.Scanner;
public class MultiplicationTable{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int table=sc.nextInt();
    for(int i=1;i<=20;i++){
          System.out.println(i+" * "+table+" = "+(i*table));
       }
   }
}