package com.bankapp;

import com.bankapp.Account.BankAccount;
import com.bankapp.Account.CheckingAccount;
import com.bankapp.Account.SavingsAccount;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        BankAccount savings = new SavingsAccount("Savings Account", 5000, "Amin", 123456789, 7777);
        BankAccount checking = new CheckingAccount("Checking Account", 1000, "Amin", 987654321, 4444);

        ArrayList<BankAccount>accounts = new ArrayList<>();;
        accounts.add(savings);
        accounts.add(checking);

        double amount=0;
        for (BankAccount total : accounts){
            amount += total.getBalance();
        }
        System.out.println("Total balance : " + amount);
        System.out.println(savings.getType() + " : " + savings.getBalance());
        System.out.println(checking.getType() + " : " + checking.getBalance());


    }
}
