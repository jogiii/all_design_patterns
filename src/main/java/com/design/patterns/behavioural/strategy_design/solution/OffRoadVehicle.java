package com.design.patterns.behavioural.strategy_design.solution;

import com.design.patterns.behavioural.strategy_design.solution.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {


    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
