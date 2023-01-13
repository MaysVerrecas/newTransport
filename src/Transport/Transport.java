package Transport;

import Drivers.Driver;
import Transport.races.Competing;

import java.util.Objects;

public abstract class Transport<T extends Driver> {
    private final String brand;
    private final String model;
    private final T driver;
    private double engineCapacity;

    private int allTime; // общее время до финиша

    public Transport(String brand, String model, double engineCapacity, T driver) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "Default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = brand;
        } else {
            this.model = model;
        }
        if (engineCapacity <= 0) {
            engineCapacity = 1.5;
        } else {
            this.engineCapacity = engineCapacity;
        }
        this.driver = driver;

    }

    public final String getBrand() {
        return brand;
    }

    public final String getModel() {
        return model;
    }

    public abstract void startMoving();
    public abstract void finishMoving();
    public abstract void printType();

    public T getDriver() {
        return driver;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        if (engineCapacity > 0) {
            this.engineCapacity = engineCapacity;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineCapacity, engineCapacity) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineCapacity);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
