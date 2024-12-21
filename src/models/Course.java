package models;

import java.util.Date;
import java.util.Objects;
import enums.LessonType;
import enums.LanguageType;
//Course.java
public class Course {
    private int courseId;
    private String courseName;
    private int credits;
    private LessonType lessonType;
    private LanguageType language;
    private Teacher instructor;

    public Course() {
    }

    public Course(int courseId, String courseName, int credits, LessonType lessonType, LanguageType language, Teacher instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.lessonType = lessonType;
        this.language = language;
        this.instructor = instructor;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
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

    public LanguageType getLanguage() {
        return language;
    }

    public void setLanguage(LanguageType language) {
        this.language = language;
    }

  public Teacher getInstructor() {
    return instructor;
  }

  public void setInstructor(Teacher instructor) {
    this.instructor = instructor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Course course = (Course) o;
    return courseId == course.courseId && credits == course.credits && Objects.equals(courseName, course.courseName) && lessonType == course.lessonType && language == course.language;
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseId, courseName, credits, lessonType, language);
  }

  @Override
  public String toString() {
    return "Course{" +
        "courseId=" + courseId +
        ", courseName='" + courseName + '\'' +
        ", credits=" + credits +
        ", lessonType=" + lessonType +
        ", language=" + language +
        ", instructor=" + instructor +
        '}';
  }
}
