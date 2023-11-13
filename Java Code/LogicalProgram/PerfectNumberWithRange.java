public class PerfectNumberWithRange{
   public static void main(String[] args){
     int result=0,temp;
      System.out.println("Perfect number between 1 to 1000 : ");
      for(int i=1; i<=10000;i++){
          temp=i;
           result=0;
          for(int j=1;j<i;j++){
               if(i%j==0){
                 result=result+j;
                }
           }
          if(i==result){
            System.out.print(i+" ");
           }
       }
    }
}