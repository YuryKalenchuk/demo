package data.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String busRegNum;

    private String userEmail;

    private String text;

    private boolean isAnswered;

    private Date date;

    public Feedback() {
    }

    public Feedback(String busRegNum, String userEmail, String text, boolean isAnswered, Date date) {
        this.busRegNum = busRegNum;
        this.userEmail = userEmail;
        this.text = text;
        this.isAnswered = isAnswered;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBusRegNum() {
        return busRegNum;
    }

    public void setBusRegNum(String busRegNum) {
        this.busRegNum = busRegNum;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isAnswered() {
        return isAnswered;
    }

    public void setAnswered(boolean answered) {
        isAnswered = answered;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
