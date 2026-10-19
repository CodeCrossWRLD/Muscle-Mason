package com.musclemason.muscle_mason.user;

public class User extends Person {

    private int permission;
    private String username;
    private String password;

    public User(String firstName, String lastName, String phoneNumber, String email,
                int permission, String username, String password) {
        super(firstName, lastName, phoneNumber, email);
        this.permission = permission;
        this.username = username;
        this.password = password;
    }


}
