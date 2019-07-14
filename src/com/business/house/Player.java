package com.business.house;

public class Player {
    private final int initialBalance = 1000;
    private final int initialPosition = 0;
    private int currentBalance;
    private int totalStepsTaken;
    private int totalAssetBalance;


    public Player() {
        this.currentBalance = initialBalance;
        this.totalStepsTaken = initialPosition;
        this.totalAssetBalance = 0;
    }

    public void deductMoney(int penalty) {
        setCurrentBalance(currentBalance - penalty);
    }

    public void addMoney(int windfall) {
        setCurrentBalance(currentBalance + windfall);
    }

    public boolean canAfford(int value) {
        if (currentBalance >= value) {
            return true;
        }
        return false;
    }

    public int move(int moveBy) {
        return totalStepsTaken += moveBy;
    }

    public int getTotalStepsTaken() {
        return totalStepsTaken;
    }

    public void addProperty(int propertyValue) {
        totalAssetBalance += propertyValue;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public int getTotalAssetBalance() {
        return totalAssetBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }
}
