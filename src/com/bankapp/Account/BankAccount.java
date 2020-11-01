package com.bankapp.Account;

public class BankAccount {
    private AccountType type;
    private double balance;
    private int accountID;
    private String accountHolder;

    public BankAccount(AccountType type, double balance, int accountID, String accountHolder) {
        this.type = type;
        this.balance = balance;
        this.accountID = accountID;
        this.accountHolder = accountHolder;
    }

    public double deposit(double value) throws ExceptionInInitializerError {
        if(value <= 0)
            throw new ExceptionInInitializerError("Value can not be 0 or less.");
        balance += value;
        return balance;
    }

    public double withdraw(double value) throws ExceptionInInitializerError {
        if(value <= 0)
            throw new ExceptionInInitializerError("Value can not be 0 or less.");
        balance -= value;
        return balance;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
}
