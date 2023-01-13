package Transport.races;

import Drivers.DraverCategoryD;
import Drivers.DriverCategoryC;
import Transport.Transport;

public class Trucks extends Transport<DriverCategoryC>  {
    private int allTime; // общее время до финиша



    public Trucks(String brand, String model, double engineCapacity, DriverCategoryC driver) {
        super(brand, model, engineCapacity, driver);
    }


}
