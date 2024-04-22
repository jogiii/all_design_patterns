package com.design.patterns.creational.strategy.solution;

import com.design.patterns.creational.strategy.solution.strategy.DriveStrategy;

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
