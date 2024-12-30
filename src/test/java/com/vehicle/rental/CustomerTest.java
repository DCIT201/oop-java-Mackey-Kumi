package com.vehicle.rental;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    private Customer customer;

    @BeforeEach
    public void setUp() {
        // Initialize a customer with mock data
        customer = new Customer("C001", "John Doe");
    }

    @Test
    public void testAddRental() {
        // Create a mock vehicle and rental transaction
        Vehicle car = new Car("V001", "Toyota Corolla", 50, false, false);
        RentalTransaction transaction = new RentalTransaction(car, customer, 3, 150);

        // Add the transaction to the rental history
        customer.addRental(transaction);

        // Validate that the rental history contains the transaction
        assertEquals(1, customer.getRentalHistory().size(), "Customer should have one rental in the history.");
        assertTrue(customer.getRentalHistory().contains(transaction), "Rental history should contain the added transaction.");
    }

    @Test
    public void testGetRentalHistory() {
        // Validate that the rental history is initially empty
        assertTrue(customer.getRentalHistory().isEmpty(), "Rental history should be empty initially.");

        // Create a mock vehicle and add a transaction
        Vehicle motorcycle = new Motorcycle("V002", "Yamaha R15", 20, false);
        RentalTransaction transaction = new RentalTransaction(motorcycle, customer, 5, 100);

        customer.addRental(transaction);

        // Validate the rental history contents
        assertEquals(1, customer.getRentalHistory().size(), "Rental history should contain one transaction.");
    }
}
