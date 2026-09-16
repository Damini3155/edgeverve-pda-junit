package com.infosys;


import com.infosys.model.BankAccount;
import com.infosys.service.TransactionService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    BankAccount account;
    BankAccount receiver;
    TransactionService service;

    @BeforeEach
    void setup() {
        account = new BankAccount("Damini", 1000);
        receiver = new BankAccount("Rahul", 500);
        service = new TransactionService();
    }

    //1. Verify account holder name
    @Test
    void testAccountHolder() {
        assertEquals("Damini", account.getAccHolder());
        assertNotNull(account.getAccHolder());
    }

    //2. Verify initial balance
    @Test
    void testInitialBalance() {
        assertEquals(1000, account.getBalance());
    }

    //3. Deposit 500 and verify
    @Test
    void testDeposit() {
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }

    //4. Collection of transactions
    @Test
    void testTransactions() {

        account.deposit(500);      //1500

        account.withdraw(300);     //1200

        service.transfer(account, receiver, 200);

        assertEquals(1000, account.getBalance());

        assertEquals(700, receiver.getBalance());

        assertTrue(account.getBalance() > 0);

        assertNotNull(account);
    }
}
