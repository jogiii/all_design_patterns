package com.design.patterns.behavioural.strategy.solution;

import com.design.patterns.behavioural.strategy.solution.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
