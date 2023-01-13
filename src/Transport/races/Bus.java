package Transport.races;

import Drivers.DraverCategoryD;
import Drivers.DriverCategoryC;
import Transport.Transport;

public class Bus extends Transport<DraverCategoryD> {



    public Bus(String brand, String model, double engineCapacity, DraverCategoryD driver) {
        super(brand, model, engineCapacity,driver);
    }
    @Override
    public void startMoving() {
        System.out.println("Автобус марки " + getBrand() + " начинает движение");
    }
    @Override
    public void finishMoving() {
        System.out.println("Автобус марки " + getBrand() + " заканчивает движение");
    }





}
