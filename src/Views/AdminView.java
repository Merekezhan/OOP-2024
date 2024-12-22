package Views;

import controllers.UserController;
import enums.UserType;
import java.util.List;
import java.util.Scanner;

public class AdminView {
    private static final Scanner in = new Scanner(System.in);

    public static void menu() {
        System.out.println("Welcome, Admin!");
        System.out.println("1. Show Admins");
        System.out.println("2. Common Menu Options");
      System.out.println("3. Show all users");
      System.out.println("4. Show all students");
      System.out.println("5. Logout");
        int option = in.nextInt();
        in.nextLine();

        switch (option) {
            case 1 -> showAdmins();
            case 2 -> BaseView.createUser(); // Common menu
            case 3 -> showUsers();
          case 4 -> showStudents();
            case 5 -> BaseView.welcome();   // Back to the welcome screen
            default -> {
                System.out.println("Invalid option. Try again!");
                menu();
            }
        }
    }

    public static void showAdmins() {
        System.out.println("Loading the admins...");
        List<?> admins = UserController.getUsers(UserType.ADMIN);
        admins.forEach(System.out::println);
        menu();
    }
  public static void showUsers() {
    System.out.println("Loading the users...");
    List<?> users = UserController.getUsers(UserType.FINANCE_MANAGER);
    users.forEach(System.out::println);
    menu();
  }
    public static void showStudents() {
        System.out.println("Loading the students...");
        List<?> students = UserController.getUsers(UserType.STUDENT);
        students.forEach(System.out::println);
        menu();
    }

}