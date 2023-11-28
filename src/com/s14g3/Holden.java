package com.s14g3;

public class Holden extends Car{
    public Holden(int cylinder, String name) {
        super(cylinder, name);
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
