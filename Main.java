package Kupchenkov.Course1.Lesson4;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        //Создаем хранилище
        MessageStore messageStore = new MessageStore();

        //Создаем Message
        Message message = new Message(1, "Message text", new User(1, "Ivan", "Ivanov", "ivanov@gmail.com", Calendar.getInstance().getTime()), Calendar.getInstance().getTime());

        //Создаем PrivateMessage
        PrivateMessage privateMessage = new PrivateMessage(1, "Private message text", new User(2, "Petrov", "Petr", "petrov@gmail.com", Calendar.getInstance().getTime()),
                                            Calendar.getInstance().getTime(), new User(3, "Sidorov", "Ivan", "sidiriv@gmail.com", Calendar.getInstance().getTime()));

        //Создаем PostMessage
        PostMessage postMessage = new PostMessage(1, "Post message text", new User(4, "Titov", "Uriy", "titov@gmail.com", Calendar.getInstance().getTime()),
                                            Calendar.getInstance().getTime(), new Post(1, "Post title", "Post text", Calendar.getInstance().getTime()));

        //Добавляем сообщения в хранилище
        message.send(messageStore);
        privateMessage.send(messageStore);
        postMessage.send(messageStore);

        //Выводим хранилище на экран
        for (Message msg : messageStore.getMessages()){
            System.out.println(msg);
        }

    }


}
