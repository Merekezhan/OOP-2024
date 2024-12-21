package views;
import java.util.Scanner;

import controllers.UserController;
import models.Manager;

import models.UserType;
public class ManagerView {
	public static void menu() {
		System.out.println("Welcome, Manager!");
		System.out.println("1. Show Managers");
        System.out.println("2. Common Menu Options");
        System.out.println("3. Logout");

        Scanner in = new Scanner(System.in);
        int option = in.nextInt();
        
		// ... BaseView.welcome();
        switch (option) {
        case 1 -> showManagers();
        case 2 -> BaseView.createUser(); // Common menu
        case 3 -> BaseView.welcome();   // Back to the welcome screen
        default -> {
            System.out.println("Invalid option. Try again!");
            menu();
        }
    }
	}
	public static void showManagers() {
        System.out.println("Loading the managers...");
        Object managers = UserController.getUsers(UserType.MANAGER);
        System.out.println(managers);
        menu();
    }
	// ... menu()
}