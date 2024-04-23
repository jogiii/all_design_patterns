package com.design.patterns.behavioural.strategy.solution;

import com.design.patterns.behavioural.strategy.solution.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {


    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
