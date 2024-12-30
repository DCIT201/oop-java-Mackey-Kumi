package com.vehicle.rental;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RentalAgencyTest {

    private RentalAgency rentalAgency;
    private Customer customer;
    private Vehicle car;
    private Vehicle motorcycle;

    @BeforeEach
    public void setUp() {
        rentalAgency = new RentalAgency();
        customer = new Customer("John Doe", "123-456-789");

        // Create mock vehicles (using subclasses directly)
        car = new Car("C001", "Toyota Corolla", 50, false, false);
        motorcycle = new Motorcycle("M001", "Yamaha R15", 20, false);

        // Add vehicles to the fleet
        rentalAgency.addVehicle(car);
        rentalAgency.addVehicle(motorcycle);
    }

    @Test
    public void testRentAvailableVehicle() {
        // Attempt to rent an available car
        rentalAgency.rentVehicle("C001", customer, 3);

        // Validate that the vehicle is marked unavailable
        assertFalse(car.isAvailable(), "Car should be marked as unavailable after being rented.");
    }

    @Test
    public void testRentUnavailableVehicle() {
        // Rent the car to make it unavailable
        rentalAgency.rentVehicle("C001", customer, 3);

        // Attempt to rent the car again
        rentalAgency.rentVehicle("C001", customer, 2);

        // Validate that the car remains unavailable
        assertFalse(car.isAvailable(), "Car should remain unavailable if already rented.");
    }

    @Test
    public void testRentNonexistentVehicle() {
        // Attempt to rent a vehicle not in the fleet
        rentalAgency.rentVehicle("X999", customer, 3);

    }

    @Test
    public void testUnimplementedReturnVehicle() {
        // Ensure calling returnVehicle throws an exception
        assertThrows(UnsupportedOperationException.class, () -> {
            rentalAgency.returnVehicle(car);
        });
    }
}
