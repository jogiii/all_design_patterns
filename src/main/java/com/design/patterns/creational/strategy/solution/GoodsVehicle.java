package com.design.patterns.creational.strategy.solution;

import com.design.patterns.creational.strategy.solution.strategy.DriveStrategy;
import com.design.patterns.creational.strategy.solution.strategy.SportsDriveStrategy;

public class GoodsVehicle extends Vehicle {


     GoodsVehicle() {
        super(new SportsDriveStrategy());
    }
}
