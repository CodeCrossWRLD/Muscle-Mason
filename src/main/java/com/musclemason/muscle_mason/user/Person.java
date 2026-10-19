package com.musclemason.muscle_mason.user;

public abstract class Person {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    public Person(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName () {
        return firstName;
    }
    public String getLastName () {
        return lastName;
    }
    public String getPhoneNumber () {
        return phoneNumber;
    }
    public String getEmail () {
        return email;
    }

    public void setFirstName() { this.firstName = firstName; }
    public void setLastName() { this.lastName = lastName; }
    public void setPhoneNumber() { this.phoneNumber = phoneNumber; }
    public void setEmail() { this.email = email; }
}
