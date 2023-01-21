package Transport;

import Transport.Drivers.DraverCategoryD;
import Transport.Drivers.Driver;
import Transport.Drivers.DriverCategoryB;
import Transport.Drivers.DriverCategoryC;
import Transport.races.Bus;
import Transport.races.PassengerCars;
import Transport.races.Trucks;
import Transport.staff.Mechanics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Механики
        Mechanics<Transport> m1 = new Mechanics<Transport>("Михаил", "Gog");
        Mechanics<Transport> m2 = new Mechanics<Transport>("Mаксим");
        Mechanics<Transport> m3 = new Mechanics<Transport>("Майкл", "HHH");
        Mechanics<Transport> m4 = new Mechanics<Transport>("Марина");

        // водители
        DriverCategoryB misha = new DriverCategoryB("Mikhail", true, 2, Driver.Category.B);
        DriverCategoryB kostya = new DriverCategoryB("Kostyan", true, 2, Driver.Category.B);
        DriverCategoryB ivan = new DriverCategoryB("Ivan", true, 2, Driver.Category.B);
        DriverCategoryB dd = new DriverCategoryB("Drake", true, 2, Driver.Category.B);

        DriverCategoryC jj = new DriverCategoryC("Cerg", true, 1, Driver.Category.C);
        DriverCategoryC aven = new DriverCategoryC("Aven", true, 1, Driver.Category.C);
        DriverCategoryC gor = new DriverCategoryC("Gorge", true, 1, Driver.Category.C);
        DriverCategoryC tom = new DriverCategoryC("Tom V", true, 1, Driver.Category.C);

        DraverCategoryD hh = new DraverCategoryD("Kuhh", true, 4, Driver.Category.D);
        DraverCategoryD herhh = new DraverCategoryD("Herr", true, 4, Driver.Category.D);
        DraverCategoryD yann = new DraverCategoryD("Yan Ver", true, 4, Driver.Category.D);
        DraverCategoryD rosty = new DraverCategoryD("Rosty", true, 4, Driver.Category.D);

        // машины
        PassengerCars c1 = new PassengerCars("C1", "model", 1.5, misha, PassengerCars.BodyType.SEDAN);
        c1.addMechanics(m1,m4);
        PassengerCars c2 = new PassengerCars("C2", "model", 1.5, kostya, PassengerCars.BodyType.SEDAN);
        c2.addMechanics(m2);
        PassengerCars c3 = new PassengerCars("C3", "model", 1.5, ivan, PassengerCars.BodyType.SEDAN);
        c3.addMechanics(m3, m2);
        PassengerCars c4 = new PassengerCars("C3", "model", 1.5, dd, PassengerCars.BodyType.SEDAN);
        c4.addMechanics(m1, m4);

        Trucks t1 = new Trucks("T1", "model", 1.9, jj, Trucks.LoadCapacity.N2);
        t1.addMechanics(m1,m2,m3);
        Trucks t2 = new Trucks("T2", "model", 1.9, aven, Trucks.LoadCapacity.N2);
        t2.addMechanics(m2);
        Trucks t3 = new Trucks("T3", "model", 1.9, gor, Trucks.LoadCapacity.N2);
        t3.addMechanics(m4,m2);
        Trucks t4 = new Trucks("T4", "model", 1.9, tom, Trucks.LoadCapacity.N2);
        t4.addMechanics(m1,m3);

        Bus b1 = new Bus("B1", "model", 2.0, hh, Bus.Capacity.MEDIUM);
        b1.addMechanics(m1,m2,m4);
        Bus b2 = new Bus("B2", "model", 2.0, herhh, Bus.Capacity.MEDIUM);
        b2.addMechanics(m4);
        Bus b3 = new Bus("B3", "model", 2.0, yann, Bus.Capacity.MEDIUM);
        b3.addMechanics(m1);
        Bus b4 = new Bus("B4", "model", 2.0, rosty, Bus.Capacity.MEDIUM);
        b4.addMechanics(m3);

        List<Transport> carRaces = List.of(c1, c2, c3, c4, t1, t2, t3, t4, b1, b2, b3, b4);

        List<Driver> driverRaces = new ArrayList<>();
        for (Transport car : carRaces) {
            driverRaces.add(car.getDriver());
        }
        printMechanicsInfo(carRaces);
    }
    private static void printInfo(Transport<?> transport) {
        System.out.println("водитель " + transport.getDriver().getFullName() +
                " управляет автомобилем " + transport.getBrand() + " " +
                transport.getModel() + " и будет участвовать в заезде");
    }

    private static void printAllInfo(List<Transport> carRaces) {
        for (Transport car : carRaces) {
            System.out.println("водитель " + car.getDriver().getFullName() +
                    " управляет автомобилем " + car.getBrand() + " " +
                    car.getModel() + " и будет участвовать в заезде");
        }
    }
    private static void printMechanicsInfo(Transport car) {
        System.out.println("Зв рулем автомобиля " + car.getBrand() + " " + car.getModel() +
                " водитель " + car.getDriver().getFullName() + ".  Команда механников авто : " + car.getMechanicsTeam().toString());
    }

    private static void printMechanicsInfo(List<Transport> carRaces) {
        for (Transport car : carRaces) {
            System.out.println("Зв рулем автомобиля " + car.getBrand() + " " + car.getModel() +
                    " водитель " + car.getDriver().getFullName() + ".  Команда механников авто : " + car.getMechanicsTeam().toString());
        }
    }



}