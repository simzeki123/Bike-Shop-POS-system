import java.util.Scanner;
import java.util.InputMismatchException;

public class Product{

    public void getProduct(){
        Scanner input = new Scanner(System.in);
        Bike bike = new Bike();
        int choose = 0;
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
            do{
                try {
                    choose = input.nextInt();
                } catch (InputMismatchException e) {
                    input.nextLine();
                    System.out.println("Something went wrong\n");
                    System.out.println("Please enter an integer\n");
                }
            }while(choose > 5 || choose <= 0);
    
            input.nextLine();
            
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
        Product product = new Product();
        product.getProduct();
    }
}