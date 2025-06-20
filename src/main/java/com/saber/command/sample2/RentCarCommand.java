package com.saber.command.sample2;

public class RentCarCommand implements CarCommand {

    private final CarRentalSystem carRentalSystem;
    private final CarName car;

    public RentCarCommand(CarRentalSystem carRentalSystem, CarName car) {
        this.carRentalSystem = carRentalSystem;
        this.car = car;
    }

    @Override
    public void execute() {
        carRentalSystem.rentCar(car);
    }
}
