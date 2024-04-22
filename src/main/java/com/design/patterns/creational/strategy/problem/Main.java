package com.design.patterns.creational.strategy.problem;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();
        vehicle.engine();
    }
}
