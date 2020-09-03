package com.codecool.train.company;

import com.codecool.train.company.train.Freight;
import com.codecool.train.company.train.Train;

import java.util.HashSet;
import java.util.Set;

public class TrainCompany {
    Set<Train> trains = new HashSet<>();

    public void registerTrains(){
        trains.add(new Freight(1000, 550, 35));
    }


    public double calculateIncome(int numberOfMonths) {
        for (Train train : trains) {
            return train.calculateMonthlyIncome()*numberOfMonths;
        }
        return 0;
    }
}
