package Views;

import controllers.CourseController;
import controllers.FinanceController;
import models.Course;
import models.FinanceManager;
import models.Teacher;

import java.util.List;
import java.util.Scanner;

public class TeacherView {
    private static final Scanner in = new Scanner(System.in);

    public static void menu() {
        System.out.println("Welcome, Teacher!");
        System.out.println("1. View Courses");
        System.out.println("2. Put Marks");
      System.out.println("3. View students");
      System.out.println("4. Send complaints");
        System.out.println("5. Logout");
        int option = in.nextInt();
        in.nextLine();

        switch (option) {
            case 1 -> viewCourses();
            case 2 -> putMarks();
          case 3 -> viewStudents();
          case 4 -> sendComplaints();
            case 5 -> BaseView.welcome();
            default -> {
                System.out.println("Invalid option. Try again!");
                menu();
            }
        }
    }

    private static void viewCourses() {
        System.out.println("Loading the courses...");
        List<Course> courses = CourseController.getAllCourses();
        courses.forEach(System.out::println);
        menu();
    }
  private static void putMarks() {
        System.out.println("Putting marks.");
        menu();
    }

    private static void viewStudents(){
      System.out.println("Viewing all students");
        menu();
    }
    private static void sendComplaints(){
        System.out.println("Sending complaints");
        menu();
    }

}
