public class PalindromeNumberWithRange{
  public static void main(String[] args){
    int rev=0,d,temp,count=0;
     System.out.println("Palindrome number between 1 to 1000 : ");
      for(int i=1;i<1000;i++){
        temp=i;
         rev=0;
         while(temp>0){
           d=temp%10;
           rev=(rev*10)+d;
           temp=temp/10;
          }
        if(i==rev){
         System.out.print(i+" ");
         count++;
        }
     }
System.out.println("\n count : "+count);
   }
}