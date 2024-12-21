package views;
import java.util.Scanner;

import controllers.UserController;
import models.Teacher;

import models.UserType;
public class TeacherView {
	public static void menu() {
		System.out.println("Welcome, Teacher!");
		System.out.println("1. Show Teachers");
        System.out.println("2. Common Menu Options");
        System.out.println("3. Logout");
		// ... BaseView.welcome();
        
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();

        switch (option) {
            case 1 -> showTeachers();
            case 2 -> BaseView.createUser(); // Common menu
            case 3 -> BaseView.welcome();   // Back to the welcome screen
            default -> {
                System.out.println("Invalid option. Try again!");
                menu();
            }
        }
	}
	public static void showTeachers() {
        System.out.println("Loading the teachers...");
        Object t = UserController.getUsers(UserType.TEACHER);
        System.out.println(t);
        menu();
    }
	// ... menu()
}