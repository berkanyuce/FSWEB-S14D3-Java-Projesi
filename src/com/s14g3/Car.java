package com.s14g3;

public class Car {
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", wheels=" + wheels +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return cylinders == car.cylinders && name.equals(car.name);
    }

    public String startEngine() {
        return "The " + getClass().getSimpleName() + "'s engine is starting.";
    }

    public String accelerate() {
        return "The " + getClass().getSimpleName() + " is accelerating";
    }

    public String brake() {
        return "The " + getClass().getSimpleName() + " is braking";
    }

}
