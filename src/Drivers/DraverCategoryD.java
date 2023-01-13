package Drivers;

public class DraverCategoryD extends Driver{
    public DraverCategoryD(String fullName, boolean drivingLicense, int experience) {
        super(fullName, drivingLicense, experience);
    }
    @Override
    public void startMove() {
        System.out.println("Водитель категории D " + getFullName() + " начинает движение");
    }


    @Override
    public void finishMove() {
        System.out.println("Водитель категории D " + getFullName() + " заканчивает движение");
    }

    @Override
    public void refill() {
        System.out.println("Водитель категории D " + getFullName() + " заправляется");
    }
}
