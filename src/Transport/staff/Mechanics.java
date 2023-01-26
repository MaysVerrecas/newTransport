package Transport.staff;

import Transport.Transport;
import Transport.exeption.InvalidTypeLicenseExeption;

import java.util.Objects;

public class Mechanics <T extends Transport> {

    private final String fullName;
    private String company;

    public Mechanics(String fullName, String company) {
        this.fullName = fullName;
        this.company = company;
    }

    public Mechanics(String fullName) {
        this(fullName, "Самозанятый");
    }

    public void performMaintenance(T t) throws InvalidTypeLicenseExeption {
        t.passDiagnostics();
    }
    public void fixTheCar(T t) {
        t.repair();
    }

    public String getFullName() {
        return fullName;
    }


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanics mechanics = (Mechanics) o;
        return Objects.equals(fullName, mechanics.fullName) && Objects.equals(company, mechanics.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, company);
    }

    @Override
    public String toString() {
        return "Mechanics{" +
                "fullName='" + fullName + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
