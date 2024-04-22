package com.design.patterns.creational.strategy.solution;

import com.design.patterns.creational.strategy.solution.strategy.DriveStrategy;
import com.design.patterns.creational.strategy.solution.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {


    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
