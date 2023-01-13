package Transport.races;

import Drivers.DriverCategoryC;
import Transport.Transport;

public class Trucks extends Transport<DriverCategoryC> implements Competing {
    public enum LoadCapacity{
        N1(null,3.5f), N2(3.51f,12f), N3(12.01f,null);
        public final Float downCapacity;
        public final Float upCapacity;

        LoadCapacity(Float downCapacity, Float upCapacity) {
            this.downCapacity = downCapacity;
            this.upCapacity = upCapacity;
        }

        @Override
        public String toString() {
            if (downCapacity == null) {
                return "Грузоподьемность: до " + upCapacity + " тонн.";
            } else if (upCapacity == null) {
                return "Грузоподьемность: от " + downCapacity + " тонн.";
            } else {
                return "Грузоподъемность: от " + downCapacity + " до " + upCapacity + " тонн.";
            }

        }
    }
    private int allTime; // общее время до финиша
    private final LoadCapacity loadCapacity;
    private String type;




    public Trucks(String brand, String model, double engineCapacity, DriverCategoryC driver, LoadCapacity loadCapacity) {
        super(brand, model, engineCapacity, driver);
        this.loadCapacity = loadCapacity;
    }
    @Override
    public void startMoving() {
        System.out.println("Грузовик марки " + getBrand() + " начинает движение");
    }
    @Override
    public void finishMoving() {
        System.out.println("Грузовик марки " + getBrand() + " заканчивает движение");
    }
    @Override
    public void pitStop() {
        System.out.println("Проводим Пит-Стоп. Меняем стертые шины, проверяем безопастность");
        allTime += 180; //допустим 3 минуты занимает пит-стоп
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
    @Override
    public void printType() {
        if (getType() == null || getType().isBlank() || getType().isEmpty()) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип транспортного средства = " + getType());
            System.out.println(getLoadCapacity().toString());
        }
    }

    public int getAllTime() {
        return allTime;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
