package com.design.patterns.behavioural.strategy_design.problem;

public class NormalVehicle extends Vehicle{

    @Override
    public void engine() {
        System.out.println("Sports engine");
    }

    @Override
    public void drive() {
        System.out.println("Sports drive");
    }
}
