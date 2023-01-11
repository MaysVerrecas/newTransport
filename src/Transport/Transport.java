package Transport;

import java.util.Objects;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int yearOfRealise;
    private final String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int yearOfRealise, String country, String color, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.yearOfRealise = yearOfRealise;
        this.country = country;
        if (!color.isEmpty() || !color.isBlank()) {
            this.color = color;
        } else {
            color = "white";
        }
        if (maxSpeed >= 0) {
            this.maxSpeed = maxSpeed;
        } else {
            maxSpeed = 0;
        }

    }

    public final String getBRAND() {
        return brand;
    }

    public final String getMODEL() {
        return model;
    }

    public final int getYEAR_OF_REALISE() {
        return yearOfRealise;
    }

    public final String getCOUNTRY() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return yearOfRealise == transport.yearOfRealise && maxSpeed == transport.maxSpeed && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(country, transport.country) && Objects.equals(color, transport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfRealise, country, color, maxSpeed);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "BRAND='" + brand + '\'' +
                ", MODEL='" + model + '\'' +
                ", YEAR_OF_REALISE=" + yearOfRealise +
                ", COUNTRY='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
