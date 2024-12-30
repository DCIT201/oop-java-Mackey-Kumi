package com.vehicle.rental;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    void testCarRentalCostWithAirConditioning() {
        Vehicle car = new Car("CAR001", "Honda Civic", 50, true, true);
        double cost = car.calculateRentalCost(3); // 50 * 3 + 15 for AC
        assertEquals(165.0, cost, 0.01);
    }

    @Test
    void testMotorcycleRentalCost() {
        Vehicle motorcycle = new Motorcycle("MOTO001", "Yamaha MT-15", 30, true);
        double cost = motorcycle.calculateRentalCost(2); // 30 * 2
        assertEquals(60.0, cost, 0.01);
    }

    @Test
    void testTruckRentalCost() {
        Vehicle truck = new Truck("TRUCK001", "Ford F-150", 100, true); // 2.5 tons
        double cost = truck.calculateRentalCost(5); // (100 * 4) + (2.5 * 10 * 4)
        assertEquals(500.0, cost, 0.01);
    }
}
