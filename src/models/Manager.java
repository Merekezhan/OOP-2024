package models;
import enums.ManagerType;
import java.util.Objects;
//Manager.java
public class Manager extends Employee {
    private ManagerType managerType;
    public Manager() {
      super();
    }
    public Manager(String name,String password,ManagerType managerType) {
        super(name, password);
        this.managerType = managerType;
    }

    public ManagerType getManagerType() {
        return managerType;
    }

    public void setManagerType(ManagerType managerType) {
        this.managerType = managerType;
    }

    public void viewCourses() {
        System.out.println("Manager is viewing courses.");
    }
    public void viewRequests(){
        System.out.println("Manager is viewing requests.");
    }
    public void createStatisticReport(){
        System.out.println("Manager creating a report.");
    }
    public void rejectStipend(){
        System.out.println("Manager is rejecting stipend.");
    }
    public void publishNews(){
        System.out.println("Manager is publishing news.");
    }
    public void assignCoursesToTeachers(){
        System.out.println("Manager is assigning courses.");
    }
    public void makeCourse(){
        System.out.println("Manager is making courses");
    }
  public void sendMessage(String message) {
    System.out.println("Manager " + getName() + " sent a message:" + message);
  }

  public void sendOrder(String order) {
    System.out.println("Manager " + getName() + " sent an order:" + order);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    Manager manager = (Manager) o;
    return managerType == manager.managerType;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), managerType);
  }

  @Override
  public String toString() {
    return "Manager{" +
        "managerType=" + managerType +
        "} " + super.toString();
  }
}