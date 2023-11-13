public class MultiplicationTableWithRange{
  public static void main(String[] args){
      System.out.println("Multiplication table:");
      for(int i=1;i<=10;i++){
       System.out.println();
       System.out.println("Table for "+i+" : ");
        for(int j=1;j<=10;j++){
           System.out.println(j+" * "+i+" = "+(i*j));
          }
      }
   }
}