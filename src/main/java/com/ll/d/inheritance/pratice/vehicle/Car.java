package com.ll.d.inheritance.pratice.vehicle;

public class Car extends Vehicle {
    boolean hasGPS;

    public Car(String model, int dailyRate, boolean hasGPS) {
        super(model, dailyRate);
        this.hasGPS = hasGPS;
    }

    @Override
    public int calculateRentalCost(int days) {
        if (hasGPS) {
            dailyRate += 10000;
        }
        return super.calculateRentalCost(days);
    }

    @Override
    public String toString() {
        return "Car{" + "hasGPS=" + hasGPS + ", model='" + model + '\'' + ", dailyRate=" + dailyRate + '}';
    }
}
