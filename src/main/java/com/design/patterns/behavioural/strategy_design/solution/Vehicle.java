package com.design.patterns.behavioural.strategy_design.solution;

import com.design.patterns.behavioural.strategy_design.solution.strategy.DriveStrategy;

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
