import java.util.ArrayList;
import java.util.Scanner;

public class ToDoApplication {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        int choice;

        do {
            System.out.println("ToDo List Application");
            System.out.println("1. Add task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    addTask(tasks, sc);

                    break;
                case 2:
                    markTaskAsCompleted(tasks, sc);
                    break;
                case 3:
                    viewTasks(tasks);
                    break;
                case 4:
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Wrong input!");
            }
        } while (choice != 4);
    }

    private static void addTask(ArrayList<String> tasks, Scanner sc) {
        boolean flag = true;
        while (flag) {
            System.out.println("1. Adding");
            System.out.println("2. Not add");
            int t = sc.nextInt();
            sc.nextLine(); // Consume the newline
            if (t == 1) {
                String task = sc.nextLine();
                tasks.add(task);
                System.out.println("Added Successfully");
            } else if (t == 2) {
                flag = false;
            }
        }
    }

    private static void markTaskAsCompleted(ArrayList<String> tasks, Scanner sc) {
        System.out.println("Enter task position:");
        int pos = sc.nextInt();
        tasks.remove(pos);

        System.out.println("Pending tasks: ");
        for (String str : tasks) {
            System.out.println(str);
        }
    }

    private static void viewTasks(ArrayList<String> tasks) {
        System.out.println("Pending tasks: ");
        for (String str : tasks) {
            System.out.println(str);
        }
    }
}
