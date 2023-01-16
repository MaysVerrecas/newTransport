package Drivers;

import Transport.Transport;

import java.util.Objects;

public abstract class Driver{

    private final String fullName;
    private  boolean drivingLicense; // категория прав
    private int experience; //опыт водительский


    public Driver(String fullName, boolean drivingLicense, int experience) {
        this.fullName = fullName;
        this.drivingLicense = drivingLicense;
        this.experience = experience;
    }

    public abstract void startMove();
    public abstract void finishMove();
    public abstract void refill();

    public String getFullName() {
        return fullName;
    }

    public boolean isDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(boolean drivingLicense) {
        this.drivingLicense = drivingLicense;
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
