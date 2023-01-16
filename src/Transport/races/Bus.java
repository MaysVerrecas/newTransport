package Transport.races;

import Drivers.DraverCategoryD;
import Transport.Transport;

public class Bus extends Transport<DraverCategoryD> implements Competing{
    public enum Capacity{
        ESPECIALLY_SMALL(null,10), SMALL(11,25),
        MEDIUM(40,50), BIG(60, 80),
        ESPECIALLY_BIG(100,120);

        public final Integer downCapacity;
        public final Integer upCapacity;

        Capacity(Integer downCapacity, Integer upCapacity) {
            this.downCapacity = downCapacity;
            this.upCapacity = upCapacity;
        }
//        "Вместимость: <нижняя граница> - <верхняя граница> мест".

        @Override
        public String toString() {
            if (downCapacity == null) {
                return "Вместимость: до " + upCapacity + " мест";
            } else {
                return "Вместимость: " + downCapacity + " - " + upCapacity + " мест";
            }
        }
    }
    private int allTime;
    private final Capacity capacity;
    private String type;



    public Bus(String brand, String model, double engineCapacity, DraverCategoryD driver, Capacity capacity) {
        super(brand, model, engineCapacity,driver);
        this.capacity = capacity;
    }
    @Override
    public void startMoving() {
        System.out.println("Автобус марки " + getBrand() + " начинает движение");
    }
    @Override
    public void finishMoving() {
        System.out.println("Автобус марки " + getBrand() + " заканчивает движение");
    }

    @Override
    public void printType() {
        if (getType() == null || getType().isBlank() || getType().isEmpty()) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип транспортного средства = " + getType());
            System.out.println(getCapacity().toString());
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Проводим Пит-Стоп. Меняем стертые шины, проверяем безопастность");
        allTime += 210; //допустим 3.5 минуты занимает пит-стоп
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

    public Capacity getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
