//package models;
//
//import enums.TeacherTitle;
//import research.Research;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//import java.util.Comparator;
////Teacher.java
//public abstract class Teacher extends Employee implements Research {
//    private TeacherTitle teacherType;
//    private List<Course> courses;
//    private List<ResearchPaper> researchPapers;
//    private List<ResearchProject> researchProjects;
//
//    public Teacher() {
//        super();
//    }
//    public Teacher(String name,String password, TeacherTitle teacherType) {
//        super(name, password);
//        this.teacherType = teacherType;
//      this.researchPapers = new ArrayList<>();
//      this.researchProjects = new ArrayList<>();
//        this.courses = new ArrayList<>();
//    }
//
//    public TeacherTitle getTeacherType() {
//        return teacherType;
//    }
//
//    public void setTeacherType(TeacherTitle teacherType) {
//        this.teacherType = teacherType;
//    }
//
//    public List<Course> getCourses() {
//        return courses;
//    }
//
//    public void setCourses(List<Course> courses) {
//        this.courses = courses;
//    }
//
//    public void sendComplaint(Student student, String message, enums.Urgency urgency) {
//      System.out.println("Complaint sent with urgency level: " + urgency + " Message:" + message + " about Student: " + student.getName());
//    }
//    public int calculateHIndex(){
//        //calculate method for the h-index of teacher
//        return this.researchPapers.size();
//    }
//    public void viewCourses(){
//        System.out.println("Teacher " + getName() + " is viewing courses.");
//    }
//    public void viewStudents(){
//        System.out.println("Teacher " + getName() + " is viewing students.");
//    }
//
//    public void sendMessage(String message) {
//      System.out.println("Teacher " + getName() + " sent a message:" + message);
//    }
//
//    public void sendOrder(String order) {
//      System.out.println("Teacher " + getName() + " sent an order:" + order);
//    }
//
//
//  @Override
//  public List<ResearchPaper> getResearchPapers() {
//    return researchPapers;
//  }
//
//  public void setResearchPapers(List<ResearchPaper> researchPapers) {
//    this.researchPapers = researchPapers;
//  }
//
//  @Override
//  public List<ResearchProject> getResearchProjects() {
//    return researchProjects;
//  }
//
//  public void setResearchProjects(List<ResearchProject> researchProjects) {
//    this.researchProjects = researchProjects;
//  }
//
//  @Override
//  public void printPapers(Comparator<ResearchPaper> comparator) {
//    this.researchPapers.sort(comparator);
//    for (ResearchPaper paper: this.researchPapers){
//      System.out.println(paper.toString());
//    }
//  }
//    @Override
//    public boolean equals(Object o) {
//      if (this == o) return true;
//      if (o == null || getClass() != o.getClass()) return false;
//      if (!super.equals(o)) return false;
//      Teacher teacher = (Teacher) o;
//      return teacherType == teacher.teacherType;
//    }
//
//    @Override
//    public int hashCode() {
//      return Objects.hash(super.hashCode(), teacherType);
//    }
//
//    @Override
//    public String toString() {
//      return "Teacher{" +
//          "teacherType=" + teacherType +
//          ", courses=" + courses +
//          "} " + super.toString();
//    }
//}
package models;

import enums.TeacherTitle;
import research.Research;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Comparator;

//Teacher.java
public class Teacher extends Employee implements Research {
    private TeacherTitle teacherType;
    private List<Course> courses;
    private List<ResearchPaper> researchPapers;
    private List<ResearchProject> researchProjects;

    public Teacher() {
        super();
    }

    public Teacher(String name, String password, TeacherTitle teacherType) {
        super(name, password);
        this.teacherType = teacherType;
        this.researchPapers = new ArrayList<>();
        this.researchProjects = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public TeacherTitle getTeacherType() {
        return teacherType;
    }

    public void setTeacherType(TeacherTitle teacherType) {
        this.teacherType = teacherType;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void sendComplaint(Student student, String message, enums.Urgency urgency) {
        System.out.println(
                "Complaint sent with urgency level: "
                        + urgency
                        + " Message:"
                        + message
                        + " about Student: "
                        + student.getName());
    }

    public int calculateHIndex() {
        // calculate method for the h-index of teacher
        return this.researchPapers.size();
    }

    public void viewCourses() {
        System.out.println("Teacher " + getName() + " is viewing courses.");
    }

    public void viewStudents() {
        System.out.println("Teacher " + getName() + " is viewing students.");
    }

    public void sendMessage(String message) {
        System.out.println("Teacher " + getName() + " sent a message:" + message);
    }

    public void sendOrder(String order) {
        System.out.println("Teacher " + getName() + " sent an order:" + order);
    }

    @Override
    public List<ResearchPaper> getResearchPapers() {
        return researchPapers;
    }

    public void setResearchPapers(List<ResearchPaper> researchPapers) {
        this.researchPapers = researchPapers;
    }

    @Override
    public List<ResearchProject> getResearchProjects() {
        return researchProjects;
    }

    public void setResearchProjects(List<ResearchProject> researchProjects) {
        this.researchProjects = researchProjects;
    }

    @Override
    public void printPapers(Comparator<ResearchPaper> comparator) {
        this.researchPapers.sort(comparator);
        for (ResearchPaper paper : this.researchPapers) {
            System.out.println(paper.toString());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return teacherType == teacher.teacherType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), teacherType);
    }

    @Override
    public String toString() {
        return "Teacher{"
                + "teacherType="
                + teacherType
                + ", courses="
                + courses
                + "} "
                + super.toString();
    }
}