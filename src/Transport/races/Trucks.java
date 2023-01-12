package Transport.races;

import Drivers.CategoryB;
import Drivers.CategoryC;
import Transport.Transport;

public class Trucks extends Transport implements CategoryC {
    private int allTime; // общее время до финиша



    public Trucks(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }


    @Override
    public String getCategory() {
        return CategoryC.category;
    }
}
