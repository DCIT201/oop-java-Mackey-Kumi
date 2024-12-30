package com.vehicle.rental;

public class Truck extends Vehicle {
    private double loadCapacity; // In tons

    public Truck(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        super(vehicleId, model, baseRentalRate, isAvailable);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        // Additional cost based on load capacity (e.g., $10 per ton per day)
        return (days * getBaseRentalRate()) + (days * loadCapacity * 10);
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public String toString() {
        return "Truck{" +
                "vehicleId='" + getVehicleId() + '\'' +
                ", model='" + getModel() + '\'' +
                ", baseRentalRate=" + getBaseRentalRate() +
                ", loadCapacity=" + loadCapacity +
                ", isAvailable=" + isAvailable() +
                '}';
    }
}
