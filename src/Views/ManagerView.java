package Views;
import controllers.CourseController;
import controllers.FinanceController;
import models.Course;
import models.FinanceManager;
import models.Teacher;
import java.util.List;
import java.util.Scanner;

public class ManagerView {
    private static final Scanner in = new Scanner(System.in);
    public static void menu() {
        System.out.println("Welcome, Manager!");
        System.out.println("1. Approve Student Registration");
        System.out.println("2. Add course for registration");
        System.out.println("3. Assign Course to a Teacher");
      System.out.println("4. Create Academic Report");
        System.out.println("5. Logout");
        int option = in.nextInt();
        in.nextLine();
        switch (option) {
            case 1 -> approveStudentRegistration();
            case 2 -> addCourseForRegistration();
            case 3 -> assignCourseToTeacher();
          case 4 -> createAcademicReport();
            case 5 -> BaseView.welcome();
            default -> {
                System.out.println("Invalid option. Try again!");
                menu();
            }
        }
    }
  private static void approveStudentRegistration() {
        System.out.println("Approving Student Registration");
        menu();
    }
    private static void addCourseForRegistration() {
        System.out.println("Adding course for registration");
      System.out.println("Enter the name of the course:");
      String courseName = in.nextLine();
      System.out.println("Enter the credits of the course:");
      int courseCredits = in.nextInt();
      in.nextLine();
      System.out.println("Enter the lesson type of course:");
      String lessonType = in.nextLine();
      Course course = new Course(courseName, courseCredits, enums.LessonType.valueOf(lessonType.toUpperCase()), (Teacher) BaseView.getLoggedInUser());
      CourseController.addCourse(course);
      menu();
    }
    private static void assignCourseToTeacher() {
        System.out.println("Assigning Course to Teacher");
        System.out.println("Enter the name of course to assign:");
        String courseName = in.nextLine();
        Course course = CourseController.getCourseByName(courseName);
      if(course == null){
        System.out.println("Course not found! Try again!");
        assignCourseToTeacher();
      }
      CourseController.assignTeacherForCourse((Teacher) BaseView.getLoggedInUser(), course);
        menu();
    }

  private static void createAcademicReport() {
    System.out.println("Creating academic report");
    menu();
  }
}