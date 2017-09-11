package Kupchenkov.Course1.Lesson4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {

    private int userId;
    private String name;
    private String lastName;
    private String email;
    private Date registrationDate;

    public User(){
        userId = -1;
        name = "";
        lastName = "";
        email = "";
        registrationDate = new Date();
    }

    public User(int userId, String name, String lastName, String email, Date registrationDate) {
        this.userId = userId;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.registrationDate = registrationDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return " userId = " + userId + ", name = " + name + ", lastName = " + lastName + ", email = " + email + ", registrationDate = " + dateFormat.format(registrationDate);
    }
}
