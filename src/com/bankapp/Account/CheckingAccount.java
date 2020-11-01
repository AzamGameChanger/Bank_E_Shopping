package com.bankapp.Account;
public class CheckingAccount extends BankAccount{

    public CheckingAccount(AccountType type, double balance, int accountID, String accountHolder) {
        super(type, balance, accountID, accountHolder);
    }
}
