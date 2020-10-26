package com.bankapp.Account;

public class BankAccount {
    private String type;
    private double balance;
    private String owner;
    private int accountID;
    private int customerID;


    public BankAccount(String type, double balance, String owner,int accountID,int customerID) {
        this.type=type;
        this.balance=balance;
        this.owner = owner;
        this.accountID = accountID;
        this.customerID = customerID;
    }

    public String getType() {
        return type;
    }

    private void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;

    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
}
