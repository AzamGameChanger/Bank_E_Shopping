package com.bankapp.Users;

public class User {
    private String name;
    private String phoneNumber;
    private String email;
    private int userID;

    public User(String name, String phoneNumber, String email, int userID) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
