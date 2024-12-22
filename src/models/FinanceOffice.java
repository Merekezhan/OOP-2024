package models;

import java.util.Objects;
//FinanceOffice.java
public class FinanceOffice extends Employee {

    public FinanceOffice(String name, String password) {
        super(name, password);
    }

    public void viewCount(){
        System.out.println("Finance office viewing count.");
    }

    public void makeCourse(){
        System.out.println("Finance office is making course.");
    }

    public void sendMessage(String message) {
        System.out.println("Finance office " + getName() + " sent a message:" + message);
    }

    public void sendOrder(String order) {
        System.out.println("Finance office " + getName() + " sent an order:" + order);
    }

    public void processStudentPayment(Student student) {
        if (student.getPaymentStatus() == enums.PaymentStatus.UNPAID) {
            System.out.println("Processing payment for student: " + student.getName());
            student.setPaymentStatus(enums.PaymentStatus.PAID);
        } else {
            System.out.println("Student " + student.getName() + " does not have unpaid status!");
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FinanceOffice that = (FinanceOffice) o;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public String toString() {
        return "FinanceOffice{} " + super.toString();
    }
}
