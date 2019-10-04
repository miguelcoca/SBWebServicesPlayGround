package com.selftraining.springboot.WebServiceSandBox.JavaObjectEntities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String ID;
    private String firstName;
    private String LastName;
    private String Address;

    @Autowired()
    public Person(@Qualifier("ID") String ID, @Qualifier("firstName") String firstName, @Qualifier("lastName") String lastName, @Qualifier("address") String address) {
        this.ID = ID;
        this.firstName = firstName;
        LastName = lastName;
        Address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
