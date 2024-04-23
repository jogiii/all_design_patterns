package com.design.patterns.behavioural.strategy.solution;


public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();
        vehicle.engine();
    }
}
