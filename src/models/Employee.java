package models;

import java.util.Date;
import java.util.Objects;
//Employee.java
public abstract class Employee extends User {
    private String name;
  public Employee(){
    super();
  }
    public Employee(String name, String password) {
        super(name, password);
    }
    public abstract void sendMessage(String message);
    public abstract void sendOrder(String order);
    @Override
    public void login() {
        System.out.println("Employee " + getName() + " logged in!");
    }

    @Override
    public void logout() {
        System.out.println("Employee " + getName() + " logged out!");
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
      return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
      return Objects.hash(super.hashCode(), name);
    }

    @Override
    public String toString() {
      return "Employee{" +
          "name='" + name + '\'' +
          "} " + super.toString();
    }
}