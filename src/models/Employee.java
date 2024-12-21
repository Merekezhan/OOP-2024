package models;

import java.util.Date;
import java.util.Objects;
//Employee.java
public class Employee extends User {
    private int employeeId;
    private Date hireDate;

    public Employee(){

    }

    public Employee(int userId,String username, String password,int employeeId, Date hireDate) {
        super(userId,username, password);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public void login() {
      System.out.println("Employee " + getUsername() + " logged in!");
    }

    @Override
    public void logout() {
      System.out.println("Employee " + getUsername() + " logged out!");
    }

    @Override
    public boolean authenticate() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      if (!super.equals(o)) return false;
      Employee employee = (Employee) o;
      return employeeId == employee.employeeId;
    }

    @Override
    public int hashCode() {
      return Objects.hash(super.hashCode(), employeeId);
    }

  @Override
  public String toString() {
    return "Employee{" +
        "employeeId=" + employeeId +
        ", hireDate=" + hireDate +
        "} " + super.toString();
  }
}
