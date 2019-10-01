package com.selftraining.springboot.WebServiceSandBox.CustomException;

import java.util.Date;

public class CustomExceptionResponse {

    private Date timeStamp = new Date();
    private String messaje;
    private String details;

    public CustomExceptionResponse(String messaje, String details) {
        this.messaje = messaje;
        this.details = details;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessaje() {
        return messaje;
    }

    public void setMessaje(String messaje) {
        this.messaje = messaje;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
