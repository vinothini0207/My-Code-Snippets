package com.taskmanager;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskManagerApp {
	private ArrayList<Task> tasks;
	private Scanner scanner;
	
	public TaskManagerApp() {
		tasks=new ArrayList<Task>();
		scanner= new Scanner(System.in);
		}
	
	public void addTask(String description) {
		Task task=new Task(description);
		tasks.add(task);
		System.out.println("Task added successfully.");
	}
	public void markAsCompleted(int index) {
		if(index>=0 && index<tasks.size()) {
			tasks.get(index).markAsCompleted();
			System.out.println("Index marked as completed.");
		}else {
			System.out.println("Invalid task index");
		}
	}
	
	public void showTasks() {
		if(tasks.isEmpty()) {
			System.out.println("No tasks found.");
		}else {
			System.out.println("Task List:");
			for(int i=0;i<tasks.size();i++) {
				System.out.println((i+1)+ ". "+ tasks.get(i));
			}
		}
	}
	public static void main(String[] args) {
		TaskManagerApp taskManager= new TaskManagerApp();
		Scanner scanner = new Scanner(System.in);
		while (true) {
            System.out.println("\nTask Manager Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. Show Tasks");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    taskManager.addTask(description);
                    break;
                case 2:
                    System.out.print("Enter the task index to mark as completed: ");
                    int index = scanner.nextInt();
                    taskManager.markAsCompleted(index - 1);
                    break;
                case 3:
                    taskManager.showTasks();
                    break;
                case 4:
                    System.out.println("Exiting Task Manager. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
	}

}
