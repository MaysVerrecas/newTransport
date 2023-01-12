package Transport;

import Transport.races.Competing;

import java.util.Objects;

public abstract class Transport  implements Competing {
    private final String brand;
    private final String model;
//    private final int yearOfRealise;
//    private final String country;
//    private String color;
//    private int maxSpeed;
    private double engineCapacity;

    private int allTime; // общее время до финиша

    public Transport(String brand, String model, double engineCapacity) {
        this.brand = brand;
        this.model = model;
        if (engineCapacity <= 0) {
            engineCapacity = 1.5;
        } else {
            this.engineCapacity = engineCapacity;
        }

    }

    @Override
    public void pitStop() {
        System.out.println("Проводим Пит-Стоп. Меняем стертые шины, проверяем безопастность");
        allTime += 120; //допустим 2 минуты занимает пит-стоп
    }

    @Override
    public void bestLapTime() {
        //сравниваем время всех кругов бла-бла-бла
        System.out.println("Лучшее время за круг - ..");
    }

    @Override
    public void maxSpeed() {
        //выводим максимальную зафиксированную срокость
        System.out.println("Максимальная скорость - ");
    }
    public int getAllTime() {
        return allTime;
    }

//     public Transport(String brand, String model, int yearOfRealise, String country, String color, int maxSpeed) {
//        this.brand = brand;
//        this.model = model;
//        this.yearOfRealise = yearOfRealise;
//        this.country = country;
//        if (!color.isEmpty() && !color.isBlank() && color != null) {
//            this.color = color;
//        } else {
//            color = "white";
//        }
//        if (maxSpeed >= 0) {
//            this.maxSpeed = maxSpeed;
//        } else {
//            maxSpeed = 0;
//        }
//
//    }

    public final String getBrand() {
        return brand;
    }

    public final String getModel() {
        return model;
    }

//    public final int getYearOfRealise() {
//        return yearOfRealise;
//    }
//
//    public final String getCountry() {
//        return country;
//    }

//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public int getMaxSpeed() {
//        return maxSpeed;
//    }
//
//    public void setMaxSpeed(int maxSpeed) {
//        this.maxSpeed = maxSpeed;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Transport transport = (Transport) o;
//        return yearOfRealise == transport.yearOfRealise && maxSpeed == transport.maxSpeed && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(country, transport.country) && Objects.equals(color, transport.color);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(brand, model, yearOfRealise, country, color, maxSpeed);
//    }

//    @Override
//    public String toString() {
//        return "Transport{" +
//                "BRAND='" + brand + '\'' +
//                ", MODEL='" + model + '\'' +
//                ", YEAR_OF_REALISE=" + yearOfRealise +
//                ", COUNTRY='" + country + '\'' +
//                ", color='" + color + '\'' +
//                ", maxSpeed=" + maxSpeed +
//                '}';
//    }
    public void startMoving() {

    }
    public void finishMoving() {

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
    public abstract String getCategory();
}
