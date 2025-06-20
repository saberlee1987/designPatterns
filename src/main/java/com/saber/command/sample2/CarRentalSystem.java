package com.saber.command.sample2;

import java.util.HashSet;
import java.util.Set;

public class CarRentalSystem {
    private final Set<String> availableCars;
    private final Set<String> rentCars;

    public CarRentalSystem() {
        this.availableCars = new HashSet<>();
        this.rentCars = new HashSet<>();
        prepareAvailableCars();
    }

    private void prepareAvailableCars() {
        availableCars.add(CarName.pride_131.getName());
        availableCars.add(CarName.pego_206.getName());
        availableCars.add(CarName.pego_207.getName());
        availableCars.add(CarName.dena_plus.getName());
        availableCars.add(CarName.soren_plus.getName());
        availableCars.add(CarName.benz_E.getName());
        availableCars.add(CarName.benz_C.getName());
        availableCars.add(CarName.bmw_x3.getName());
        availableCars.add(CarName.bmw_x4.getName());
        availableCars.add(CarName.bmw_x6.getName());

    }

    public void rentCar(CarName car) {
        if (availableCars.contains(car.getName())) {
            System.out.println("car " + car + " rent car ");
            availableCars.remove(car.getName());
            rentCars.add(car.getName());
        } else {
            System.out.println("sorry this car is not available");
        }
    }

    public void returnCar(CarName car) {
        if (rentCars.contains(car.getName())) {
            System.out.println("car " + car + " return car ");
            rentCars.remove(car.getName());
            availableCars.add(car.getName());
        } else {
            System.out.println("sorry this car before rent ");
        }
    }

    public void showAvailableCars() {
        for (String availableCar : availableCars) {
            System.out.println("car ===> " + availableCar);
        }
    }

    public void showRentCars() {
        for (String rentCar : rentCars) {
            System.out.println("car ===> " + rentCar);
        }
    }
}
