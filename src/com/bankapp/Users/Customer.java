package com.bankapp.Users;

import com.bankapp.Account.BankAccount;
import java.util.ArrayList;

public class Customer extends User {
    private BankAccount checkingAccount;
    private BankAccount savingsAccount;

    private  ArrayList<BankAccount> accounts = new ArrayList<>();

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

    public ArrayList<BankAccount>  getAccountType(String type){

        ArrayList<BankAccount>types=new ArrayList<>();

        for(BankAccount accountType: accounts) {

            if (accountType.getType().equals(type)) {

                types.add(accountType);

                return types;
            }
        }

       throw new IllegalArgumentException("NO");
    }

}
