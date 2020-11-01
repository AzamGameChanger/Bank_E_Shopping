package com.bankapp.Users;

import com.bankapp.Account.AccountType;
import com.bankapp.Account.BankAccount;
import java.util.ArrayList;

public class Customer extends User {
    private BankAccount checkingAccount;
    private BankAccount savingsAccount;

    private  ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String name, String phoneNumber, String email, int userID,BankAccount savingsAccount, BankAccount checkingAccount ) {
        super(name, phoneNumber, email, userID);
        accounts.add(savingsAccount);
        accounts.add(checkingAccount);
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public BankAccount getBankAccount(int accountID) throws IllegalArgumentException {
        for (BankAccount account : accounts) {
            if (account.getAccountID() == accountID) {
                return account;
            }
        }
        throw new IllegalArgumentException("Not found bank account : " + accountID);
    }

    public ArrayList<BankAccount>  getAccountType(AccountType accountType) throws IllegalArgumentException {
        ArrayList<BankAccount>types=new ArrayList<>();
        for(BankAccount account: accounts) {
            if (account.getType() == accountType) {
                types.add(account);
                return types;
            }
        }
       throw new IllegalArgumentException("Account does not exist.");
    }

    public double totalMoney(){
       double total = 0;
       for (BankAccount totalMoney: accounts)
           total += totalMoney.getBalance();
       return total;
    }


}
