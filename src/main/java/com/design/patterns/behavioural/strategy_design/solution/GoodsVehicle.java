package com.design.patterns.behavioural.strategy_design.solution;

import com.design.patterns.behavioural.strategy_design.solution.strategy.SportsDriveStrategy;

public class GoodsVehicle extends Vehicle {


     GoodsVehicle() {
        super(new SportsDriveStrategy());
    }
}
