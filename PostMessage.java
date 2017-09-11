package Kupchenkov.Course1.Lesson4;

import java.util.Date;

public class PostMessage extends Message {

    private Post post;

    public PostMessage(int messageId, String text, User author, Date date, Post post) {
        super(messageId, text, author, date);
        this.post = post;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Post " + super.toString() + ", " + post;
    }
}
