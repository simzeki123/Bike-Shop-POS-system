import java.util.Scanner;

public class Order extends Membership {
    private String custName;
    private String custIC;

    public Order(){

    }

    public Order(String memberID, String name, String memberIC, String memberType, String custName, String custIC){
        super(memberID, name, memberIC, memberType);
        this.custName = custName;
        this.custIC = custIC;
    }

    public String getCustName()  {
        return custName;
    }

    public String getCustIC()   {
        return custIC;
    }

    public void setCustName(String custName)    {
        this.custName = custName;
    }

    public void setCustIC(String custIC)    {
        this.custIC = custIC;
    }

    public static void order(){
        Scanner input = new Scanner(System.in);
        char isMember;
        int count = 0;
        int slct;
        char cfrm;
        Bike[] bikeBase = new Bike[20];
        BikeBase displayBike = new BikeBase();
        Membership[] memberBase = new Membership[20];
        Membership member = new Membership();
        MemberList memberList = new MemberList();
        Order order = new Order();

        for (int i = 0; i < memberList.getListOfMember().size(); i++) {
            memberBase[i] = memberList.listOfMember.get(i);
        }

        System.out.print("+=======================+\n");
        System.out.print("|     Order Process     |\n");
        System.out.print("+=======================+\n");

        System.out.print("<** If you are basic member, you will get 10% discount **>\n");
        System.out.print("<** If you are premium member, you will get 15% discount **>\n");
        System.out.print("<** If you are not a member, no discount will be given **>\n");
        System.out.print("Are you the member? (Y/N): ");
        isMember = input.nextLine().charAt(0);
        while(Character.toUpperCase(isMember) != 'Y' && Character.toUpperCase(isMember) != 'N'){
            System.out.print("Invalid input, please try again!!\n");
            System.out.print("Are you the member? (Y/N): ");
            isMember = input.nextLine().charAt(0);
        }

        if(Character.toUpperCase(isMember) == 'Y'){
            System.out.print("[Basic, Premium]\n");
            System.out.print("Which member type are you: ");
            member.setMemberType(input.nextLine());
            while(!member.getMemberType().toUpperCase().equals("BASIC") && !member.getMemberType().toUpperCase().equals("PREMIUM")){
                System.out.print("Invalid input, please try again!!\n");
                System.out.print("[Basic, Premium]\n");
                System.out.print("Which member type are you: ");
                member.setMemberType(input.nextLine());
            }
            
            System.out.print("<** Enter details to verify membership account **>\n\n");
            System.out.print("Please enter your member ID: ");
            member.setMemberID(input.nextLine());
            // for (int i = 0; i < memberList.getListOfMember().size(); i++) {
            //     while(!member.getMemberID().equals(memberBase[i].getMemberID())){
            //         System.out.print("Invalid input, please try again!!\n");
            //         System.out.print("Please enter your member ID: ");
            //         member.setMemberID(input.nextLine());
            //     }
            // }

            System.out.print("Please enter your name: ");
            member.setName(input.nextLine());
            // for (int i = 0; i < memberList.getListOfMember().size(); i++) {
            //     while(!member.getName().contains(memberBase[i].getName())){
            //         System.out.print("Invalid input, please try again!!\n");
            //         System.out.print("Please enter your member ID: ");
            //         member.setName(input.nextLine());
            //     }
            // }

            System.out.print("Please enter your IC Number: ");
            member.setMemberIC(input.nextLine());
            // for (int i = 0; i < memberList.getListOfMember().size(); i++) {
            //     while(!member.getMemberIC().contains(memberBase[i].getMemberIC())){
            //         System.out.print("Invalid input, please try again!!\n");
            //         System.out.print("Please enter your member ID: ");
            //         member.setMemberIC(input.nextLine());
            //     }
            // }
        }

        if(Character.toUpperCase(isMember) == 'N'){
            System.out.print("Please enter your name: ");
            order.setCustName(input.nextLine());
            for(int i = 0; i < order.getCustName().length(); i++){
                while(!Character.isLetter(order.getCustName().charAt(i)) && 
                !Character.isWhitespace(order.getCustName().charAt(i))){
                    System.out.print("Invalid input, please try again!!\n");
                    System.out.print("Please enter your name: ");
                    order.setCustName(input.nextLine());
                }
            }

            System.out.print("Please enter your IC Number: ");
            order.setCustIC(input.nextLine());
            for(int i = 0; i < 12; i++){
                while(order.getCustIC().length() != 12 && !Character.isDigit(order.getCustIC().charAt(i))){
                    System.out.print("Invalid input, please try again!!\n");
                    System.out.print("Please enter your IC Number: ");
                    order.setCustIC(input.nextLine());
                }
            }
        }

        System.out.println("List of the bikes: ");
        System.out.println("No.\tBike_ID\tColor\tBrand\tPrice\tAvailability\n");

        for (int i = 0; i < displayBike.getListOfBike().size(); i++) {
            bikeBase[i] = displayBike.listOfBike.get(i);
            if(bikeBase[i].getAvailability().toUpperCase().contains("FREE")){
                count++;
                System.out.print((count) + "\t" + bikeBase[i]);
            }
        }
        
        System.out.print("Please select one of the product to make the order: ");
        slct = input.nextInt();
        while(slct > count || slct <= 0){
            System.out.print("Invalid input, please try again!!\n");
            System.out.print("Please select one of the product to make the order: ");
            slct = input.nextInt();
        }
        input.nextLine();
      
        System.out.print("Confirm to make this order (Y/N): ");
        cfrm = input.nextLine().charAt(0);
        while(Character.toUpperCase(cfrm) != 'Y' && Character.toUpperCase(cfrm) != 'N'){
            System.out.print("Invalid input, please try again!!\n");
            System.out.print("Confirm to make this order (Y/N): ");
            cfrm = input.nextLine().charAt(0);
        }

        if(Character.toUpperCase(cfrm) == 'Y'){
            if(Character.toUpperCase(isMember) == 'Y' && member.getMemberType().toUpperCase().equals("BASIC")){
                System.out.print("+=======================+\n");
                System.out.print("|     Order Summary     |\n");
                System.out.print("+=======================+\n");

                System.out.printf("CUST_NAME: %s\t\tCurrent_Date: %s\n", member.getName().toUpperCase(), java.time.LocalDate.now());
                System.out.printf("CUST_ICNO: %s\t\tCurrent_Time: %s\n", member.getMemberIC(), java.time.LocalTime.now());
                System.out.print("----------------------------------------------------------------\n");
                System.out.printf("\nBike ID      : %s\n", bikeBase[slct].getId());
                System.out.printf("Bike Color   : %s\n", bikeBase[slct].getColor());
                System.out.printf("Bike Brand   : %s\n", bikeBase[slct].getBrand());
                System.out.printf("Bike Price   : %.2f\n", bikeBase[slct].getPrice() - (bikeBase[slct].getPrice() * 10 / 100));
                System.out.printf("Availability : %s\n", bikeBase[slct].getAvailability());
            }

            if(Character.toUpperCase(isMember) == 'Y' && member.getMemberType().toUpperCase().equals("PREMIUM")){
                System.out.print("+=======================+\n");
                System.out.print("|     Order Summary     |\n");
                System.out.print("+=======================+\n");

                System.out.printf("CUST_NAME: %s\t\tCurrent_Date: %s\n", member.getName().toUpperCase(), java.time.LocalDate.now());
                System.out.printf("CUST_ICNO: %s\t\tCurrent_Time: %s\n", member.getMemberIC(), java.time.LocalTime.now());
                System.out.print("----------------------------------------------------------------\n");
                System.out.printf("\nBike ID      : %s\n", bikeBase[slct].getId());
                System.out.printf("Bike Color   : %s\n", bikeBase[slct].getColor());
                System.out.printf("Bike Brand   : %s\n", bikeBase[slct].getBrand());
                System.out.printf("Bike Price   : %.2f\n", bikeBase[slct].getPrice() - (bikeBase[slct].getPrice() * 15 / 100));
                System.out.printf("Availability : %s\n", bikeBase[slct].getAvailability());
            }

            if(Character.toUpperCase(isMember) == 'N'){
                System.out.print("+=======================+\n");
                System.out.print("|     Order Summary     |\n");
                System.out.print("+=======================+\n");

                System.out.printf("CUST_NAME: %s\t\tCurrent_Date: %s\n", order.getCustName().toUpperCase(), java.time.LocalDate.now());
                System.out.printf("CUST_ICNO: %s\t\tCurrent_Time: %s\n", order.getCustIC(), java.time.LocalTime.now());
                System.out.print("----------------------------------------------------------------\n");
                System.out.printf("\nBike ID      : %s\n", bikeBase[slct].getId());
                System.out.printf("Bike Color   : %s\n", bikeBase[slct].getColor());
                System.out.printf("Bike Brand   : %s\n", bikeBase[slct].getBrand());
                System.out.printf("Bike Price   : %.2f\n", bikeBase[slct].getPrice());
                System.out.printf("Availability : %s\n", bikeBase[slct].getAvailability());
            }
        }
        
    }

    public static void main(String[] args) {
        Order.order();
    }
}


