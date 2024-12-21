package views;
import java.util.Scanner;
import controllers.UserController;


import models.UserType;
public class StudentView {
	public static void menu() {
		System.out.println("Welcome, Student!");
		System.out.println("1. Show Students");
        System.out.println("2. Common Menu Options");
        System.out.println("3. Logout");

        Scanner in = new Scanner(System.in);
        int option = in.nextInt();
		// ... BaseView.welcome();
        switch (option) {
        case 1 -> showStudents();
        case 2 -> BaseView.createUser(); // Common menu
        case 3 -> BaseView.welcome();   // Back to the welcome screen
        default -> {
            System.out.println("Invalid option. Try again!");
            menu();
        }
       }
	}
	public static void showStudents() {
        System.out.println("Loading the students...");
        Object students = UserController.getUsers(UserType.STUDENT);
        System.out.println(students);
        menu();
    }
	// ... menu()
}