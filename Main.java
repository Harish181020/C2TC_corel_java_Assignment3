package com.dhanushpandi.assignment3;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account acc1 = new SavingsAccount(1000);
        Transaction tx = new Transaction();

        tx.performTransaction(acc1, 200, "deposit");
        System.out.println("Balance: " + acc1.getBalance());

        Bank bank2 = new Bank();
        System.out.println("Total Bank Accounts: " + Bank.getTotalAccounts());
    }
}
