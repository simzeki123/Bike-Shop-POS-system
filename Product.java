import java.util.Scanner;

public class Product{

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
        char ctn;
        char cfrm;
        
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
            cfrm = input.nextLine().charAt(0);
            while (Character.toUpperCase(cfrm) != 'Y' && Character.toUpperCase(cfrm) != 'N'){
                System.out.print("Invalid input, please try again.");
                System.out.print("Confirm to add this product? (Y/N): ");
                cfrm = input.nextLine().charAt(0);
            }

            if(Character.toUpperCase(cfrm) == 'Y'){
                bikeBase[count] = new Bike(bike.getId(), bike.getColor().toUpperCase(), bike.getBrand().toUpperCase(), bike.getPrice(), bike.getAvailability());
                addBike.listOfBike.add(bikeBase[count]);
            }
            
            System.out.print("Continue to add more product? (Y/N): ");
            ctn = input.nextLine().charAt(0);
            while (Character.toUpperCase(ctn) != 'Y' && Character.toUpperCase(ctn) != 'N') {
                System.out.print("Invalid input, please try again.");
                System.out.print("Continue to add another product? (Y/N): ");
                ctn = input.nextLine().charAt(0);
            }
        }while (Character.toUpperCase(ctn) == 'Y');

        System.out.println("List of the bikes: ");
        System.out.println("No.\tBike_ID\tColor\tBrand\tPrice\tAvailability\n");
        for (int i = 0; i < addBike.getListOfBike().size(); i++) {
            System.out.println((i + 1) + "\t" + addBike.getListOfBike().get(i));
        }
    
        input.close();
    }

    public static void editProduct(){
        Scanner input = new Scanner(System.in);
        BikeBase editBike = new BikeBase();
        Bike[] bikeBase = new Bike[20];
        Bike bike = new Bike();
        int choice;
        char cfrm;
        char ctn;
        //int selection;

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
        cfrm = input.nextLine().charAt(0);
        while (Character.toUpperCase(cfrm) != 'Y' && Character.toUpperCase(cfrm) != 'N') {
                System.out.print("Invalid input, please try again.");
                System.out.print("Continue to add another product? (Y/N): ");
                cfrm = input.nextLine().charAt(0);
        }

        if(Character.toUpperCase(cfrm) == 'Y'){
            bikeBase[choice] = new Bike(bike.getId().toUpperCase(), bike.getColor().toUpperCase(),
             bike.getBrand().toUpperCase(), bike.getPrice(), bike.getAvailability().toUpperCase());
            editBike.listOfBike.set(choice-1, bikeBase[choice]);
            for (int i = 0; i < editBike.getListOfBike().size(); i++) {
                System.out.println((i + 1) + "\t" + editBike.getListOfBike().get(i));
            }
        }

        System.out.print("Continue to modify more record? (Y/N): ");
        ctn = input.nextLine().charAt(0);
        while (Character.toUpperCase(ctn) != 'Y' && Character.toUpperCase(ctn) != 'N') {
            System.out.print("Invalid input, please try again.");
            System.out.print("Continue to add another product? (Y/N): ");
            ctn = input.nextLine().charAt(0);
        }
    }while(Character.toUpperCase(ctn) == 'Y');
        
        input.close();
    }

    public static void searchProduct(){
        Scanner input = new Scanner(System.in);
        BikeBase searchBike = new BikeBase();
        Bike[] bikeBase = new Bike[20];
        Bike bike = new Bike();
        int choice;
        char ctn;
        int count = 0;

        System.out.print("+========================+\n");
        System.out.print("|     Search Product     |\n");
        System.out.print("+========================+\n\n");

        for (int i = 0; i < searchBike.getListOfBike().size(); i++) {
            bikeBase[i] = searchBike.listOfBike.get(i);
        }

        do{ 
            System.out.print("+==================+\n");
            System.out.print("| Detail to Search |\n");
            System.out.print("+==================+\n");
            System.out.print("| 1. Bike ID       |\n");
            System.out.print("| 2. Bike Color    |\n");
            System.out.print("| 3. Bike Brand    |\n");
            System.out.print("| 4. Bike Price    |\n");
            System.out.print("| 5. Availability  |\n");
            System.out.print("+==================+\n");

            System.out.print("Please one of the bike detail to search: ");
            choice = input.nextInt();
            input.nextLine();
            while(choice < 1 || choice > 5){
                System.out.print("Invalid Input, Please try again!!!\n");
                System.out.print("\nPlease choose one of the options: ");
                choice = input.nextInt();
                input.nextLine();
            }

            switch(choice){
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
                    System.out.print("Please enter the bike Price: ");
                    bike.setPrice(input.nextDouble());
                    while(bike.getPrice() != 10.00 && bike.getPrice() != 15.00 && bike.getPrice() != 20.00
                    && bike.getPrice() != 25.00 && bike.getPrice() != 30.00 ){
                        System.out.print("Invalid Input, please try again!!\n");
                        System.out.print("Please enter the bike Price: ");
                        bike.setPrice(input.nextDouble());
                    }

                    System.out.println("Bike_ID\tColor\tBrand\tPrice\tAvailability\n");
                    for(int i = 0; i < searchBike.getListOfBike().size(); i++){
                        if(bike.getPrice() == bikeBase[i].getPrice()) {
                            System.out.print(bikeBase[i]);
                            count++;
                        }
                    }
                    System.out.printf("\n<** Total %d record founded **>\n", count);
                    break;

                case 5:
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
                    System.out.print("Please enter the new bike availability: ");
            }

            System.out.print("Continue to search more record? (Y/N): ");
            ctn = input.nextLine().charAt(0);
            while(Character.toUpperCase(ctn) != 'Y' && Character.toUpperCase(ctn) != 'N'){
                System.out.print("Invalid input, please try again!!\n");
                System.out.print("Continue to search more record? (Y/N): ");
                ctn = input.nextLine().charAt(0);
            }
        }while(Character.toUpperCase(ctn) == 'Y');

        input.close();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose;

        System.out.print("+================================+\n");
        System.out.print("|     Bike Rental POS System     |\n");
        System.out.print("+================================+\n");
        System.out.print("| 1.  Display All Product        |\n");
        System.out.print("| 2.  Add Product                |\n");
        System.out.print("| 3.  Edit Product               |\n");
        System.out.print("| 4.  Search Product             |\n");
        System.out.print("+================================+\n");
       
        System.out.print("\nPlease choose one of the options: ");
        choose = input.nextInt();
        while(choose < 1 || choose > 4){
            System.out.print("Invalid Input, Please try again!!!\n");
            System.out.print("\nPlease choose one of the options: ");
            choose = input.nextInt();
        }
        
        switch(choose){
            case 1:displayProduct();
                break;
            case 2:addProduct();
                break;
            case 3:editProduct();
                break;
            case 4:searchProduct();
                break;
            default:
                System.out.print("Invalid Input, Please try again!!!\n");
        }

        input.close();
    }
}