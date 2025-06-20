package com.saber.command.sample2;

public class ReturnCarCommand implements CarCommand {

    private final CarRentalSystem carRentalSystem;
    private final CarName car;

    public ReturnCarCommand(CarRentalSystem carRentalSystem, CarName car) {
        this.carRentalSystem = carRentalSystem;
        this.car = car;
    }

    @Override
    public void execute() {
        carRentalSystem.returnCar(car);
    }
}
