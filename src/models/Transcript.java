package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
//Transcript.java
public class Transcript {
  private List<Mark> marks;
  public Transcript(){
    this.marks = new ArrayList<>();
  }
  public List<Mark> getMarks() {
    return marks;
  }

  public void setMarks(List<Mark> marks) {
    this.marks = marks;
  }

  public double getGpa(){
    double sum = 0;
    for(Mark mark: marks){
        sum += mark.getFinalExam();
    }
    return sum/ marks.size();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Transcript that = (Transcript) o;
    return Objects.equals(marks, that.marks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marks);
  }

  @Override
  public String toString() {
    return "Transcript{" +
        "marks=" + marks +
        '}';
  }
}
