package com.bankapp.Users;

import com.bankapp.Account.BankAccount;
import java.util.ArrayList;

public class Customer extends User {
    BankAccount checkingAccount;
    BankAccount savingsAccount;

    ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(int ID, String name, String phoneNumber, BankAccount checkingAccount, BankAccount savingsAccount) {
        super(ID, name, phoneNumber, 0);
        accounts.add(checkingAccount);
        accounts.add(savingsAccount);
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public BankAccount getBankAccount(int accountID) {

        for (BankAccount account : accounts) {
            if (account.getAccountID() == accountID) {
                return account;
            }
        }

        throw new IllegalArgumentException("Not found bank account : " + accountID);
    }

    public BankAccount getAccountType(String type){
//        ArrayList<BankAccount>types=new ArrayList<>();

        for(BankAccount accountType: accounts) {
            if (accountType.getType().equals(type)) {
                accounts.add(accountType);
                return accountType;
            }
        }

       throw new IllegalArgumentException("NO");
    }

}
