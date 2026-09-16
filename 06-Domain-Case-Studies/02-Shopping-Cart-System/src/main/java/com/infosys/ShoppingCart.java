package com.infosys;
public class ShoppingCart {

    private double total;

    public ShoppingCart() {
        total = 0;
    }

    public void addProduct(double price) {
        if (price > 0) {
            total += price;
        }
    }

    public boolean removeProduct(double price) {
        if (price > 0 && price <= total) {
            total -= price;
            return true;
        }
        return false;
    }

    public double getTotal() {
        return total;
    }
}