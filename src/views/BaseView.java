package views;

import java.util.Scanner;

import controllers.UserController;
import models.Teacher;
import models.Admin;
import models.Student;
import models.Manager;
import models.User;
import enums.UserType;


public class BaseView {
	
	private static Scanner in = new Scanner(System.in);
//	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	
	public static void welcome() {
		System.out.println("Welcome to WSP!\nSelect your role:");
		System.out.println("1. Teacher");
		System.out.println("2. Manager");
		System.out.println("3. Student");
		System.out.println("4. Admin");
		
		int option = in.nextInt();
		
//		if (option == 1) {
//			authorize("teacher.txt");
//		} else if (option == 2) {
//			authorize("manager.txt");
//		} else if (option == 3) {
//			authorize("student.txt");
//		} else if (option == 4) {
//			authorize("admin.txt");
//		}
		switch (option) {
	        case 1 -> authorize("teacher.txt", UserType.TEACHER);
	        case 2 -> authorize("manager.txt", UserType.MANAGER);
	        case 3 -> authorize("student.txt", UserType.STUDENT);
	        case 4 -> authorize("admin.txt", UserType.ADMIN);
	        default -> {
	            System.out.println("Invalid option. Try again!");
	            welcome();
	        }
		}
	}
	
	public static void authorize(String fileName, UserType userType) {
		System.out.println("Please, enter your credentials:");
		
		in.nextLine();
		
		System.out.println("Username:");
		String username = in.nextLine();
		
		System.out.println("Password:");
		String password = in.nextLine();
		
		boolean res = UserController.authorize(fileName, username, password);
		//User user = new Teacher("", "");
		//if (user instanceof Teacher) {
		//	TeacherView.menu();
		//}
		
		if (res) {
			switch (userType) {
	            case TEACHER -> TeacherView.menu();
	            case MANAGER -> ManagerView.menu();
	            case STUDENT -> StudentView.menu();
	            case ADMIN -> AdminView.menu();
			}
		} else {
			System.err.println("Your credentials is wrong! Please, try again!");
			welcome();
		}
	}
	
//	public static void menu() {
//		System.out.println("Welcome to WSP!\nPlease select the option:");
//		System.out.println("1. Create a new user;");
//		System.out.println("2. Show teachers;");
//		System.out.println("3. Exit;");
//		
//		int option = in.nextInt();
//		
//		if (option == 1) {
//			createUser();
//		} else if (option == 2) {
//			showTeachers();
//		} else if (option == 3) {
//			System.out.println("Bye Bye!");
//		}
//	}
	
	
	public static void createUser() {
		
		System.out.println("What role do you want to create?");
		System.out.println("1. Teacher;");
		System.out.println("2. Student;");
		System.out.println("3. Manager;");
		System.out.println("4. Admin;");
		
		int option = in.nextInt();
		
		in.nextLine(); // waiting moment
		
		UserType userType;
        switch (option) {
            case 1 -> userType = UserType.TEACHER;
            case 2 -> userType = UserType.STUDENT;
            case 3 -> userType = UserType.MANAGER;
            case 4 -> userType = UserType.ADMIN;
            default -> {
                System.out.println("Invalid option. Returning to menu.");
                return;
            }
        }
//		if (option == 1) {
//			System.out.println("Creating a new user...");
			
			System.out.println("Enter a username:");
			String username = in.nextLine();
			System.out.println("Enter a password:");
			String password = in.nextLine();
			
			// controller
			boolean res = UserController.createUser(username, password, UserType.TEACHER);
			
			if (res) {
				System.out.println(username + " is created!");
			} else {
				System.err.println("Error creating the user!");
			}
		//	menu();
	
	
	}
}