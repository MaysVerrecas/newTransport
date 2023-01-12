package Transport;

import Drivers.Driver;
import Transport.races.Bus;
import Transport.races.PassengerCars;
import Transport.races.Trucks;

public class Main {
    public static void main(String[] args) {
//        Car bmw = new Car("BMW", "X6", 2022, "Russia", "black", 200);
//        Car kia = new Car("Kia", "Sportage", 2018, "Korea", "Black", 300);
//        System.out.println(bmw + "\n" + kia);
//        System.out.println();
//        Bus mers = new Bus("Mersedes", "KASHKALI", 2011, "Germany", "blue", 120);
//        Bus vaz = new Bus("VAZ", "MARSHRUTKA", 1994, "Russia", "yellow", 85);
//        Bus gaz = new Bus("GAZ", "EDETILADNO", 1988, "Russia", "white", 90);
//        System.out.println(mers + "\n" + vaz + "\n" + gaz);


        Bus bus1 = new Bus("Mersedes", "Kardo", 1.9);
        Bus bus2 = new Bus("VAZ", "Marshrutka", 1.5);
        Bus bus3 = new Bus("GAZ", "Nur", 2.0);
        Bus bus4 = new Bus("BB", "Herso", 2.1);

        PassengerCars car1 = new PassengerCars("BMW", "X6", 3.0);
        PassengerCars car2 = new PassengerCars("Kia", "Sportage V|", 2.4);
        PassengerCars car3 = new PassengerCars("Mersedes", "Mersu", 2.4);
        PassengerCars car4 = new PassengerCars("Lada", "Kalina", 1.8);

        Trucks truck1 = new Trucks("Mersedes", "GD12", 4.0);
        Trucks truck2 = new Trucks("Mersedes", "F1", 2.9);
        Trucks truck3 = new Trucks("Kirkeg", "Neds x2", 3.5);
        Trucks truck4 = new Trucks("Kirkeg", "Wolf bers", 4.0);

        Driver misha = new Driver<PassengerCars>("Максим Игорьевич Потемкин", "B", 20);
        Driver misha2 = new Driver<PassengerCars>("Максим Игорьевич Потемкин", "C", 20);
        misha.startMoving(car2);
        misha2.startMoving(car4); //  Водитель не может начать движение на машине, нет прав.

    }
}