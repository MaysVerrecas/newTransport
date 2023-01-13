package Drivers;

public class DriverCategoryC extends Driver
{
    public DriverCategoryC(String fullName, boolean drivingLicense, int experience) {
        super(fullName, drivingLicense, experience);
    }
    @Override
    public void startMove() {
        System.out.println("Водитель категории С " + getFullName() + " начинает движение");
    }


    @Override
    public void finishMove() {
        System.out.println("Водитель категории С " + getFullName() + " заканчивает движение");
    }

    @Override
    public void refill() {
        System.out.println("Водитель категории С " + getFullName() + " заправляется");
    }
}
