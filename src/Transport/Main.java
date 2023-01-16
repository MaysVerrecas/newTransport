package Transport;

import Transport.Drivers.DraverCategoryD;
import Transport.Drivers.Driver;
import Transport.Drivers.DriverCategoryB;
import Transport.Drivers.DriverCategoryC;
import Transport.exeption.InvalidTypeLicenseExeption;
import Transport.races.Bus;
import Transport.races.PassengerCars;
import Transport.races.Trucks;

public class Main {
    public static void main(String[] args) {

//        for (int i = 1; i <= 4; i++) {
//            DriverCategoryB driverB = new DriverCategoryB(
//                    "Водитель категории B" + i,
//                    true,
//                    2
//            );
//
//            PassengerCars car = new PassengerCars(
//                    "Brand",
//                    "model",
//                    1.9,
//                    driverB
//            );
//
//            DraverCategoryD driverD = new DraverCategoryD(
//                    "Водитель категории D" + i,
//                    true,
//                    2
//            );
//
//            Bus bus = new Bus(
//                    "Brand",
//                    "model",
//                    1.2,
//                    driverD
//            );
//
//            DriverCategoryC driverC = new DriverCategoryC(
//                    "Водитель категории C" + i,
//                    true,
//                    2
//            );
//
//            Trucks truck = new Trucks(
//                    "Brand",
//                    "model",
//                    1.2,
//                    driverC
//            );
//
//            printInfo(car);
//            printInfo(bus);
//            printInfo(truck);
//
//        }

        DriverCategoryB b1 = new DriverCategoryB("HFJDD", true, 2, Driver.Category.B);
        PassengerCars car1 = new PassengerCars("Brand", "Model", 1.5, b1, PassengerCars.BodyType.SEDAN);
//        System.out.println(car1.getBodyType().toString());

        DriverCategoryC c1 = new DriverCategoryC("dfds", true, 6, Driver.Category.C);
        Trucks truck1 = new Trucks("Brand", "Model", 2.2, c1, Trucks.LoadCapacity.N2);
//        System.out.println(truck1.getLoadCapacity().toString());

        DraverCategoryD d1 = new DraverCategoryD("df", true, 4, Driver.Category.D);
        Bus bus1 = new Bus("fd", "f", 2.2, d1, Bus.Capacity.MEDIUM);
//        System.out.println(bus1.getCapacity().toString());


        //exeption lesson
        try {
            bus1.passDiagnostics(); //тут поймает грузовик не может участвовать в тех осмотре
            truck1.passDiagnostics(); //тут успешно пройдет диагностику
            car1.passDiagnostics(); // тут недостаточно прав(не тот тип)
        } catch (InvalidTypeLicenseExeption e) {
            System.out.println(e.getMessage());
        }catch(UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
    private static void printInfo(Transport<?> transport) {
        System.out.println("водитель " + transport.getDriver().getFullName() +
                " управляет автомобилем " + transport.getBrand() + " " +
                transport.getModel() + " и будет участвовать в заезде");
    }


}