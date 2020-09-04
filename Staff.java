import java.util.Scanner;
import java.util.InputMismatchException;

public class Staff {

    public void getStaff(){
        Scanner input = new Scanner(System.in);
        SalesPerson staff = new SalesPerson();
        int choose = 0;
        do{
            System.out.print("+================================+\n");
            System.out.print("|     Bike Rental POS System     |\n");
            System.out.print("+================================+\n");
            System.out.print("| 1.  Display All Staff          |\n");
            System.out.print("| 2.  Add Staff                  |\n");
            System.out.print("| 3.  Edit Staff                 |\n");
            System.out.print("| 4.  Search Staff               |\n");
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
                case 1:staff.displayStaff();
                    break;
                case 2:staff.addStaff();
                    break;
                case 3:staff.editStaff();
                    break;
                case 4:staff.searchStaff();
                    break;
                case 5:
                    break;
                default:
                    System.out.print("Invalid Input, Please try again!!!\n");
            }
        }while(choose != 5);

        
    }
    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.getStaff();
    }
}