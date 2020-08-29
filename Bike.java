public class Bike {
    private String id;
    private String color;
    private String brand;
    private double price;
    private String availability;

    public Bike(){

    }

    public Bike(String id, String color, String brand, double price, String availability) {
        this.id = id;
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.availability = availability;
    }

    public String getId()   {
        return id;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getAvailability() {
        return availability;
    }

    public void setId(String id)    {
        this.id = id;
    }

    public void setColor(String color)    {
        this.color = color;
    }

    public void setBrand(String brand)    {
        this.brand = brand;
    }

    public void setPrice(double price)    {
        this.price = price;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String toString() {
        return String.format("%s\t%s\t%s\t%.2f\t%s\n", id, color, brand, price, availability);
    }
}
