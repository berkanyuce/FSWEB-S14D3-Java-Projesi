package com.s14g3;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batteyrSize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    @Override
    public void startEngine() {
        System.out.println("Electric car is starting");
    }

    @Override
    public void drive() {
        System.out.println("Electric car is driving");
    }
    protected String runEngine() {
        return getName() + " engine running.";
    }
}
