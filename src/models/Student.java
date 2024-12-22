package models;
//
//import enums.PaymentStatus;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//
////Student.java
//public class Student extends User {
//  private int studyingYear;
//  private String school;
//  private List<Organization> studentOrganizations;
//  private PaymentStatus paymentStatus;
//  private double tuitionFee;
//  private Transcript transcript;
//  private int credits;
//
//  public Student() {
//    super();
//  }
//
//  public Student(
//      String name,
//      String password,
//      int studyingYear,
//      String school,
//      PaymentStatus paymentStatus,
//      double tuitionFee,
//      int credits) {
//    super(name, password);
//    this.studyingYear = studyingYear;
//    this.school = school;
//    this.studentOrganizations = new ArrayList<>();
//    this.paymentStatus = paymentStatus;
//    this.tuitionFee = tuitionFee;
//      this.transcript = new Transcript();
//      this.credits = credits;
//  }
//
//  public int getStudyingYear() {
//    return studyingYear;
//  }
//
//  public void setStudyingYear(int studyingYear) {
//    this.studyingYear = studyingYear;
//  }
//
//  public String getSchool() {
//    return school;
//  }
//
//  public void setSchool(String school) {
//    this.school = school;
//  }
//
//  public List<Organization> getStudentOrganizations() {
//    return studentOrganizations;
//  }
//
//  public void setStudentOrganizations(List<Organization> studentOrganizations) {
//    this.studentOrganizations = studentOrganizations;
//  }
//
//  public PaymentStatus getPaymentStatus() {
//    return paymentStatus;
//  }
//
//  public void setPaymentStatus(PaymentStatus paymentStatus) {
//    this.paymentStatus = paymentStatus;
//  }
//
//  public double getTuitionFee() {
//    return tuitionFee;
//  }
//
//  public void setTuitionFee(double tuitionFee) {
//    this.tuitionFee = tuitionFee;
//  }
//  public Transcript getTranscript() {
//    return transcript;
//  }
//
//  public void setTranscript(Transcript transcript) {
//    this.transcript = transcript;
//  }
//  public double getTotalMarks() {
//    return transcript.getTotalMarks();
//  }
//
//  public void viewCourses() {
//    System.out.println("Student " + getName() + " is viewing courses.");
//  }
//
//  public void registerForCourse() {
//    System.out.println("Student " + getName() + " is registering for courses.");
//  }
//
//  public void viewMarks() {
//    System.out.println("Student " + getName() + " viewing his/her marks.");
//  }
//
//  public void rateTeacher() {
//    System.out.println("Student " + getName() + " rating teacher.");
//  }
//
//  public void viewTranscript() {
//    System.out.println("Student " + getName() + " viewing his/her transcript.");
//  }
//
//  public void getTranscripts() {
//    System.out.println("Student " + getName() + " getting his/her transcript.");
//  }
//
//  public void viewAttestation() {
//    System.out.println("Student " + getName() + " viewing his/her attestations.");
//  }
//
//  public void studentOrganizations() {
//    System.out.println("Student " + getName() + " viewing his/her organizations.");
//  }
//
//  @Override
//  public void login() {
//    System.out.println("Student " + getName() + " logged in!");
//  }
//
//  @Override
//  public void logout() {
//    System.out.println("Student " + getName() + " logged out!");
//  }
//
//  @Override
//  public boolean authenticate() {
//    return true;
//  }
//
//  @Override
//  public boolean equals(Object o) {
//    if (this == o) return true;
//    if (o == null || getClass() != o.getClass()) return false;
//    if (!super.equals(o)) return false;
//    Student student = (Student) o;
//    return studyingYear == student.studyingYear
//        && Objects.equals(school, student.school)
//        && paymentStatus == student.paymentStatus
//        && Double.compare(student.tuitionFee, tuitionFee) == 0;
//  }
//
//  @Override
//  public int hashCode() {
//    return Objects.hash(super.hashCode(), studyingYear, school, paymentStatus, tuitionFee);
//  }
//
//  @Override
//  public String toString() {
//    return "Student{"
//        + "studyingYear="
//        + studyingYear
//        + ", school='"
//        + school
//        + '\''
//        + ", studentOrganizations="
//        + studentOrganizations
//        + ", paymentStatus="
//        + paymentStatus
//        + ", tuitionFee="
//        + tuitionFee
//        + "} "
//        + super.toString();
//  }
//
//
//}package models;

