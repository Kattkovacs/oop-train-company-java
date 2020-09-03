package com.codecool.train.company.app;

import com.codecool.train.company.TrainCompany;


public class App
{
    public static void main( String[] args )
    {
        TrainCompany trainCompany = new TrainCompany();
        trainCompany.registerTrains();
        System.out.println(trainCompany.calculateIncome(12));
    }
}
