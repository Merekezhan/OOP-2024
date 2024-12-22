package models;

import java.util.Objects;
//Admin.java
public class Admin extends User{
  private String deanManager;
    public Admin() {
      super();
    }
    public Admin(String name,String password,String deanManager) {
        super(name, password);
        this.deanManager = deanManager;
    }

  public String getDeanManager() {
    return deanManager;
  }

  public void setDeanManager(String deanManager) {
    this.deanManager = deanManager;
  }

  public void addDean(String dean){
    System.out.println("Admin adds a dean:" + dean);
  }
    public void addTeacher(String teacher){
        System.out.println("Admin adds a teacher:" + teacher);
    }
    public void addStudent(String student){
        System.out.println("Admin adds a student:" + student);
    }
  public void addEmployee(String employee){
    System.out.println("Admin adds an employee:" + employee);
  }
  public void removeDean(String dean){
    System.out.println("Admin removes a dean:" + dean);
  }
    public void removeTeacher(String teacher){
        System.out.println("Admin removes a teacher:" + teacher);
    }
    public void removeStudent(String student){
        System.out.println("Admin removes a student:" + student);
    }
  public void removeEmployee(String employee){
    System.out.println("Admin removes an employee:" + employee);
  }
  public void removeManager(String manager){
    System.out.println("Admin removes a manager:" + manager);
  }
  public void addMORegistration(){
    System.out.println("Admin adds a manager registration");
  }
  public void removeMORegistration(){
    System.out.println("Admin removes a manager registration");
  }
  public void addOffficeRegistration(){
    System.out.println("Admin adds an office registration");
  }
  public void removeOfficeRegistration(){
    System.out.println("Admin removes an office registration");
  }
    public void viewUsers(){
        System.out.println("Admin is viewing users.");
    }

    public void viewLogFiles() {
        System.out.println("Admin is viewing log files.");
    }

  @Override
  public void login() {
      System.out.println("Admin " + getName() + " logged in!");
  }

  @Override
  public void logout() {
    System.out.println("Admin " + getName() + " logged out!");
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
    Admin admin = (Admin) o;
    return Objects.equals(deanManager, admin.deanManager);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), deanManager);
  }

  @Override
  public String toString() {
    return "Admin{" +
        "deanManager='" + deanManager + '\'' +
        "} " + super.toString();
  }
}