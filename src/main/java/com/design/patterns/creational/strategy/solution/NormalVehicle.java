package com.design.patterns.creational.strategy.solution;

import com.design.patterns.creational.strategy.solution.strategy.DriveStrategy;
import com.design.patterns.creational.strategy.solution.strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle {


    public NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
