package com.design.patterns.behavioural.strategy_design.solution;

import com.design.patterns.behavioural.strategy_design.solution.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
