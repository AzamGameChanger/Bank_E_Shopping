package com.bankapp;

import com.bankapp.Account.BankAccount;
import com.bankapp.Account.CheckingAccount;
import com.bankapp.Account.SavingsAccount;
import com.bankapp.Users.Customer;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        BankAccount savings = new SavingsAccount("Savings Account", 5000, "Amin", 123456789, 7777);
        BankAccount checking = new CheckingAccount("Checking Account", 1000, "Amin", 987654321, 4444);

        Customer customer = new Customer(1,"James","1252",checking,savings);
        System.out.println(customer.getAccounts().size());


        for (BankAccount bankAccount : customer.getAccounts())
        System.out.println(bankAccount.getAccountID() + "___" + bankAccount.getBalance());

        try {
            BankAccount sonAccount = customer.getBankAccount(987654321);
                System.out.println(sonAccount.getBalance());
            }
        catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
        }

        try {
            ArrayList<BankAccount> familySavings = customer.getAccountType("Savings Account");
            System.out.println(familySavings);
        }catch (IllegalArgumentException a){
            System.out.println(a.getMessage());
        }


        System.out.println(customer.getAccounts().size());






    }
}
