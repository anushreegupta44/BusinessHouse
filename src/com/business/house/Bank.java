package com.business.house;

public class Bank {
    private final int initialBalance = 5000;
    private int currentBal;

    public Bank() {
        this.currentBal = initialBalance;
    }

    public void addMoney(int penalty) {
        currentBal += penalty;
    }

    public void deductMoney(int windfall) {
        currentBal -= windfall;
    }

    public int getCurrentBal() {
        return currentBal;
    }
}
