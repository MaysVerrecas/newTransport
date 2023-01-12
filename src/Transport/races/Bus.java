package Transport.races;

import Drivers.CategoryB;
import Drivers.CategoryD;
import Transport.Transport;

public class Bus extends Transport implements CategoryD {



    public Bus(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public String getCategory() {
        return CategoryD.category;
    }


//    public Bus(String brand, String model, int yearOfRealise, String country, String color, int maxSpeed) {
//        super(brand, model, yearOfRealise, country, color, maxSpeed);
//    }

}
