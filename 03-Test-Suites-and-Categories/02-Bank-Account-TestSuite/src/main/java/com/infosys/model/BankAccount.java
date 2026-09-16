package com.infosys.model;

public class BankAccount {

    private String accHolder;
    private double balance;

    public BankAccount(String accHolder, double balance) {
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccHolder() {
        return accHolder;
    }
}
