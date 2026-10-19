package com.musclemason.muscle_mason.user;

import com.musclemason.muscle_mason.nutrition.FoodItem;

public class Client extends Person {

    private double weight;
    private double height;
    private String gender;
    private final String accountID;
    private enum fitnessGoal { Cut, Bulk, Maintain }
    private enum activityLevel { Low, Medium, High }

    public Client(String firstName, String lastName, String phoneNumber, String email,
                  double weight, double height, String gender, String accountID) {
        super(firstName, lastName, phoneNumber, email);
        this.weight = weight;
        this.height = height;
        this.accountID = accountID;
        this.gender = gender;
    }

    public Client(String accountID) {
        super("", "","","");
        this.accountID = accountID;
        this.weight = 0.0;
        this.height = 0.0;
        this.gender = "";
    }

    public Client() {
        super("","","","");
        this.accountID = "";
        this.weight = 0.0;
        this.height = 0.0;
        this.gender = "";
    }

    public String getAccountID() { return accountID; }
    public double getWeight() { return weight; }
    public double getHeight() { return height; }
    public String getGender() { return gender; }

    public void setWeight() { this.weight = weight; }
    public void setHeight() { this.height = height; }
    public void setGender() { this.gender = gender; }
}
