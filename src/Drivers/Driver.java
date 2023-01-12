package Drivers;

import Transport.Transport;

import java.util.Objects;

public class Driver <A extends Transport>{

    private final String fullName;
    private final String drivingLicense; // категория прав
    private int experience; //опыт водительский
    private A car; // Машина на которой этот черт поедет


    public Driver(String fullName, String drivingLicense, int experience) {
        this.fullName = fullName;
        this.drivingLicense = drivingLicense;
        this.experience = experience;
    }

    public void startMoving(A car) {
        if (car.getCategory().equals(drivingLicense)) {
            System.out.println("Водитель " + getFullName());
            System.out.println("Начинает движение на машине : " + car.getBrand() + " " + car.getModel());
        } else {
            System.out.println("Водитель не может начать движение на машине, нет прав необходимой катерории.");
        }

    }
    public void stopMoving() {
        if (car.getCategory().equals(drivingLicense)) {
            System.out.println("Водитель " + getFullName());
            System.out.println("Останавливает машину : " + car.getBrand() + " " + car.getModel());
        } else {
            System.out.println("Нет прав необходимой катерории.");
        }

    }
    public void refuelCar() {
        if (car.getCategory().equals(drivingLicense)) {
            System.out.println("Водитель " + getFullName());
            System.out.println("Заправляет машину : " + car.getBrand() + " " + car.getModel());
        } else {
            System.out.println("Заправить он её конечно может, но никуда на ней не поедет, нет прав необходимой категории.");
        }

    }

    public String getFullName() {
        return fullName;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }


    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return experience == driver.experience && Objects.equals(fullName, driver.fullName) && Objects.equals(drivingLicense, driver.drivingLicense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, drivingLicense, experience);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", drivingLicense='" + drivingLicense + '\'' +
                ", Experience=" + experience +
                '}';
    }
}
