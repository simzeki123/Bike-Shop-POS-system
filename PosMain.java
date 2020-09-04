import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @(#)PosMain.java
 *
 *
 * @author 
 * @version 1.00 2020/7/20
 */

public class PosMain {
        
    /**
     * Creates a new instance of <code>PosMain</code>.
     */
    public PosMain() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product product = new Product();
        Staff staff = new Staff();

        Membership[] member = new Membership[100];
        int memCount = 0;
        Product[] products = new Product[100];
        int productCount =0;
        Order[] ords = new Order[100];
        int orderCount = 0;

        Scanner input = new Scanner(System.in);
        int choice = 0;

        System.out.print("+================================+\n");
        System.out.print("|     Bike Rental POS System     |\n");
        System.out.print("+================================+\n");
        System.out.print("| 1. Bike Product                |\n");
        System.out.print("| 2. SalesPerson                 |\n");
        System.out.print("| 3. Membership                  |\n");
        System.out.print("| 4. Make Order                  |\n");
        System.out.print("| 5. Get Daily Report            |\n");
        System.out.print("| 6. Get Monthly Report          |\n");
        System.out.print("| 7. Exit                        |\n");
        System.out.print("+================================+\n");
        System.out.print("Please select one of the selection: ");
        do{
            try {
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Something went wrong\n");
                System.out.println("Please enter an integer\n");
            }
        }while(choice < 1 || choice > 7);
        
        switch(choice){
            case 1:
                product.getProduct();
                break;

            case 2:
                staff.getStaff();
                break;

            case 3:
                
                break;

            case 4:

                break;

            case 5:
                break;

            case 6:
                break;

            case 7:
                break;

            default:
                System.out.print("Invalid input!!\n");    
        }
    }
}
