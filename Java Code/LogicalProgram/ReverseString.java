import java.util.*;

public class ReverseString{
  public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
   System.out.println("Enter a String:");
String string=sc.nextLine();
String rev="";
   int lengthStr=string.length();
   for(int i=lengthStr-1;i>=0;i--){
rev=rev+string.charAt(i);
    
     }
System.out.println(string+" ==> "+rev);    } 
}