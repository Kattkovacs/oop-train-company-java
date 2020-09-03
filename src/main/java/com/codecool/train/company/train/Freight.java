package com.codecool.train.company.train;

import com.codecool.train.company.train.Train;

public class Freight extends Train {
    private double revenue;
    private int abroadChance;

    public Freight(double costPerMonth, double revenue, int abroadChance) {
        super(costPerMonth);
        this.revenue = revenue;
        this.abroadChance = abroadChance;
    }

    @Override
    public double calculateMonthlyIncome() {
        return 0;
    }
}
