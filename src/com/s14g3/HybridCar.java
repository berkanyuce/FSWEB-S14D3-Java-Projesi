package com.s14g3;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLiter, int batterySize, int cylinders) {
        super(name, description);
        this.batterySize = batterySize;
        this.cylinders = cylinders;
        this.avgKmPerLiter = avgKmPerLiter;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLiter;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Hybrid car is starting");
    }

    @Override
    public void drive() {
        System.out.println("Hybrid car is driving");
    }

    protected String runEngine() {
        return getName() + " engine running.";
    }
}
