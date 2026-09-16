package com.infosys.service;



import com.infosys.model.BankAccount;

public class TransactionService {

    public void transfer(BankAccount from, BankAccount to, double amount) {

        if (amount > 0 && from.getBalance() >= amount) {
            from.withdraw(amount);
            to.deposit(amount);
        }
    }
}