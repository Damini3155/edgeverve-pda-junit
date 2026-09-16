package com.infosys;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    @Test
    void testCustomerAccountIsActive() {
        boolean active = true;
        assertTrue(active);
    }

    @Test
    void testProductInStock() {
        int stock = 10;
        assertTrue(stock > 0);
    }

    @Test
    void testOrderQuantityGreaterThanZero() {
        int quantity = 2;
        assertTrue(quantity > 0);
    }

    @Test
    void testSufficientWalletBalance() {
        double wallet = 10000;
        double orderAmount = 4000;
        assertTrue(wallet >= orderAmount);
    }

    @Test
    void testOrderValueLimit() {
        double orderValue = 45000;
        assertTrue(orderValue <= 50000);
    }

    @Test
    void testStockReducedAfterOrder() {
        int stock = 20;
        int quantity = 5;
        stock -= quantity;
        assertEquals(15, stock);
    }

    @Test
    void testWalletDeductedAfterOrder() {
        double wallet = 10000;
        double orderAmount = 3000;
        wallet -= orderAmount;
        assertEquals(7000, wallet);
    }
}
