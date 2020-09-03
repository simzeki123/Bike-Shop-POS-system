import java.util.Scanner;

public class Bike {
    private String id;
    private String color;
    private String brand;
    private double price;
    private String availability;
    private char ctn;
    private char cfrm;
    private int choice;

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

    public char getCtn()    {
        return ctn;
    }

    public char getCfrm()   {
        return cfrm;
    }

    public int getChoice()  {
        return choice;
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

    public void setCtn(char ctn)    {
        this.ctn = ctn;
    }

    public void setCfrm(char cfrm)  {
        this.cfrm = cfrm;
    }

    public void setChoice(int choice)   {
        this.choice = choice;
    }

    public String toString() {
        return String.format("%s\t%s\t%s\t%.2f\t%s\n", id, color, brand, price, availability);
    }

    public static void displayProduct(){
       
        BikeBase bikeBase = new BikeBase();
        System.out.print("+=============================+\n");
        System.out.print("|     Display All Product     |\n");
        System.out.print("+=============================+\n");
        System.out.println("List of the bikes: ");
        System.out.println("No.\tBike_ID\tColor\tBrand\tPrice\tAvailability\n");

        for (int i = 0; i < bikeBase.getListOfBike().size(); i++) {
            System.out.println((i + 1) + "\t" + bikeBase.getListOfBike().get(i));
        }
    }

    public static void addProduct(){
        Scanner input = new Scanner(System.in);
        BikeBase addBike = new BikeBase();
        Bike[] bikeBase = new Bike[20];
        Bike bike = new Bike();
        int count = 0;
        
        System.out.print("+=====================+\n");
        System.out.print("|     Add Product     |\n");
        System.out.print("+=====================+\n");

        for (int i = 0; i < addBike.getListOfBike().size(); i++) {
            bikeBase[i] = addBike.listOfBike.get(i);
            count++;
        }

        do{            
            System.out.print("Please Enter the bike ID (Axxxx): ");
            bike.setId(input.nextLine());
            for (int i = 0; i < addBike.getListOfBike().size(); i++) {
                while(bike.getId().length() != 5 || bike.getId().charAt(0) != 'A' || !Character.isDigit(bike.getId().charAt(1))
                || !Character.isDigit(bike.getId().charAt(2)) || !Character.isDigit(bike.getId().charAt(3))
                || !Character.isDigit(bike.getId().charAt(4)) || bike.getId().contains(bikeBase[i].getId())){
                    System.out.print("Invalid Input, please try again!!\n");
                    System.out.print("Please Enter the bike ID (Axxxx): ");
                    bike.setId(input.nextLine());
                }
            }

            System.out.print("[SCOTT, BMC, TREK, GIANT, FELT]\n");
            System.out.print("Please Enter one of the bike brand : ");
            bike.setBrand(input.nextLine());
            while(!bike.getBrand().toUpperCase().equals("SCOTT") && !bike.getBrand().toUpperCase().equals("BMC")
            && !bike.getBrand().toUpperCase().equals("TREK") && !bike.getBrand().toUpperCase().equals("GIANT")
            && !bike.getBrand().toUpperCase().equals("FELT")){
                System.out.print("Invalid Input, please try again!!\n");
                System.out.print("[SCOTT, BMC, TREK, GIANT, FELT]\n");
                System.out.print("Please Enter one of the bike brand : ");
                bike.setBrand(input.nextLine());
            }
            
            System.out.print("[BLUE, RED, BLACK]\n");
            System.out.print("Please Enter one of the bike color : ");
            bike.setColor(input.nextLine());
            while(!bike.getColor().toUpperCase().equals("BLUE") && !bike.getColor().toUpperCase().equals("RED")
            && !bike.getColor().toUpperCase().equals("BLACK")){ 
                System.out.print("Invalid Input, please try again!!\n");
                System.out.print("[BLUE, RED, BLACK]\n");
                System.out.print("Please Enter one of the bike color : ");
                bike.setColor(input.nextLine());
            }

            if(bike.getBrand().toUpperCase().equals("BMC")){
                bike.setPrice(25.00);
            }
            else if(bike.getBrand().toUpperCase().equals("SCOTT")){
                bike.setPrice(15.00);
            }
            else if(bike.getBrand().toUpperCase().equals("GIANT")){
                bike.setPrice(10.00);
            }
            else if(bike.getBrand().toUpperCase().equals("TREK")){
                bike.setPrice(20.00);
            }
            else
                bike.setPrice(30.00);

            bike.setAvailability("FREE");

            System.out.print("Confirm to add this product? (Y/N): ");
            bike.setCfrm(input.nextLine().charAt(0));
            while (Character.toUpperCase(bike.getCfrm()) != 'Y' && Character.toUpperCase(bike.getCfrm()) != 'N'){
                System.out.print("Invalid input, please try again.");
                System.out.print("Confirm to add this product? (Y/N): ");
                bike.setCfrm(input.nextLine().charAt(0));
            }

            if(Character.toUpperCase(bike.getCfrm()) == 'Y'){
                bikeBase[count] = new Bike(bike.getId(), bike.getColor().toUpperCase(), bike.getBrand().toUpperCase(), bike.getPrice(), bike.getAvailability());
                addBike.listOfBike.add(bikeBase[count]);
            }
            
            System.out.print("Continue to add more product? (Y/N): ");
            bike.setCtn(input.nextLine().charAt(0));
            while (Character.toUpperCase(bike.getCtn()) != 'Y' && Character.toUpperCase(bike.getCtn()) != 'N') {
                System.out.print("Invalid input, please try again.");
                System.out.print("Continue to add another product? (Y/N): ");
                bike.setCtn(input.nextLine().charAt(0));
            }
        }while (Character.toUpperCase(bike.getCtn()) == 'Y');

        System.out.println("List of the bikes: ");
        System.out.println("No.\tBike_ID\tColor\tBrand\tPrice\tAvailability\n");
        for (int i = 0; i < addBike.getListOfBike().size(); i++) {
            System.out.println((i + 1) + "\t" + addBike.getListOfBike().get(i));
        }
    
    }

    public static void editProduct(){
        Scanner input = new Scanner(System.in);
        BikeBase editBike = new BikeBase();
        Bike[] bikeBase = new Bike[20];
        Bike bike = new Bike();
        int choice;

        for (int i = 0; i < editBike.getListOfBike().size(); i++) {
            bikeBase[i] = editBike.listOfBike.get(i);
        }

        System.out.print("+======================+\n");
        System.out.print("|     Edit Product     |\n");
        System.out.print("+======================+\n");

        do{
            System.out.println("\nList of the bikes: ");
            System.out.println("No.\tBike_ID\tColor\tBrand\tPrice\tAvailability\n");

            for (int i = 0; i < editBike.getListOfBike().size(); i++) {
                System.out.println((i + 1) + "\t" + editBike.getListOfBike().get(i));
            }

            System.out.print("Please enter ther record you want to modify: ");
            choice = input.nextInt();
            System.out.println("Bike_ID\tColor\tBrand\tPrice\tAvailability");
            System.out.print(editBike.getListOfBike().get(choice-1));
            input.nextLine();

            System.out.print("Please enter the new bike ID: ");
            bike.setId(input.nextLine());
            for (int i = 0; i < editBike.getListOfBike().size(); i++) {
                while(bike.getId().length() != 5 || bike.getId().charAt(0) != 'A' || !Character.isDigit(bike.getId().charAt(1))
                    || !Character.isDigit(bike.getId().charAt(2)) || !Character.isDigit(bike.getId().charAt(3))
                    || !Character.isDigit(bike.getId().charAt(4)) || bike.getId().contains(bikeBase[i].getId())){
                        System.out.print("Invalid Input, please try again!!\n");
                        System.out.print("Please Enter the bike ID (Axxxx): ");
                        bike.setId(input.nextLine());
                }
            }

            System.out.print("[BLUE, RED, BLACK]\n");
            System.out.print("Please enter the new bike color: ");
            bike.setColor(input.nextLine());
            while(!bike.getColor().toUpperCase().equals("BLUE") && !bike.getColor().toUpperCase().equals("RED")
                && !bike.getColor().toUpperCase().equals("BLACK")){ 
                    System.out.print("Invalid Input, please try again!!\n");
                    System.out.print("[BLUE, RED, BLACK]\n");
                    System.out.print("Please Enter one of the bike color : ");
                    bike.setColor(input.nextLine());
                }
            
            System.out.print("[SCOTT, BMC, TREK, GIANT, FELT]\n");
            System.out.print("Please enter the new bike brand: ");
            bike.setBrand(input.nextLine());
            while(!bike.getBrand().toUpperCase().equals("SCOTT") && !bike.getBrand().toUpperCase().equals("BMC")
                && !bike.getBrand().toUpperCase().equals("TREK") && !bike.getBrand().toUpperCase().equals("GIANT")
                && !bike.getBrand().toUpperCase().equals("FELT")){
                    System.out.print("Invalid Input, please try again!!\n");
                    System.out.print("[SCOTT, BMC, TREK, GIANT, FELT]\n");
                    System.out.print("Please Enter one of the bike brand : ");
                    bike.setBrand(input.nextLine());
                }

            if(bike.getBrand().toUpperCase().equals("BMC")){
                bike.setPrice(25.00);
            }
            else if(bike.getBrand().toUpperCase().equals("SCOTT")){
                bike.setPrice(15.00);
            }
            else if(bike.getBrand().toUpperCase().equals("GIANT")){
                bike.setPrice(10.00);
            }
            else if(bike.getBrand().toUpperCase().equals("TREK")){
                bike.setPrice(20.00);
            }
            else
                bike.setPrice(30.00);

            System.out.print("Please enter the new bike availability: ");
            bike.setAvailability(input.nextLine());
            while(!bike.getAvailability().toUpperCase().equals("FREE") &&
            !bike.getAvailability().toUpperCase().equals("BOOKED")){
                System.out.print("Invalid Input, please try again!!\n");
                System.out.print("Please enter the new bike availability: ");
                bike.setAvailability(input.nextLine());
            }

            System.out.print("Comfirm to modify this record? (Y/N): ");
            bike.setCfrm(input.nextLine().charAt(0));
            while (Character.toUpperCase(bike.getCfrm()) != 'Y' && Character.toUpperCase(bike.getCfrm()) != 'N') {
                    System.out.print("Invalid input, please try again.");
                    System.out.print("Continue to add another product? (Y/N): ");
                    bike.setCfrm(input.nextLine().charAt(0));
            }

            if(Character.toUpperCase(bike.getCfrm()) == 'Y'){
                bikeBase[choice] = new Bike(bike.getId().toUpperCase(), bike.getColor().toUpperCase(),
                bike.getBrand().toUpperCase(), bike.getPrice(), bike.getAvailability().toUpperCase());
                editBike.listOfBike.set(choice-1, bikeBase[choice]);
                System.out.println("No.\tBike_ID\tColor\tBrand\tPrice\tAvailability\n");
                for (int i = 0; i < editBike.getListOfBike().size(); i++) {
                    System.out.println((i + 1) + "\t" + editBike.getListOfBike().get(i));
                }
            }

            System.out.print("Continue to modify more record? (Y/N): ");
            bike.setCtn(input.nextLine().charAt(0));
            while (Character.toUpperCase(bike.getCtn()) != 'Y' && Character.toUpperCase(bike.getCtn()) != 'N') {
                System.out.print("Invalid input, please try again.");
                System.out.print("Continue to add another product? (Y/N): ");
                bike.setCtn(input.nextLine().charAt(0));
            }
        }while(Character.toUpperCase(bike.getCtn()) == 'Y');

    }

    public static void searchProduct(){
        Scanner input = new Scanner(System.in);
        BikeBase searchBike = new BikeBase();
        Bike[] bikeBase = new Bike[20];
        Bike bike = new Bike();

        System.out.print("+========================+\n");
        System.out.print("|     Search Product     |\n");
        System.out.print("+========================+\n\n");

        for (int i = 0; i < searchBike.getListOfBike().size(); i++) {
            bikeBase[i] = searchBike.listOfBike.get(i);
        }

        do{ 
            int count = 0;

            System.out.print("+==================+\n");
            System.out.print("| Detail to Search |\n");
            System.out.print("+==================+\n");
            System.out.print("| 1. Bike ID       |\n");
            System.out.print("| 2. Bike Color    |\n");
            System.out.print("| 3. Bike Brand    |\n");
            System.out.print("| 4. Availability  |\n");
            System.out.print("+==================+\n");

            System.out.print("Please select one of the bike detail to search: ");
            bike.setChoice(input.nextInt());
            input.nextLine();
            while(bike.getChoice() < 1 || bike.getChoice() > 4){
                System.out.print("Invalid Input, Please try again!!!\n");
                System.out.print("\nPlease choose one of the options: ");
                bike.setChoice(input.nextInt());
                input.nextLine();
            }

            switch(bike.getChoice()){
                case 1:
                    System.out.print("Please enter the bike ID: ");
                    bike.setId(input.nextLine());
                    for (int i = 0; i < searchBike.getListOfBike().size(); i++) {
                        while(bike.getId().length() != 5 || bike.getId().charAt(0) != 'A' || !Character.isDigit(bike.getId().charAt(1))
                        || !Character.isDigit(bike.getId().charAt(2)) || !Character.isDigit(bike.getId().charAt(3))
                        || !Character.isDigit(bike.getId().charAt(4))){
                            System.out.print("Invalid Input, please try again!!\n");
                            System.out.print("Please Enter the bike ID (Axxxx): ");
                            bike.setId(input.nextLine());
                        }
                    }
                
                    System.out.println("Bike_ID\tColor\tBrand\tPrice\tAvailability\n");
                    for(int i = 0; i < searchBike.getListOfBike().size(); i++){
                        if(bikeBase[i].getId().toUpperCase().contains(bike.getId().toUpperCase())) {
                            System.out.print(bikeBase[i]);
                            count++;
                        }
                    }
                    System.out.printf("\n<** Total %d record founded **>\n", count);
                    break;

                case 2:
                    System.out.print("[BLUE, RED, BLACK]\n");
                    System.out.print("Please enter the bike Color: ");
                    bike.setColor(input.nextLine());
                    while(!bike.getColor().toUpperCase().equals("BLUE") && !bike.getColor().toUpperCase().equals("RED")
                    && !bike.getColor().toUpperCase().equals("BLACK")){ 
                        System.out.print("Invalid Input, please try again!!\n");
                        System.out.print("[BLUE, RED, BLACK]\n");
                        System.out.print("Please Enter one of the bike color : ");
                        bike.setColor(input.nextLine());
                    }

                    System.out.println("Bike_ID\tColor\tBrand\tPrice\tAvailability\n");
                    for(int i = 0; i < searchBike.getListOfBike().size(); i++){
                        if(bikeBase[i].getColor().toUpperCase().contains(bike.getColor().toUpperCase())) {
                            System.out.print(bikeBase[i]);
                            count++;
                        }
                    }
                    System.out.printf("\n<** Total %d record founded **>\n", count);
                    
                    break;

                case 3:
                    System.out.print("[SCOTT, BMC, TREK, GIANT, FELT]\n");
                    System.out.print("Please enter the bike Brand: ");
                    bike.setBrand(input.nextLine());
                    while(!bike.getBrand().toUpperCase().equals("SCOTT") && !bike.getBrand().toUpperCase().equals("BMC")
                    && !bike.getBrand().toUpperCase().equals("TREK") && !bike.getBrand().toUpperCase().equals("GIANT")
                    && !bike.getBrand().toUpperCase().equals("FELT")){
                        System.out.print("Invalid Input, please try again!!\n");
                        System.out.print("[SCOTT, BMC, TREK, GIANT, FELT]\n");
                        System.out.print("Please Enter one of the bike brand : ");
                        bike.setBrand(input.nextLine());
                    }

                    System.out.println("Bike_ID\tColor\tBrand\tPrice\tAvailability\n");
                    for(int i = 0; i < searchBike.getListOfBike().size(); i++){
                        if(bikeBase[i].getBrand().toUpperCase().contains(bike.getBrand().toUpperCase())) {
                            System.out.print(bikeBase[i]);
                            count++;
                        }
                    }
                    System.out.printf("\n<** Total %d record founded **>\n", count);
                    break;

                case 4:
                    System.out.print("Please enter the bike Availability: ");
                    bike.setAvailability(input.nextLine());
                    while(!bike.getAvailability().toUpperCase().equals("FREE") &&
                    !bike.getAvailability().toUpperCase().equals("BOOKED")){
                    System.out.print("Invalid Input, please try again!!\n");
                    System.out.print("Please enter the new bike availability: ");
                    bike.setAvailability(input.nextLine());
                    }

                    System.out.println("Bike_ID\tColor\tBrand\tPrice\tAvailability\n");
                    for(int i = 0; i < searchBike.getListOfBike().size(); i++){
                        if(bikeBase[i].getAvailability().toUpperCase().contains(bike.getAvailability().toUpperCase())) {
                            System.out.print(bikeBase[i]);
                            count++;
                        }
                    }
                    System.out.printf("\n<** Total %d record founded **>\n", count);
                    break;

                default:
                    System.out.print("Invalid input, please try again!!\n");
            }

            System.out.print("Continue to search more record? (Y/N): ");
            bike.setCtn(input.nextLine().charAt(0));
            while(Character.toUpperCase(bike.getCtn())!= 'Y' && Character.toUpperCase(bike.getCtn()) != 'N'){
                System.out.print("Invalid input, please try again!!\n");
                System.out.print("Continue to search more record? (Y/N): ");
                bike.setCtn(input.nextLine().charAt(0));
            }
        }while(Character.toUpperCase(bike.getCtn()) == 'Y');

    }
}
