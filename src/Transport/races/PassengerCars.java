package Transport.races;

import Transport.Drivers.Driver;
import Transport.Drivers.DriverCategoryB;
import Transport.Transport;
import Transport.exeption.InvalidTypeLicenseExeption;
import Transport.staff.Mechanics;

import java.util.List;

public class PassengerCars extends Transport<DriverCategoryB> implements Competing {
    public enum BodyType {
        SEDAN("Седан"), HATCHBACK("Хетчбек"), COUPE("Купе"), UNIVERSAL("Универсал"),
        SUV("Внедорожник"), CROSSOVER("Кроссовер"), PICKUP("Пикап"), VAN("Фургон"), MINIVAN("Минивэн");
        public final String title;
        BodyType(String title){
            this.title = title;
        }

        @Override
        public String toString() {
            return "Тип кузова: " +  title;
        }
    }
    private int allTime; // общее время до финиша
    private final BodyType bodyType;
    private String type;



    private final Driver.Category needCategory = Driver.Category.C;



    public PassengerCars(String brand,
                         String model,
                         double engineCapacity,
                         DriverCategoryB driver,
                         BodyType bodyType) {
        super(brand, model, engineCapacity, driver);
        this.bodyType = bodyType;
    }
    @Override
    public void startMoving() {
        System.out.println("Легковая машина марки " + getBrand() + " начинает движение");
    }
    @Override
    public void finishMoving() {
        System.out.println("Легковая машина марки " + getBrand() + " заканчивает движение");
    }
    @Override
    public void pitStop() {
        System.out.println("Проводим Пит-Стоп. Меняем стертые шины, проверяем безопастность");
        allTime += 120; //допустим 2 минуты занимает пит-стоп у легковой
    }

    @Override
    public void bestLapTime() {
        //сравниваем время всех кругов бла-бла-бла
        System.out.println("Лучшее время за круг - ..");
    }

    @Override
    public void maxSpeed() {
        //выводим максимальную зафиксированную срокость
        System.out.println("Максимальная скорость легкового автомобиля - ");
    }
    @Override
    public void printType() {
        if (getType() == null || getType().isBlank() || getType().isEmpty()) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип транспортного средства = " + getType());
            System.out.println(getBodyType().toString());
        }
    }

    @Override
    public void passDiagnostics() throws InvalidTypeLicenseExeption {
        if (getDriver().getCategory() != getNeedCategory()) {
            //без прав он не может быть - ограничина енамом и конструктором.
            throw new InvalidTypeLicenseExeption("Нет нужных прав.");
        } else {
            System.out.println("Легковой автомобиль успешно прошел техосмотр!");
        }
    }

    @Override
    public void repair() {
        System.out.println("Машина " + getBrand() + " " + getModel() + " починена :)");
    }

    public int getAllTime() {
        return allTime;
    }
    public BodyType getBodyType() {
        return bodyType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public Driver.Category getNeedCategory() {
        return needCategory;
    }
}
