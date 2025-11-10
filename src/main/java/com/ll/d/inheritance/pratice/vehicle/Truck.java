package com.ll.d.inheritance.pratice.vehicle;

public class Truck extends Vehicle {
    double capacity;

    public Truck(String model, int dailyRate, double capacity) {
        super(model, dailyRate);
        this.capacity = capacity;
    }

    @Override
    public int calculateRentalCost(int days) {
        dailyRate += capacity*5000;
        return super.calculateRentalCost(days);
    }

    @Override
    public String toString() {
        return "Truck{" + "capacity=" + capacity + ", model='" + model + '\'' + ", dailyRate=" + dailyRate + '}';
    }
}
