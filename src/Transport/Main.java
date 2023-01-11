package Transport;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "X6", 2022, "Russia", "black", 200);
        Car kia = new Car("Kia", "Sportage", 2018, "Korea", "Black", 300);
        System.out.println(bmw + "\n" + kia);
        System.out.println();
        Bus mers = new Bus("Mersedes", "KASHKALI", 2011, "Germany", "blue", 120);
        Bus vaz = new Bus("VAZ", "MARSHRUTKA", 1994, "Russia", "yellow", 85);
        Bus gaz = new Bus("GAZ", "EDETILADNO", 1988, "Russia", "white", 90);
        System.out.println(mers + "\n" + vaz + "\n" + gaz);
    }
}