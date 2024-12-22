package controllers;

import enums.UserType;
import models.*;
import java.util.ArrayList;
import java.util.List;
import Database.Database;


public class UserController {

    private static final Database db = Database.getInstance();

    public static boolean createUser(String username, String password, UserType type) {
        switch (type) {
            case TEACHER:
                Teacher newTeacher = new Teacher(username, password, enums.TeacherTitle.TUTOR); // Default title
                db.addUser(newTeacher);
                return true;
            case STUDENT:
                Student newStudent = new Student(username, password, 1, "Default School", enums.PaymentStatus.UNPAID, 0); // Default year, school, and fee
                db.addUser(newStudent);
                return true;
            case MANAGER:
                Manager newManager = new Manager(username, password, enums.ManagerType.DEPARTMENT); // Default manager type
                db.addUser(newManager);
                return true;
            case ADMIN:
              Admin newAdmin = new Admin(username, password, "Default Dean");
              db.addUser(newAdmin);
              return true;
            case FINANCE_MANAGER:
              FinanceManager newFinanceManager = new FinanceManager(username, password);
              db.addUser(newFinanceManager);
              return true;
            case FINANCE_OFFICE:
              FinanceOffice newFinanceOffice = new FinanceOffice(username, password);
              db.addUser(newFinanceOffice);
            default:
                return false;
        }
    }
    public static List<? extends User> getUsers(UserType type) {
    List<User> allUsers = db.getAllUsers();
    List<User> result = new ArrayList<>();
    for (User user : allUsers) {
      switch (type) {
        case TEACHER:
          if (user instanceof Teacher) {
            result.add(user);
          }
          break;
        case STUDENT:
          if (user instanceof Student) {
            result.add(user);
          }
          break;
        case MANAGER:
          if (user instanceof Manager) {
            result.add(user);
          }
          break;
        case ADMIN:
          if (user instanceof Admin) {
            result.add(user);
          }
          break;
        case FINANCE_MANAGER:
          if (user instanceof FinanceManager) {
            result.add(user);
          }
          break;
        case FINANCE_OFFICE:
          if (user instanceof FinanceOffice) {
            result.add(user);
          }
          break;
      }
    }
    return result;
  }
    public static boolean authenticate(String username, String password) {
      User user = db.getUser(username);
      return user != null && user.getPassword().equals(password);
  }
}