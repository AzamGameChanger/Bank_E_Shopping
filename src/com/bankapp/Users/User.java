package com.bankapp.Users;

public class User {
    private int ID;
    private String name;
    private String phoneNumber;

    public User(int ID, String name, String phoneNumber) {
        this.ID = ID;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public double deposit(double value){
        return deposit(value);
    }

    public double withdraw (double value) {
        return withdraw(value);
    }
    public int transferFunds (int value){
        return transferFunds(value);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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
}
