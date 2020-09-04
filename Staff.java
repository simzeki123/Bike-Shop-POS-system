import java.util.Scanner;

public class Staff {

    public void getStaff(){
        Scanner input = new Scanner(System.in);
        SalesPerson staff = new SalesPerson();
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

        input.close();
    }
    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.getStaff();
    }
}