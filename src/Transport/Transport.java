package Transport;

import java.util.Objects;

public abstract class Transport {
    private final String BRAND;
    private final String MODEL;
    private final int YEAR_OF_REALISE;
    private final String COUNTRY;
    private String color;
    private int maxSpeed;

    public Transport(String BRAND, String MODEL, int YEAR_OF_REALISE, String COUNTRY, String color, int maxSpeed) {
        this.BRAND = BRAND;
        this.MODEL = MODEL;
        this.YEAR_OF_REALISE = YEAR_OF_REALISE;
        this.COUNTRY = COUNTRY;
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
        return BRAND;
    }

    public final String getMODEL() {
        return MODEL;
    }

    public final int getYEAR_OF_REALISE() {
        return YEAR_OF_REALISE;
    }

    public final String getCOUNTRY() {
        return COUNTRY;
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
        return YEAR_OF_REALISE == transport.YEAR_OF_REALISE && maxSpeed == transport.maxSpeed && Objects.equals(BRAND, transport.BRAND) && Objects.equals(MODEL, transport.MODEL) && Objects.equals(COUNTRY, transport.COUNTRY) && Objects.equals(color, transport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(BRAND, MODEL, YEAR_OF_REALISE, COUNTRY, color, maxSpeed);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "BRAND='" + BRAND + '\'' +
                ", MODEL='" + MODEL + '\'' +
                ", YEAR_OF_REALISE=" + YEAR_OF_REALISE +
                ", COUNTRY='" + COUNTRY + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
