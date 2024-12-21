package models;
import java.util.Date;
public class Message {
	private Employee sender;
	private User reciever;
	private String messageText;
	private Date date = new Date(System.currentTimeMillis());
	public Message() {
    }

    public Message(User receiver, String messageText) {
        this.reciever = receiver;
        this.messageText = messageText;
    }
    public Message(Employee sender, User receiver, String messageText) {
        this.sender = sender;
        this.reciever = receiver;
        this.messageText = messageText;
    }
   

    public User getReceiver() {
        return this.reciever;
    }

    public void setReceiver(User receiver) {
        this.reciever = receiver;
    }

    public Employee getSender() {
        return this.sender;
    }

    public void setSender(Employee sender) {
        this.sender = sender;
    }

    public String getMessageText() {
        return this.messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}