package Transport.Drivers;

public class DriverCategoryC extends Driver
{
    private final String category = "C";
    public DriverCategoryC(String fullName, boolean drivingLicense, int experience, Category category) {
        super(fullName, drivingLicense, experience, category);
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
