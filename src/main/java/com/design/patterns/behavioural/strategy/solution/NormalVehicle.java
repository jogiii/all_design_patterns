package com.design.patterns.behavioural.strategy.solution;

import com.design.patterns.behavioural.strategy.solution.strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle {


    public NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
