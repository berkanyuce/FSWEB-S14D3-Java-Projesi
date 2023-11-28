package com.s14g3;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLiter, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }
    public double getAvgKmPerLitre() {
        return avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }
    @Override
    public void startEngine() {
        System.out.println("Gas car is starting");
    }

    @Override
    public void drive() {
        System.out.println("Gas car is driving");
    }

}
