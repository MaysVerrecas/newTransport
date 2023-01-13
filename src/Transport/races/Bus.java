package Transport.races;

import Drivers.DraverCategoryD;
import Drivers.DriverCategoryC;
import Transport.Transport;

public class Bus extends Transport<DraverCategoryD> {



    public Bus(String brand, String model, double engineCapacity, DraverCategoryD driver) {
        super(brand, model, engineCapacity,driver);
    }



//    public Bus(String brand, String model, int yearOfRealise, String country, String color, int maxSpeed) {
//        super(brand, model, yearOfRealise, country, color, maxSpeed);
//    }

}
