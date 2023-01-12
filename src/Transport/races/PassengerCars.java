package Transport.races;

import Drivers.CategoryB;
import Transport.Transport;

import java.time.LocalTime;

public class PassengerCars extends Transport implements CategoryB {
    private int allTime; // общее время до финиша



    public PassengerCars(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public String getCategory() {
        return CategoryB.category;
    }
}
