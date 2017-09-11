package Kupchenkov.Course1.Lesson4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {

    private int messageId;
    private String text;
    private User author;
    private Date date;

    public void send(MessageStore messageStore){
        messageStore.add(Message.this);
    }

    public Message(){
        messageId = -1;
        text = "";
        author = new User();
        date = new Date();
    }

    public Message(int messageId, String text, User author, Date date) {
        this.messageId = messageId;
        this.text = text;
        this.author = author;
        this.date = date;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return "Message: messageId = " + messageId + ", text = " + text + ", author: " + author + ", message date = " + dateFormat.format(date);
    }
}
