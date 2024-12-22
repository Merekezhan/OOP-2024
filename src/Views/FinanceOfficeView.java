package Views;

import controllers.FinanceController;
import models.FinanceManager;

import java.util.Scanner;

public class FinanceOfficeView {
    private static final Scanner in = new Scanner(System.in);
    public static void menu() {
        System.out.println("Welcome, Finance Office!");
        System.out.println("1. Process Payments");
        System.out.println("2. Logout");
        int option = in.nextInt();
        in.nextLine();
        switch (option) {
            case 1 -> processPayments();
            case 2 -> BaseView.welcome();
            default -> {
                System.out.println("Invalid option. Try again!");
                menu();
            }
        }
    }

    private static void processPayments() {
        System.out.println("Processing payments!");
        menu();
    }
}