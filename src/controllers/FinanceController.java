//package controllers;
//
//import Database.Database;
//import models.FinanceManager;
//import models.Student;
//
//public class FinanceController {
//    private static final Database db = Database.getInstance();
//    public static void sendSalaryNotification(FinanceManager manager){
//        manager.sendSalaryNotification(db);
//    }
//    public static void checkStudentPayments(FinanceManager manager){
//      manager.checkStudentPaymentAndSendReport(db);
//    }
//  public static void sendTuitionNotification(FinanceManager manager, int costPerCredit){
//      manager.sendTuitionPaymentNotification(db, costPerCredit);
//  }
//  public static void checkStudentForScholarship(FinanceManager manager){
//      manager.checkStudentsForScholarship(db);
//  }
//
//}
package controllers;

import Database.Database;
import models.FinanceManager;
import models.Student;

public class FinanceController {
    private static final Database db = Database.getInstance();
    public static void sendSalaryNotification(FinanceManager manager){
        manager.sendSalaryNotification(db);
    }
    public static void checkStudentPayments(FinanceManager manager){
      manager.checkStudentPaymentAndSendReport(db);
    }
  public static void sendTuitionNotification(FinanceManager manager, int costPerCredit){
      manager.sendTuitionPaymentNotification(db, costPerCredit);
  }
  public static void checkStudentForScholarship(FinanceManager manager){
      manager.checkStudentsForScholarship(db);
  }
  public static void processTuitionPayment(FinanceManager manager, Student student){
    manager.processTuitionPayment(student);
  }
}