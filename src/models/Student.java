package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import models.Mark;
import enums.PaymentStatus;
//Student.java
public class Student extends User{
    private int studentId;
    private String major;
    private int year;
    private int credits;
    private Transcript transcript;
    private List<Organization> studentOrganizations;
    private PaymentStatus Status;
    public Student() {
        super();
    }
    public Student(int userId,String username, String password,int studentId, String major, int year, int credits) {
        super(userId,username, password);
        this.studentId = studentId;
        this.major = major;
        this.year = year;
        this.credits = credits;
        this.transcript = new Transcript();
        this.studentOrganizations = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Transcript getTranscript() {
      return transcript;
    }

    public void setTranscript(Transcript transcript) {
      this.transcript = transcript;
    }

  public List<Organization> getStudentOrganizations() {
    return studentOrganizations;
  }

  public void setStudentOrganizations(List<Organization> studentOrganizations) {
    this.studentOrganizations = studentOrganizations;
  }
  public PaymentStatus getStatus() {
	  return Status;
  }

  public void registerForCourse(Course course) {
        System.out.println("Student " + getUsername() + " registered for course " + course.getCourseName());
    }
    public void viewMarks(){
      System.out.println("Student " + getUsername() + " marks are: " + transcript.getMarks());
    }
    public void rateTeacher(Teacher teacher, double rating){
        System.out.println("Student " + getUsername() + " rated teacher " + teacher.getUsername() + " with rating " + rating);
    }
    

  @Override
  public void login() {
    System.out.println("Student " + getUsername() + " logged in!");
  }

  @Override
  public void logout() {
    System.out.println("Student " + getUsername() + " logged out!");
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
    Student student = (Student) o;
    return studentId == student.studentId && year == student.year && credits == student.credits && Objects.equals(major, student.major);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), studentId, major, year, credits);
  }

  @Override
  public String toString() {
    return "Student{" +
        "studentId=" + studentId +
        ", major='" + major + '\'' +
        ", year=" + year +
        ", credits=" + credits +
        ", transcript=" + transcript +
        ", studentOrganizations=" + studentOrganizations +
        "} " + super.toString();
  }
  public boolean checkScholarshipEligibility() {
	  return false;
}
}
  

