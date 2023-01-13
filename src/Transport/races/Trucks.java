package Transport.races;

import Drivers.DraverCategoryD;
import Drivers.DriverCategoryC;
import Transport.Transport;

public class Trucks extends Transport<DriverCategoryC>  {
    private int allTime; // общее время до финиша



    public Trucks(String brand, String model, double engineCapacity, DriverCategoryC driver) {
        super(brand, model, engineCapacity, driver);
    }
    @Override
    public void startMoving() {
        System.out.println("Грузовик марки " + getBrand() + " начинает движение");
    }
    @Override
    public void finishMoving() {
        System.out.println("Грузовик марки " + getBrand() + " заканчивает движение");
    }


}
