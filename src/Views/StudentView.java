package Views;
import controllers.CourseController;
import controllers.FinanceController;
import models.Course;
import models.FinanceManager;
import models.Student;
import models.Teacher;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    private static final Scanner in = new Scanner(System.in);

    public static void menu() {
        System.out.println("Welcome, Student!");
        System.out.println("1. View Courses");
        System.out.println("2. Register for Course");
        System.out.println("3. View Marks");
        System.out.println("4. Get transcript");
      System.out.println("5. View finance cabinet");
        System.out.println("6. Logout");

        int option = in.nextInt();
        in.nextLine();

        switch (option) {
            case 1 -> viewCourses();
            case 2 -> registerForCourse();
            case 3 -> viewMarks();
          case 4 -> getTranscript();
            case 5 -> viewFinanceCabinet();
            case 6 -> BaseView.welcome();
            default -> {
                System.out.println("Invalid option. Try again!");
                menu();
            }
        }
    }

  private static void viewFinanceCabinet() {
      FinanceController.processTuitionPayment((FinanceManager) BaseView.getLoggedInUser(), (Student) BaseView.getLoggedInUser());
    menu();
  }
  private static void getTranscript() {
        System.out.println("Transcript for " + BaseView.getLoggedInUser().getName() );
        System.out.println(((Student)BaseView.getLoggedInUser()).getTranscript());
        menu();
    }

    private static void viewCourses() {
        System.out.println("Loading the courses...");
        List<Course> courses = CourseController.getAllCourses();
        courses.forEach(System.out::println);
        menu();
    }
    private static void registerForCourse() {
        System.out.println("Enter the name of the course you want to register to:");
        String courseName = in.nextLine();
        Course course = CourseController.getCourseByName(courseName);
      if(course == null){
          System.out.println("Course not found! Try again!");
          registerForCourse();
      }
      CourseController.registerStudentForCourse((Student) BaseView.getLoggedInUser(), course);
      System.out.println("Registered for course " + course.getCourseName());
      menu();
    }
    private static void viewMarks(){
        ((Student) BaseView.getLoggedInUser()).viewMarks();
        menu();
    }
}