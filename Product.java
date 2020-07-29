public class Product{
    private String id;
    private String brand;
    private String bikeColor;
    private double pricePerHour;
    private String rentalStatus;
    private String description;

    public Product(String id, String brand, String bikeColor, double pricePerHour,
    String rentalStatus, String description){
        this.id = id;
        this.brand = brand;
        this.bikeColor = bikeColor;
        this.pricePerHour = pricePerHour;
        this.rentalStatus = rentalStatus;
        this.description = description;
    }

    public String getId(){
        return id;
    }

    public String getBrand(){
        return brand;
    }

    public String bikeColor(){
        return bikeColor;
    }

    public double getPricePerHour(){
        return pricePerHour;
    }

    public String getRentalStatus(){
        return rentalStatus;
    }

    public String getDescription(){
        return description;
    }


    
    public void setId(String id){
        this.id = id;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setBikeColor(String bikeColor){
        this.bikeColor = bikeColor;
    }

    public void setGetPricePerHour(double pricePerHour){
        this.pricePerHour = pricePerHour;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setRentalStatus(String rentalStatus) {
        this.rentalStatus = rentalStatus;
    }
    
    public String toString() {
        return String.format("Bike ID :%s\nBrand :%s\nColor :%s\nPrice Per Hour :%.2f\nRental Status :%s\nDescription :%s\n",
                            id, brand, bikeColor, pricePerHour, rentalStatus, description);
    }
}

