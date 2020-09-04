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
        Order order = new Order();
        Staff staff = new Staff();
        Payment payment = new Payment();
        Membership[] member = new Membership[100];
        int memCount = 0;
        Product[] products = new Product[100];
        int productCount =0;
        Order[] ords = new Order[100];
        int orderCount = 0;

        Scanner input = new Scanner(System.in);
        int slct = -1;
        int choice;

        System.out.print("+================================+\n");
        System.out.print("|     Bike Rental POS System     |\n");
        System.out.print("+================================+\n");
        System.out.print("| 1. STAFF                       |\n");
        System.out.print("| 2. CUSTOMER                    |\n");
        System.out.print("| 3. Exit                        |\n");
        System.out.print("+================================+\n");
        System.out.print("Please select one of the selection: ");
        
            
            try {
				slct = input.nextInt();
			  } catch (InputMismatchException  e) {
				input.next();
				System.out.println("Something went wrong.\n");}

        while(slct < 1 || slct > 3){
            System.out.print("Invalid input!!\n");
            System.out.print("<!! Please select between 1-2 !!>\n");
            System.out.print("Please select one of the selection: ");
            slct = input.nextInt();
        }

        switch(slct){
            case 1:
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
                choice = input.nextInt();
                while(choice < 1 || choice > 6){
                    System.out.print("Invalid input!!\n");
                    System.out.print("<!! Please select between 1-6 !!>\n");
                    System.out.print("Please select one of the selection: ");
                    choice = input.nextInt();
                }
                
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
                    order.order();
            
                    payment.payment(payment.calculate_total_sales_of_transaction());
                        break;
/*
"S0001", "TOM PARKER"  M0001","OOI ZHIA XION" "011109025478"
*/
                    case 5:

                        break;

                    case 6:
                        break;

                    case 7:
                        break;

                    default:
                        System.out.print("Invalid input!!\n");    
                }
                break;

            case 2:
                System.out.print("+================================+\n");
                System.out.print("|     Bike Rental POS System     |\n");
                System.out.print("+================================+\n");
                System.out.print("| 1. Make Order                  |\n");
                System.out.print("| 2. Exit                        |\n");
                System.out.print("+================================+\n");
                System.out.print("Please select one of the selection: ");
                choice = input.nextInt();
                while(choice < 1 || choice > 2){
                    System.out.print("Invalid input!!\n");
                    System.out.print("<!! Please select between 1-2 !!>\n");
                    System.out.print("Please select one of the selection: ");
                    choice = input.nextInt();
                }

                switch(choice){
                    case 1:
                        break;
                    case 2:
                        break;
                    default:
                        System.out.print("Invalid input!!\n");
                }

                break;
            
            case 3:
                break;

            default:
                System.out.print("Invalid input!!\n");

        }
        input.close();
    }
}
