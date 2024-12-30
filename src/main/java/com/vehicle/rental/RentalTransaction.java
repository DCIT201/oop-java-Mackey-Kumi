package com.vehicle.rental;

public class RentalTransaction {
    private Vehicle vehicle;
    private Customer customer;
    private int rentalDays;
    private double rentalCost;

    public RentalTransaction(Vehicle vehicle, Customer customer, int rentalDays, double rentalCost) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDays = rentalDays;
        this.rentalCost = rentalCost;
    }

    @Override
    public String toString() {
        return "RentalTransaction{" +
                "vehicle=" + vehicle.getModel() +
                ", customer=" + customer.getName() +
                ", rentalDays=" + rentalDays +
                ", rentalCost=" + rentalCost +
                '}';
    }
}
