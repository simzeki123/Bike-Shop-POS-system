package bikeProduct;

public class Product{

    static void displayProduct(){
        BikeBase bikeBase = new BikeBase();
        System.out.println("List of the bikes: ");
        System.out.println("Bike_ID\tColor\tBrand\tPrice\tAvailability\n");
        
        for (int i = 0; i < bikeBase.getListOfBike().size(); i++) {
            System.out.println(bikeBase.getListOfBike().get(i));
        }
    }

    static void addProduct(){
        
    }

    static void editProduct(){

    }

    static void searchProduct(){

    }

    public static void main(String[] args) {
        displayProduct();
    }
}