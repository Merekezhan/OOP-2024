package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import Database.Database;
import models.Student;
//FinanceManager.java
public class FinanceManager extends Employee{
    public FinanceManager(){
      super();
    }
    public FinanceManager(String name, String password) {
        super(name, password);
    }

    public void makeCourse(){
        System.out.println("Manager from finance department is making courses.");
    }
    public void giveStipendia(Student student){
        if (student.getPaymentStatus() == enums.PaymentStatus.GRANT) {
            System.out.println("Manager from finance department giving stipendia to student" + student.getName());
        } else{
            System.out.println("Student is not from grant");
        }
    }
    public void giveSalary(){
        System.out.println("Manager from finance department giving salary.");
    }
    public void viewCount(){
        System.out.println("Manager from finance department viewing count.");
    }
    public void processTuitionPayment(Student student) {
        switch (student.getPaymentStatus()) {
            case UNPAID:
                System.out.println("Student " + student.getName() + " has to pay:" + student.getTuitionFee());
                System.out.println("Processing payment for student: " + student.getName());
                student.setPaymentStatus(enums.PaymentStatus.PAID);
                break;
            case PAID:
                System.out.println("Student " + student.getName() + " has already paid tuition.");
                break;
            case GRANT:
                System.out.println("Student " + student.getName() + " is on a grant, no tuition payment needed.");
                break;
            default:
                System.out.println("Invalid student payment status.");
        }
    }
    public void checkStudentPaymentAndSendReport(Database database){
      List<Student> students = database.getAllStudents();
      for(Student student: students){
        if(student.getPaymentStatus() == enums.PaymentStatus.UNPAID){
          System.out.println("Student " + student.getName() + " has an unpaid status.");
        }
      }
    }
  public void checkStudentsForScholarship(Database database){
    List<Student> students = database.getAllStudents();
    List<Student> scholarshipStudents = new ArrayList<>();
    for(Student student: students){
      if(student.getTotalMarks() > 70){
        System.out.println("Student " + student.getName() + " will get the scholarship!");
        scholarshipStudents.add(student);
      }
    }
    database.setScholarship(scholarshipStudents);
    }
    public void sendSalaryNotification(Database database){
    java.time.LocalDate currentDate = java.time.LocalDate.now();
    int currentDay = currentDate.getDayOfMonth();
    if(currentDay == 23){
        List<Employee> employees = database.getAllEmployees();
        for (Employee employee: employees){
            System.out.println("Message to " + employee.getName() +": Today salary payment will be processed");
        }
    }
    }
    public void sendTuitionPaymentNotification(Database database, int costPerCredit){
      List<Student> students = database.getAllStudents();
      for (Student student: students){
          if (student.getPaymentStatus() == enums.PaymentStatus.UNPAID){
              double tuition = student.getCredits() * costPerCredit;
              student.setTuitionFee(tuition);
             System.out.println("Student " + student.getName() + " has to pay: " + student.getTuitionFee() );
          }
      }

  }

    public void sendMessage(String message) {
      System.out.println("Finance manager " + getName() + " sent a message:" + message);
    }

    public void sendOrder(String order) {
      System.out.println("Finance manager " + getName() + " sent an order:" + order);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FinanceManager that = (FinanceManager) o;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    
    
    @Override
    public String toString() {
        return "FinanceManager{} " + super.toString();
    }
}