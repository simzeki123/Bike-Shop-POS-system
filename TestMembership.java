import java.util.Scanner;

public class TestMembership {
    
    public static void getMember(){
        Scanner input = new Scanner(System.in);
        int choose;
        do{
            System.out.print("+================================+\n");
            System.out.print("|     Bike Rental POS System     |\n");
            System.out.print("+================================+\n");
            System.out.print("| 1.  Display All Member         |\n");
            System.out.print("| 2.  Add Member                 |\n");
            System.out.print("| 3.  Edit Member                |\n");
            System.out.print("| 4.  Search Member              |\n");
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
                case 1:Membership.displayMember();
                    break;
                case 2:Membership.addMember();
                    break;
                case 3:Membership.modifyMember();
                    break;
                case 4:Membership.searchMember();
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
        getMember();
    }
}
