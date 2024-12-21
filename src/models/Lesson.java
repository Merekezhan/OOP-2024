package models;

import java.util.Date;
import java.util.Objects;
//Lesson.java
public class Lesson {
    private Course course;
    private Date date;
    private String room;

    public Lesson() {
    }

    public Lesson(Course course, Date date, String room) {
        this.course = course;
        this.date = date;
        this.room = room;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Lesson lesson = (Lesson) o;
    return Objects.equals(course, lesson.course) && Objects.equals(date, lesson.date) && Objects.equals(room, lesson.room);
  }

  @Override
  public int hashCode() {
    return Objects.hash(course, date, room);
  }

  @Override
  public String toString() {
    return "Lesson{" +
        "course=" + course +
        ", date=" + date +
        ", room='" + room + '\'' +
        '}';
  }
}
