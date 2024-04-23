package com.design.patterns.behavioural.strategy.solution;

import com.design.patterns.behavioural.strategy.solution.strategy.SportsDriveStrategy;

public class GoodsVehicle extends Vehicle {


     GoodsVehicle() {
        super(new SportsDriveStrategy());
    }
}
