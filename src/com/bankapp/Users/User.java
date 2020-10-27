package com.bankapp.Users;

import java.text.NumberFormat;

public class User {
    private int ID;
    private String name;
    private String phoneNumber;
    private double balance;

    public User(int ID, String name, String phoneNumber, double balance) {
        this.ID = ID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        setBalance(balance);
    }
//Deposit method starts
    public void deposit(double value){
        double balance = depositedAmount(value);
        double total = totalBalance(balance);
        if(value < 0)
            throw new IllegalArgumentException("Can not be O or less.");
        System.out.println(NumberFormat.getCurrencyInstance().format(total));
    }

    private double totalBalance(double balance) {
        return balance;
    }

    private double depositedAmount(double value) {
        return value;
    }
//Deposit method finishes


    public double withdraw (double value) {
        if (value<balance)
            balance= balance-value;
        else
            System.out.println("Not enough amount in your balance");
        return balance;
    }
    public int transferFunds (int value){
        if (value<=balance)
            balance=balance-value;
        else
            System.out.println("Transfer not completed, money crashed.");
        return value;
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

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        if (balance < 0)
            throw new IllegalArgumentException("Can not be less than 0.");
        this.balance = balance;
    }
}
