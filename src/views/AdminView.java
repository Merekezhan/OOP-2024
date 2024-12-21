package views;
import java.util.Scanner;
import controllers.UserController;


import models.UserType;
public class AdminView {
	public static void menu() {
		System.out.println("Welcome, Admin!");
		System.out.println("1. Show Admins");
        System.out.println("2. Common Menu Options");
        System.out.println("3. Logout");

        Scanner in = new Scanner(System.in);
        int option = in.nextInt();

		// ... BaseView.welcome();
        switch (option) {
        case 1 -> showAdmins();
        case 2 -> BaseView.createUser(); // Common menu
        case 3 -> BaseView.welcome();   // Back to the welcome screen
        default -> {
            System.out.println("Invalid option. Try again!");
            menu();
        }
      }
	}
	public static void showAdmins() {
        System.out.println("Loading the admins...");
        Object admins = UserController.getUsers(UserType.ADMIN);
        System.out.println(admins);
        menu();
    }
	// ... menu()
}