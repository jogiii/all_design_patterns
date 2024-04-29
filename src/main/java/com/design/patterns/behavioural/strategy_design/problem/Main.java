package com.design.patterns.behavioural.strategy_design.problem;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();
        vehicle.engine();
    }
}
