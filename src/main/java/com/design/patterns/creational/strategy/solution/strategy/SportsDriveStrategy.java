package com.design.patterns.creational.strategy.solution.strategy;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("sports drive strategy");
    }

    @Override
    public void engine() {
        System.out.println("sports engine strategy");
    }
}
