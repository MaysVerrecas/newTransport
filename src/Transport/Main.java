package Transport;

import Drivers.DraverCategoryD;
import Drivers.Driver;
import Drivers.DriverCategoryB;
import Drivers.DriverCategoryC;
import Transport.races.Bus;
import Transport.races.PassengerCars;
import Transport.races.Trucks;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            DriverCategoryB driverB = new DriverCategoryB(
                    "Водитель категории B" + i,
                    true,
                    2
            );

            PassengerCars car = new PassengerCars(
                    "Brand",
                    "model",
                    1.9,
                    driverB
            );

            DraverCategoryD driverD = new DraverCategoryD(
                    "Водитель категории D" + i,
                    true,
                    2
            );

            Bus bus = new Bus(
                    "Brand",
                    "model",
                    1.2,
                    driverD
            );

            DriverCategoryC driverC = new DriverCategoryC(
                    "Водитель категории C" + i,
                    true,
                    2
            );

            Trucks truck = new Trucks(
                    "Brand",
                    "model",
                    1.2,
                    driverC
            );

            printInfo(car);
            printInfo(bus);
            printInfo(truck);

        }

    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("водитель " + transport.getDriver().getFullName() +
                " управляет автомобилем " + transport.getBrand() + " " +
                transport.getModel() + " и будет участвовать в заезде");
    }
}