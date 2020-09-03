package com.codecool.train.company.train;

public abstract class Train {
    protected double costPerMonth;

    public Train(double costPerMonth) {
        this.costPerMonth = costPerMonth;
    }

    public abstract double calculateMonthlyIncome();
}
