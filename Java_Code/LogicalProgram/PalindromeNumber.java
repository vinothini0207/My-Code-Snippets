import java.util.*;
public class PalindromeNumber{
   public static void main(String[] args){
     int d,rev=0,temp;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number:");
     int number=sc.nextInt();
     temp=number;
    while(number>0){
        d=number%10;
         rev=(rev*10)+d;
         number=number/10;
       }
     if(temp==rev){
       System.out.println(rev+" is palindrome");
       }
      else{
       System.out.println(rev+" is not palindrome");
      }
    }
}