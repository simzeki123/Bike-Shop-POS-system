import java.util.Scanner;

public class Product{

    public static void getProduct(){
        Scanner input = new Scanner(System.in);
        Bike bike = new Bike();
        int choose;
        do{
            System.out.print("+================================+\n");
            System.out.print("|     Bike Rental POS System     |\n");
            System.out.print("+================================+\n");
            System.out.print("| 1.  Display All Product        |\n");
            System.out.print("| 2.  Add Product                |\n");
            System.out.print("| 3.  Edit Product               |\n");
            System.out.print("| 4.  Search Product             |\n");
            System.out.print("| 5.  Exit                       |\n");
            System.out.print("+================================+\n");
        
            System.out.print("\nPlease choose one of the options: ");
            choose = input.nextInt();
            while(choose < 1 || choose > 5){
                System.out.print("Invalid Input, Please try again!!!\n");
                System.out.print("\nPlease choose one of the options: ");
                choose = input.nextInt();
            }
            
            switch(choose){
                case 1:bike.displayProduct();
                    break;
                case 2:bike.addProduct();
                    break;
                case 3:bike.editProduct();
                    break;
                case 4:bike.searchProduct();
                    break;
                case 5:
                    break;
                default:
                    System.out.print("Invalid Input, Please try again!!!\n");
            }
        }while(choose != 5);

        input.close();
    }
    public static void main(String[] args) {
        getProduct();
    }
}