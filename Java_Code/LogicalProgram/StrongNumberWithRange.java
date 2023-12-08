public class StrongNumberWithRange{
   public static void main(String[] args){
        int temp,sum=0,fact=1,rem;
        System.out.println("Strong number between 1 t0 1000: ");
    for(int i=1;i<=1000;i++){
      temp=i;
      sum=0;
       while(temp>0){
          rem=temp%10;
            fact=1;
           for(int j=rem;j>=1;j--){
               fact=fact*j;
            }
           sum=sum+fact;
           temp=temp/10;
        }
     if(i==sum){
      System.out.print(i+" ");
      }
     }
    }
}