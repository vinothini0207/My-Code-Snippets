import java.util.ArrayList;
import java.util.Scanner;

public class ToDoTask {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> tasks=new ArrayList<>();
        int choice;
        do{
            System.out.println("TODO task application");
            System.out.println("1. Add task");
            System.out.println("2. Mark task as completed");
            System.out.println("3. View tasks");
            System.out.println("4. Exit the application");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                {
                    addTask(tasks,sc);
                    break;
                }
                case 2:{
                    markAsCompleted(tasks,sc);
                    break;
                }
                case 3:
                {
                    viewTasks(tasks);
                    break;
                }
                case 4:{
                  System.out.println("Exiting the application");
                    break;
                }
                default:
                {
                    System.out.println("Wrong input");
                    break;
                }
            }
        }while(choice!=4);
    }
     private static void addTask(ArrayList<String> tasks, Scanner in) 
    {
           int t;
           do{
               System.out.println("1. Adding");
               System.out.println("2. Not add");
               t=in.nextInt();
               in.nextLine();
               switch (t) {
                case 1:{
                    String task=in.nextLine();
                    tasks.add(task);
                    System.out.println("Added successfully");
                    count++;
                    break;
                }  
                case 2:
                  break;        
                default:
                    System.out.println("wrong input");
                    break;
               }
           } while(t!=2);    
    }

    private static void markAsCompleted(ArrayList<String> tasks, Scanner in)
    {
        System.out.println("Enter your task number: ");
        int position=in.nextInt();
         tasks.remove(position);
         count--;
         System.out.println("your remaining tasks and counts");
         tasks.forEach(n->System.out.println(n));
         System.out.println("Count of tasks : "+count);
    }
    private static void viewTasks(ArrayList<String> tasks){
        System.out.println("Your tasks : "+count);
        tasks.forEach(n->System.out.println(n));
    }

   
    
}
