public class Swapping{
  public static void main(String[] args){
     int n1=123;
     int n2=897;
     int temp;
     System.out.println("\tMethod 1 : ");
     System.out.println("Befor swapping : \n n1 ==> "+n1+"\n n2 ==> "+n2);
      temp=n1;
      n1=n2;
      n2=temp;
     System.out.println("After swapping : \n n1 ==> "+n1+"\n n2 ==> "+n2);
     System.out.println("\tMethod 2 : ");
System.out.println("Befor swapping : \n n1 ==> "+n1+"\n n2 ==> "+n2);
      n1=n1+n2;
      n2=n1-n2;
      n1=n1-n2;
     
     System.out.println("After swapping : \n n1 ==> "+n1+"\n n2 ==> "+n2);
     System.out.println("\tMethod 3 : ");
System.out.println("Befor swapping : \n n1 ==> "+n1+"\n n2 ==> "+n2);
      n1=n1*n2;
      n2=n1/n2;
      n1=n1/n2;
     
     System.out.println("After swapping : \n n1 ==> "+n1+"\n n2 ==> "+n2);
   }
}