import enums.PaymentStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
//Student.java
public class Student extends User {
  private int studyingYear;
  private String school;
  private List<Organization> studentOrganizations;
  private PaymentStatus paymentStatus;
  private double tuitionFee;
  private Transcript transcript;
  private int credits;

  public Student() {
    super();
  }
   public Student(
      String name,
      String password,
      int studyingYear,
      String school,
      PaymentStatus paymentStatus,
      double tuitionFee,
      int credits) {
    super(name, password);
    this.studyingYear = studyingYear;
    this.school = school;
    this.studentOrganizations = new ArrayList<>();
    this.paymentStatus = paymentStatus;
    this.tuitionFee = tuitionFee;
    this.transcript = new Transcript();
      this.credits = credits;
  }
    public Student(
            String name,
            String password,
            int studyingYear,
            String school,
            PaymentStatus paymentStatus,

            int credits) {
        super(name, password);
        this.studyingYear = studyingYear;
        this.school = school;
        this.studentOrganizations = new ArrayList<>();
        this.paymentStatus = paymentStatus;
        this.tuitionFee = 0;
        this.transcript = new Transcript();
        this.credits = credits;
    }

  public int getStudyingYear() {
    return studyingYear;
  }

  public void setStudyingYear(int studyingYear) {
    this.studyingYear = studyingYear;
  }

  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public List<Organization> getStudentOrganizations() {
    return studentOrganizations;
  }

  public void setStudentOrganizations(List<Organization> studentOrganizations) {
    this.studentOrganizations = studentOrganizations;
  }

  public PaymentStatus getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(PaymentStatus paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

  public double getTuitionFee() {
    return tuitionFee;
  }

  public void setTuitionFee(double tuitionFee) {
    this.tuitionFee = tuitionFee;
  }
  public Transcript getTranscript() {
    return transcript;
  }

  public void setTranscript(Transcript transcript) {
    this.transcript = transcript;
  }
  public double getTotalMarks() {
    return transcript.getTotalMarks();
  }
  public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
  public void viewCourses() {
    System.out.println("Student " + getName() + " is viewing courses.");
  }

  public void registerForCourse() {
    System.out.println("Student " + getName() + " is registering for courses.");
  }

  public void viewMarks() {
    System.out.println("Student " + getName() + " viewing his/her marks.");
  }

  public void rateTeacher() {
    System.out.println("Student " + getName() + " rating teacher.");
  }

  public void viewTranscript() {
    System.out.println("Student " + getName() + " viewing his/her transcript.");
  }

  public void getTranscript1() {
    System.out.println("Student " + getName() + " getting his/her transcript.");
  }

  public void viewAttestation() {
    System.out.println("Student " + getName() + " viewing his/her attestations.");
  }

  public void studentOrganizations() {
    System.out.println("Student " + getName() + " viewing his/her organizations.");
  }

  @Override
  public void login() {
    System.out.println("Student " + getName() + " logged in!");
  }

  @Override
  public void logout() {
    System.out.println("Student " + getName() + " logged out!");
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
    return studyingYear == student.studyingYear
        && Objects.equals(school, student.school)
        && paymentStatus == student.paymentStatus
        && Double.compare(student.tuitionFee, tuitionFee) == 0 && credits == student.credits;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), studyingYear, school, paymentStatus, tuitionFee, credits);
  }

  @Override
  public String toString() {
    return "Student{"
        + "studyingYear="
        + studyingYear
        + ", school='"
        + school
        + '\''
        + ", studentOrganizations="
        + studentOrganizations
        + ", paymentStatus="
        + paymentStatus
        + ", tuitionFee="
        + tuitionFee
        + ", credits="
         + credits +
        "} "
        + super.toString();
  }
  public void registerForCourse(Course course) {
        System.out.println("Student " + getName() + " registered for course " + course.getCourseName());
    }
}