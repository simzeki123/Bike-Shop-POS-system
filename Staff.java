import java.util.Scanner;

public class Staff {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose;
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
            choose = input.nextInt();
            input.nextLine();
            while(choose < 1 || choose > 5){
                System.out.print("Invalid Input, Please try again!!!\n");
                System.out.print("\nPlease choose one of the options: ");
                choose = input.nextInt();
                input.nextLine();
            }
            
            switch(choose){
                case 1:SalesPerson.displayStaff();
                    break;
                case 2:SalesPerson.addStaff();
                    break;
                case 3:SalesPerson.editStaff();
                    break;
                case 4:SalesPerson.searchStaff();
                    break;
                case 5:
                    break;
                default:
                    System.out.print("Invalid Input, Please try again!!!\n");
            }
        }while(choose != 5);

        input.close();
    }
}