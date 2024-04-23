package com.design.patterns.behavioural.strategy.solution.strategy;

public class NormalDriveStrategy implements  DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal drive strategy");
    }

    @Override
    public void engine() {
        System.out.println("Normal Engine Strategy");
    }
}
