package com.s14g3;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void startEngine() {
        System.out.println("Car is starting...");
    }
    public void drive() {
        runEngine();
    }
    protected String runEngine() {
        return getName() + " engine running.";
    }
}
