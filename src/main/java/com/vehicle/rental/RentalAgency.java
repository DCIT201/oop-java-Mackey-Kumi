package com.vehicle.rental;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet;

    public RentalAgency() {
        fleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void rentVehicle(String vehicleId, Customer customer, int days) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailable()) {
                double cost = vehicle.calculateRentalCost(days);
                vehicle.setAvailable(false);
                RentalTransaction transaction = new RentalTransaction(vehicle, customer, days, cost);
                customer.addRental(transaction);
                System.out.println("Vehicle rented successfully!");
                return;
            }
        }
        System.out.println("Vehicle not available.");
    }

    public void returnVehicle(Vehicle rentedVehicle) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnVehicle'");
    }

    public List<Vehicle> getFleet() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFleet'");
    }
}
