package Transport.Drivers;

public class DriverCategoryB extends Driver{

    public DriverCategoryB(String fullName, boolean drivingLicense, int experience, Category category) {
        super(fullName, drivingLicense, experience, category);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории В " + getFullName() + " начинает движение");
    }


    @Override
    public void finishMove() {
        System.out.println("Водитель категории В " + getFullName() + " заканчивает движение");
    }

    @Override
    public void refill() {
        System.out.println("Водитель категории В " + getFullName() + " заправляется");
    }

}
