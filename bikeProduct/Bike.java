package bikeProduct;

public class Bike {
    private String id;
    Color color;
    Brand brand;
    Price price;
    Availability availability;

    public Bike(String id, Color color, Brand brand, Price price, Availability availability) {
        this.id = id;
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.availability = availability;
    }

    public String getId()   {
        return id;
    }

    public Color getColor() {
        return color;
    }

    public Brand getBrand() {
        return brand;
    }

    public Price getPrice() {
        return price;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    public String toString() {
        return String.format("%s\t%s\t%s\t%d\t%s\n", id, color, brand, price.getAmount(), availability);
    }
}
