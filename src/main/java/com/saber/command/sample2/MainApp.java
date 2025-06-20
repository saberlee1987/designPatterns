package com.saber.command.sample2;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("sample 2 command.....");
        CarRentalSystem carRentalSystem = new CarRentalSystem();
        carRentalSystem.showAvailableCars();
        carRentalSystem.showRentCars();
        Customer saber = new Customer();
        saber.returnCar(new RentCarCommand(carRentalSystem,CarName.pride_131));
        saber.returnCar(new RentCarCommand(carRentalSystem,CarName.pego_207));
        saber.returnCar(new RentCarCommand(carRentalSystem,CarName.pego_206));
        saber.returnCar(new ReturnCarCommand(carRentalSystem,CarName.pego_207));
        saber.returnCar(new ReturnCarCommand(carRentalSystem,CarName.pride_131));
        saber.returnCar(new RentCarCommand(carRentalSystem,CarName.bmw_x3));
        saber.returnCar(new RentCarCommand(carRentalSystem,CarName.bmw_x6));
        saber.returnCar(new RentCarCommand(carRentalSystem,CarName.bmw_x4));

        saber.processCommands();


    }
}
