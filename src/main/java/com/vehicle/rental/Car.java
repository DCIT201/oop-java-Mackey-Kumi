package com.vehicle.rental;

public class Car extends Vehicle {
    private boolean hasAirConditioning;

    public Car(String vehicleId, String model, double baseRentalRate, boolean isAvailable, boolean hasAirConditioning) {
        super(vehicleId, model, baseRentalRate, isAvailable);
        this.hasAirConditioning = hasAirConditioning;
    }

    public boolean hasAirConditioning() {
        return hasAirConditioning;
    }

    public void setHasAirConditioning(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = days * getBaseRentalRate();
        if (hasAirConditioning) {
            cost += days * 5; // Additional cost for air conditioning
        }
        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public String toString() {
        return "Car{" +
                "vehicleId='" + getVehicleId() + '\'' +
                ", model='" + getModel() + '\'' +
                ", baseRentalRate=" + getBaseRentalRate() +
                ", hasAirConditioning=" + hasAirConditioning +
                ", isAvailable=" + isAvailable() +
                '}';
    }
}
