package models;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
//News.java
public class News {
    private String topic;
    private String content;
    private Date date;
    private String organization;
    private String title;
    private List<Comment> comments;
    public News(){

    }
    public News(String topic, String content, Date date, String organization, String title) {
        this.topic = topic;
        this.content = content;
        this.date = date;
        this.organization = organization;
      this.title = title;
      this.comments = new ArrayList<>();
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
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

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public List<Comment> getComments() {
    return comments;
  }

  public void setComments(List<Comment> comments) {
    this.comments = comments;
  }

    public void pinNews(){
        System.out.println("News " + this.title + " pinned!");
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    News news = (News) o;
    return Objects.equals(topic, news.topic) && Objects.equals(content, news.content) && Objects.equals(date, news.date) && Objects.equals(organization, news.organization) && Objects.equals(title, news.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topic, content, date, organization, title);
  }

  @Override
  public String toString() {
    return "News{" +
        "topic='" + topic + '\'' +
        ", content='" + content + '\'' +
        ", date=" + date +
        ", organization='" + organization + '\'' +
        ", title='" + title + '\'' +
        ", comments=" + comments +
        '}';
  }
public Object getTitles() {
	return title;
}
}