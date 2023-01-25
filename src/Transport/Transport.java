package Transport;

import Transport.Drivers.Driver;
import Transport.Drivers.DriverCategoryB;
import Transport.exeption.InvalidTypeLicenseExeption;
import Transport.staff.Mechanics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public abstract class Transport<T extends Driver> {
    private final String brand;
    private final String model;
    private final T driver;
    private double engineCapacity;

    private int allTime; // общее время до финиша
    private List<Mechanics<?>> mechanicsTeam = new ArrayList<>();


    public Transport(String brand,
                     String model,
                     double engineCapacity,
                     T driver) {

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
        this.mechanicsTeam = mechanicsTeam;
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
    public abstract void passDiagnostics() throws InvalidTypeLicenseExeption;
    public abstract void repair();

    public T getDriver() {
        return driver;
    }

    public void addMechanics (Mechanics<?> ... mechanics) {
        mechanicsTeam.addAll(Arrays.asList(mechanics));
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        if (engineCapacity > 0) {
            this.engineCapacity = engineCapacity;
        }
    }

    public List<Mechanics<?>> getMechanicsTeam() {
        return mechanicsTeam;
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
