package com.bankapp.Account;

public class CheckingAccount extends BankAccount{

    public CheckingAccount(String type, double balance, String owner, int accountID, int customerID) {
        super(type, balance, owner, accountID, customerID);
    }
}
