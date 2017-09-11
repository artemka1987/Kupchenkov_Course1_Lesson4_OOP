package Kupchenkov.Course1.Lesson4;

import java.util.Arrays;

public class MessageStore {

    private Message[] messages;

    public MessageStore() {
        messages = new Message[0];
    }

    public void add(Message message){

        Message[] tmpMessages = new Message[messages.length + 1];
        System.arraycopy(messages, 0, tmpMessages, 0, messages.length);
        tmpMessages[messages.length] = message;
        messages = tmpMessages;

    }

    public Message[] getMessages() {
        return messages;
    }

    @Override
    public String toString() {
        return Arrays.toString(messages);
    }
}
