import java.util.*;
public class StrongNumber{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int number,temp,sum=0,rem,fact=1;
    Sysem.out.println("Enter a number:");
    number=sc.nextInt();
    temp=number;
     while(temp>0){
        rem=temp%10;
        fact=1;
         for(int i=rem;i>=1;i--){
             fact=fact*i;
           }
         sum=sum+fact;
       temp=temp/10;

       }
      if(number==sum){
       System,out.println(number+" is strong number");
        }
      else{
         System.out.println(number+" is not strong");
      }
    }
}