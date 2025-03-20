import java.util.ArrayList;
import java.util.Scanner;

public class SimpleToDoList {

    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store tasks
        ArrayList<String> toDoList = new ArrayList<>();

        // Displaying the welcome message
        System.out.println("Welcome to the Simple To-Do List Application!");

        // Main loop for the menu
        while (true) {
            // Display the menu options
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View All Tasks");
            System.out.println("4. Exit");

            // Get the user's choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // To consume the newline character after the number input

            switch (choice) {
                case 1:
                    // Add Task
                    System.out.print("Enter the task you want to add: ");
                    String task = scanner.nextLine();
                    toDoList.add(task);
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    // Remove Task
                    System.out.println("Here are your tasks:");
                    for (int i = 0; i < toDoList.size(); i++) {
                        System.out.println((i + 1) + ". " + toDoList.get(i));
                    }
                    System.out.print("Enter the task number you want to remove: ");
                    int taskNumber = scanner.nextInt();
                    if (taskNumber > 0 && taskNumber <= toDoList.size()) {
                        toDoList.remove(taskNumber - 1);
                        System.out.println("Task removed successfully!");
                    } else {
                        System.out.println("Invalid task number. Please try again.");
                    }
                    break;

                case 3:
                    // View All Tasks
                    if (toDoList.isEmpty()) {
                        System.out.println("Your To-Do list is empty!");
                    } else {
                        System.out.println("Here are your current tasks:");
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                    }
                    break;

                case 4:
                    // Exit
                    System.out.println("Thanks for using the To-Do List application. Goodbye!");
                    scanner.close();
                    return; // Exit the program

                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }
    }
}
