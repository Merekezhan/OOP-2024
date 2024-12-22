package models;
import java.util.Date;
import java.util.Objects;
//Message.java
public class Message {
    private User sender;
    private User receiver;
    private String content;
    private Date date;

    public Message() {
    }

    public Message(User sender, User receiver, String content, Date date) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.date = date;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
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
    Message message = (Message) o;
    return Objects.equals(sender, message.sender) && Objects.equals(receiver, message.receiver) && Objects.equals(content, message.content) && Objects.equals(date, message.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sender, receiver, content, date);
  }

  @Override
  public String toString() {
    return "Message{" +
        "sender=" + sender +
        ", receiver=" + receiver +
        ", content='" + content + '\'' +
        ", date=" + date +
        '}';
  }
}