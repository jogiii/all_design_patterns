package com.design.patterns.behavioural.strategy_design.solution;

import com.design.patterns.behavioural.strategy_design.solution.strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle {


    public NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
