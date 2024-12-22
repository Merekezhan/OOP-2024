package models;
import java.util.Date;
import java.util.Objects;
//Comment.java
public class Comment {
  private User author;
  private String content;
  private Date date;

  public Comment() {
  }

  public Comment(User author, String content, Date date) {
    this.author = author;
    this.content = content;
    this.date = date;
  }

  public User getAuthor() {
    return author;
  }

  public void setAuthor(User author) {
    this.author = author;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Comment comment = (Comment) o;
    return Objects.equals(author, comment.author) && Objects.equals(content, comment.content) && Objects.equals(date, comment.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, content, date);
  }

  @Override
  public String toString() {
    return "Comment{" +
        "author=" + author +
        ", content='" + content + '\'' +
        ", date=" + date +
        '}';
  }
}