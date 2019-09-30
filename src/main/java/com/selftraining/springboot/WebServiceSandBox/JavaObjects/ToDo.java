package com.selftraining.springboot.WebServiceSandBox.JavaObjects;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ToDo {
    private int ID;
    private String userName;
    private String description;
    private Date targetDate;
    private boolean isdone;

    public ToDo() {
    }

    public ToDo(int ID, String userName, String description, Date targetDate, boolean isdone) {
        this.ID = ID;
        this.userName = userName;
        this.description = description;
        this.targetDate = targetDate;
        this.isdone = isdone;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "ID=" + ID +
                ", userName='" + userName + '\'' +
                ", description='" + description + '\'' +
                ", targetDate=" + targetDate +
                ", isdone=" + isdone +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isIsdone() {
        return isdone;
    }

    public void setIsdone(boolean isdone) {
        this.isdone = isdone;
    }
}
