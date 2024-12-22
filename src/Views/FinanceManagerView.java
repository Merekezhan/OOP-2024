package Views;

import controllers.FinanceController;
import models.FinanceManager;

import java.util.Scanner;

public class FinanceManagerView {
  private static final Scanner in = new Scanner(System.in);
    public static void menu() {
        System.out.println("Welcome, Finance Manager!");
        System.out.println("1. Send salary notification");
        System.out.println("2. Check student payment status");
      System.out.println("3. Send tuition notifications");
      System.out.println("4. Check students for scholarship");
      System.out.println("5. Logout");
        int option = in.nextInt();
        in.nextLine();
        switch (option) {
            case 1 -> sendSalaryNotification();
            case 2 -> checkStudentPaymentStatus();
            case 3 -> sendTuitionNotification();
          case 4 -> checkStudentForScholarship();
            case 5 -> BaseView.welcome();
            default -> {
                System.out.println("Invalid option. Try again!");
                menu();
            }
        }
    }
    private static void sendSalaryNotification() {
        FinanceController.sendSalaryNotification((FinanceManager) BaseView.getLoggedInUser());
        menu();
    }

    private static void checkStudentPaymentStatus(){
        FinanceController.checkStudentPayments((FinanceManager) BaseView.getLoggedInUser());
        menu();
    }

  private static void sendTuitionNotification() {
        System.out.println("Enter the cost per credit:");
        int costPerCredit = in.nextInt();
        in.nextLine();
        FinanceController.sendTuitionNotification((FinanceManager) BaseView.getLoggedInUser(), costPerCredit);
        menu();
    }
  private static void checkStudentForScholarship() {
        FinanceController.checkStudentForScholarship((FinanceManager) BaseView.getLoggedInUser());
        menu();
    }
}