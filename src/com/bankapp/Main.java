package com.bankapp;

import com.bankapp.Account.AccountType;
import com.bankapp.Account.BankAccount;
import com.bankapp.Account.CheckingAccount;
import com.bankapp.Account.SavingsAccount;
import com.bankapp.Users.Customer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        BankAccount savings = new SavingsAccount(AccountType.SAVINGS_ACCOUNT, 500.6, 224455, "Amin");
        BankAccount checking = new CheckingAccount(AccountType.CHECKING_ACCOUNT, 600.3, 552244, "Amin");
        Customer customer = new Customer("Amin", "+1347-256-8987", "aminplusplus@icloud.com", 7777, savings, checking);


        for (BankAccount bankAccount : customer.getAccounts())
            System.out.println(bankAccount.getAccountID() + "___" + bankAccount.getBalance());

        System.out.println(customer.totalMoney());

        try {
            BankAccount sonAccount = customer.getBankAccount(552244);
            System.out.println(sonAccount.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(customer.getAccounts().size());

        BankAccount sonChecking = null;
        BankAccount sonSavings = null;
        try {
            sonChecking = new CheckingAccount(AccountType.SAVINGS_ACCOUNT, 200.50, 556699, "Jon");
            sonSavings = new SavingsAccount(AccountType.SAVINGS_ACCOUNT, 300.60, 887788, "Jon");
        } catch (IllegalArgumentException balance) {
            System.out.println(balance.getMessage());
        }
        System.out.println(sonChecking.getAccountHolder());

        ArrayList<BankAccount> type = new ArrayList<>();
        type.add(sonChecking);
        type.add(sonSavings);
        for (BankAccount a : type)
            System.out.println("Bank Accounts : " + a.getType());

        try {
            savings.withdraw(-1);
            System.out.println(savings.getBalance());
        } catch (ExceptionInInitializerError m) {
            System.out.println(m.getMessage());
        }
    }
}