package com.ll.d.inheritance.pratice.vehicle;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    String model;
    int dailyRate;

    public int calculateRentalCost(int days) {
        return days * dailyRate;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "model='" + model + '\'' + ", dailyRate=" + dailyRate + '}';
    }
}
