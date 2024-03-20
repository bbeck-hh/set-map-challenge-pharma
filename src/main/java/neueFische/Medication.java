package neueFische;


import java.util.Objects;

public class Medication {
    private String name;
    private double price;
    private boolean availability;

    // Konstruktor
    public Medication(String name, double price, boolean availability) {
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    // Getter-Methode für den Namen
    public String getName() {
        return name;
    }

    // Getter-Methode für den Preis
    public double getPrice() {
        return price;
    }

    // Getter-Methode für die Verfügbarkeit
    public boolean getAvailability() {
        return availability;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", availability=" + availability +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medication that = (Medication) o;
        return Double.compare(that.price, price) == 0 &&
                availability == that.availability &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, availability);
    }
}