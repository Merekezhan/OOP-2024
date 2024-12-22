package models;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
//StudentOrganization.java
public class Organization {
  private String name;
  private List<Student> members;
  private Student head;

  public Organization() {
    this.members = new ArrayList<>();
  }

  public Organization(String name, Student head) {
    this.name = name;
    this.members = new ArrayList<>();
    this.head = head;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Student> getMembers() {
    return members;
  }

  public void setMembers(List<Student> members) {
    this.members = members;
  }

  public Student getHead() {
    return head;
  }

  public void setHead(Student head) {
    this.head = head;
  }
  public void addMember(Student student){
      this.members.add(student);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Organization that = (Organization) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return "StudentOrganization{" +
        "name='" + name + '\'' +
        ", members=" + members +
        ", head=" + head +
        '}';
  }
}