import java.util.Scanner;

public class CalculatorApplication {

   static Scanner scanner=new Scanner(System.in);
        
    public static void addition(){
       System.out.println("Enter 2 number:");
       int number1=scanner.nextInt();
       int number2=scanner.nextInt();
       int result=number1+number2;
       System.out.println("Addition: "+result);
    }
    public static void subtraction(){
        System.out.println("Enter 2 number:");
       int number1=scanner.nextInt();
       int number2=scanner.nextInt();
       int result=number1-number2;
       System.out.println("Subtractionn: "+result);
    } 
    public static void multiplication(){
       System.out.println("Enter 2 number:");
       int number1=scanner.nextInt();
       int number2=scanner.nextInt();
       int result=number1*number2;
       System.out.println("Multiplication: "+result);
    }
    public static void division(){
       System.out.println("Enter 2 number:");
       int number1=scanner.nextInt();
       int number2=scanner.nextInt();
       int result=number1/number2;
       System.out.println("Division: "+result);
    }
    public static void modulus(){
        System.out.println("Enter 2 number:");
       int number1=scanner.nextInt();
       int number2=scanner.nextInt();
       int result=number1%number2;
       System.out.println("Modulus: "+result);
    }
    public static void main(String[] args) {
        int choice;
         do{
            System.out.println("Calculator Application");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulus\n6. Exit");
            choice=scanner.nextInt();
            switch (choice) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    modulus();                
                    break;
                case 6:
                   System.out.println("Exiting the application");;
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }while(choice!=6);
    }
    
}
