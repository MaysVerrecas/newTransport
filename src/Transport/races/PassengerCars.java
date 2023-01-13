package Transport.races;

import Drivers.DriverCategoryB;
import Transport.Transport;

public class PassengerCars extends Transport<DriverCategoryB> {
    private int allTime; // общее время до финиша



    public PassengerCars(String brand, String model, double engineCapacity, DriverCategoryB driver) {
        super(brand, model, engineCapacity, driver);
    }

}
