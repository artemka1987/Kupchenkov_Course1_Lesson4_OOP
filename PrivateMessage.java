package Kupchenkov.Course1.Lesson4;

import java.util.Date;

public class PrivateMessage extends Message {

    private User user;

    public PrivateMessage(int messageId, String text, User author, Date date, User user) {
        super(messageId, text, author, date);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return  "Private " + super.toString() + ", user: " + user;
    }
}
