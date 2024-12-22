package models;
import enums.LessonType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
//Course.java
public class Course {
    private String courseName;
    private int credits;
    private LessonType lessonType;
  private List<Lesson> lessons;
  private Teacher instructor;

  public Course() {
    }

    public Course(String courseName, int credits, LessonType lessonType, Teacher instructor) {
        this.courseName = courseName;
        this.credits = credits;
        this.lessonType = lessonType;
        this.lessons = new ArrayList<>();
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public LessonType getLessonType() {
        return lessonType;
    }

    public void setLessonType(LessonType lessonType) {
        this.lessonType = lessonType;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

  public Teacher getInstructor() {
    return instructor;
  }

  public void setInstructor(Teacher instructor) {
    this.instructor = instructor;
  }

    public void addLesson(Lesson lesson){
        this.lessons.add(lesson);
    }
    public void removeLesson(Lesson lesson){
        this.lessons.remove(lesson);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Course course = (Course) o;
    return credits == course.credits && Objects.equals(courseName, course.courseName) && lessonType == course.lessonType ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseName, credits, lessonType);
  }

  @Override
  public String toString() {
    return "Course{" +
        "courseName='" + courseName + '\'' +
        ", credits=" + credits +
        ", lessonType=" + lessonType +
        ", lessons=" + lessons +
        ", instructor=" + instructor +
        '}';
  }
}