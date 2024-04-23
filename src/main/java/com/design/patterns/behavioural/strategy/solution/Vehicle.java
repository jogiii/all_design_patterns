package com.design.patterns.behavioural.strategy.solution;

import com.design.patterns.behavioural.strategy.solution.strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }

    public void engine(){
        driveStrategy.engine();
    }
}
