package Views;

import controllers.CourseController;
import controllers.FinanceController;
import controllers.UserController;
import enums.PaymentStatus;
import enums.UserType;
import models.*;
import Database.Database;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class BaseView {
  private static final Scanner in = new Scanner(System.in);
    private static User loggedInUser;
    private static final Database db = Database.getInstance();

    public static void welcome(){
        System.out.println("Welcome to university system");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        int option = in.nextInt();
        in.nextLine();
        switch (option){
            case 1 -> login();
            case 2 -> createUser();
            case 3 -> System.exit(0);
            default -> {
                System.out.println("Invalid option. Please try again");
                welcome();
            }
        }
    }
    public static void login(){
        System.out.println("Enter username:");
        String username = in.nextLine();
      System.out.println("Enter password:");
        String password = in.nextLine();
        if(UserController.authenticate(username,password)){
            loggedInUser = db.getUser(username);
           if (loggedInUser instanceof Student){
                StudentView.menu();
            } else if (loggedInUser instanceof Teacher){
                TeacherView.menu();
           }
           else if (loggedInUser instanceof Manager){
                ManagerView.menu();
           }
            else if (loggedInUser instanceof Admin){
              AdminView.menu();
            } else if (loggedInUser instanceof FinanceManager) {
              FinanceManagerView.menu();
           } else if(loggedInUser instanceof FinanceOffice){
               FinanceOfficeView.menu();
           }
        } else{
            System.out.println("User not found, try again");
            welcome();
        }
    }
    public static void createUser(){
      System.out.println("Creating user. Please choose the type");
      System.out.println("1. Teacher");
        System.out.println("2. Student");
      System.out.println("3. Manager");
      System.out.println("4. Admin");
      System.out.println("5. Finance Manager");
      System.out.println("6. Finance Office");
        System.out.println("7. Back to main menu");
      int option = in.nextInt();
      in.nextLine();
        switch (option){
            case 1 -> createUserOfType(UserType.TEACHER);
            case 2 -> createUserOfType(UserType.STUDENT);
          case 3 -> createUserOfType(UserType.MANAGER);
          case 4 -> createUserOfType(UserType.ADMIN);
          case 5 -> createUserOfType(UserType.FINANCE_MANAGER);
          case 6 -> createUserOfType(UserType.FINANCE_OFFICE);
            case 7 -> welcome();
            default -> {
              System.out.println("Invalid option, try again!");
              createUser();
            }
        }
    }
    private static void createUserOfType(UserType type){
      System.out.println("Enter username:");
      String username = in.nextLine();
        System.out.println("Enter password:");
        String password = in.nextLine();
      if (UserController.createUser(username, password, type)){
          System.out.println("User created!");
      } else{
          System.out.println("Error during creating user");
      }
    welcome();
  }

  public static void setLoggedInUser(User loggedInUser) {
      BaseView.loggedInUser = loggedInUser;
  }
  public static User getLoggedInUser(){
      return loggedInUser;
  }

}
