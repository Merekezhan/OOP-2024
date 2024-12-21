package models;

import enums.ManagerType;
import java.util.Date;
import java.util.Objects;
//Manager.java
public class Manager extends Employee {
    private ManagerType managerType;

  public Manager() {
        super();
    }
    public Manager(int userId,String username,String password, int employeeId, Date hireDate, ManagerType managerType) {
        super(userId,username, password,employeeId, hireDate);
        this.managerType = managerType;
    }

    public ManagerType getManagerType() {
        return managerType;
    }

    public void setManagerType(ManagerType managerType) {
        this.managerType = managerType;
    }

    public void approveStudentRegistration(Student student) {
        System.out.println("Student " + student.getUsername() + " registration is approved!");
    }

    public void addCourseForRegistration(Course course, String major, int year) {
        System.out.println("Course " + course.getCourseName() + " is added for " + major + " in year " + year);
    }

    public void assignCourseToTeacher(Course course, Teacher teacher) {
        System.out.println("Course " + course.getCourseName() + " is assigned to " + teacher.getUsername());
    }

    public void createAcademicReport() {
        System.out.println("Academic report created!");
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
