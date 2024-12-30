package com.vehicle.rental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private List<RentalTransaction> rentalHistory;

    public Customer(String customerId, String name) {
        this.rentalHistory = new ArrayList<>();
    }

    public void addRental(RentalTransaction transaction) {
        rentalHistory.add(transaction);
    }

    public List<RentalTransaction> getRentalHistory() {
        return rentalHistory;
    }

    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
}
