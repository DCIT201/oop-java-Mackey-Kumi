package com.vehicle.rental;

public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        Vehicle car = new Car("C001", "Toyota Corolla", 50, true, true);
        Vehicle motorcycle = new Motorcycle("M001", "Yamaha R15", 30, true);
        Vehicle truck = new Truck("T001", "Ford F150", 80, true);

        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
        agency.addVehicle(truck);

        Customer customer = new Customer("CUS001", "John Doe");
        agency.rentVehicle("C001", customer, 3);
        agency.rentVehicle("M001", customer, 5);

        for (RentalTransaction transaction : customer.getRentalHistory()) {
            System.out.println(transaction);
        }
    }
}
