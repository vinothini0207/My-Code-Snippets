import java.util.*;
public class PalindromeString{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a string: ");
      String str=sc.nextLine();
      String revStr="";
      int len=str.length();
      for(int i=len-1;i>=0;i--){
         revStr=revStr+str.charAt(i);
       }
      if(str.equals(revStr)){
         System.out.println(str+" is palindrome");
      }
      else{
         System.out.println(str+" is not palindrome");
      }
    }
}