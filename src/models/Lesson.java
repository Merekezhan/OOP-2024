package models;
import java.util.Date;
import java.util.Objects;
//Lesson.java
public class Lesson {
    private Teacher teacher;
  private Course course;
    private Date startTime;
    private Date endTime;
  private String studySet;

    public Lesson() {
    }

    public Lesson(Teacher teacher, Course course, Date startTime, Date endTime, String studySet) {
      this.teacher = teacher;
        this.course = course;
        this.startTime = startTime;
        this.endTime = endTime;
      this.studySet = studySet;
    }

  public Teacher getTeacher() {
    return teacher;
  }

  public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
  }

  public Course getCourse() {
    return course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }

  public Date getStartTime() {
    return startTime;
  }

  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  public Date getEndTime() {
    return endTime;
  }

  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  public String getStudySet() {
    return studySet;
  }

  public void setStudySet(String studySet) {
    this.studySet = studySet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Lesson lesson = (Lesson) o;
    return Objects.equals(teacher, lesson.teacher) && Objects.equals(course, lesson.course) && Objects.equals(startTime, lesson.startTime) && Objects.equals(endTime, lesson.endTime) && Objects.equals(studySet, lesson.studySet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teacher, course, startTime, endTime, studySet);
  }

  @Override
  public String toString() {
    return "Lesson{" +
        "teacher=" + teacher +
        ", course=" + course +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", studySet='" + studySet + '\'' +
        '}';
  }
}
