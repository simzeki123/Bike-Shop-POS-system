import java.util.Scanner;

public class Order {
    private String custName;
    private String custIC;
    private char isMember;
    private int slct;
    private char cfrm;
    
    public Order()  {

    }
    
    public Order(String custName, String custIC, char isMember){
        this.custName = custName;
        this.custIC = custIC;
        this.isMember = isMember;
    }

    public String getCustName()  {
        return custName;
    }

    public String getCustIC()   {
        return custIC;
    }
    
    public char getIsMember()   {
        return isMember;
    }

    private int getSlct()   {
        return slct;
    }

    public char getCfrm()   {
        return cfrm;
    }

    public void setCustName(String custName)    {
        this.custName = custName;
    }

    public void setCustIC(String custIC)    {
        this.custIC = custIC;
    }

    public void setIsMember(char isMember)  {
        this.isMember = isMember;
    }

    public void setSlct(int slct)   {
        this.slct = slct;
    }

    public void setCfrm(char cfrm)  {
        this.cfrm = cfrm;
    }

    public void order(){
        Scanner input = new Scanner(System.in);
        int count = 0;
        
        Order order = new Order();
        
        Bike[] bikeBase = new Bike[20];
        BikeBase displayBike = new BikeBase();
        
        Membership[] memberBase = new Membership[20];
        Membership member = new Membership();
        MemberList memberList = new MemberList();
        
        SalesPerson[] staffBase = new SalesPerson[20];
        SalesPerson salesperson = new SalesPerson();
        SalesPersonBase staff = new SalesPersonBase();

        for (int i = 0; i < memberList.getListOfMember().size(); i++) {
            memberBase[i] = memberList.listOfMember.get(i);
        }

        for (int i = 0; i < staff.getListOfStaff().size(); i++) {
            staffBase[i] = staff.listOfSalesPersons.get(i);
        }
        

        System.out.print("+=======================+\n");
        System.out.print("|     Order Process     |\n");
        System.out.print("+=======================+\n");

        System.out.print("+==============================+\n");
        System.out.print("|     Verify Staff Account     |\n");
        System.out.print("+==============================+\n");
        System.out.print("Please enter your Staff ID: ");
        salesperson.setId(input.nextLine());
        while(!salesperson.getId().equals(staffBase[0].getId()) && !salesperson.getId().equals(staffBase[1].getId())
            && !salesperson.getId().equals(staffBase[2].getId()) && !salesperson.getId().equals(staffBase[3].getId())
            && !salesperson.getId().equals(staffBase[4].getId()) && !salesperson.getId().equals(staffBase[5].getId())
            && !salesperson.getId().equals(staffBase[6].getId()) && !salesperson.getId().equals(staffBase[7].getId())
            && !salesperson.getId().equals(staffBase[8].getId()) && !salesperson.getId().equals(staffBase[9].getId())){
                System.out.print("Invalid input, please try again!!\n");
                System.out.print("Please enter your Staff ID: ");
                salesperson.setId(input.nextLine());
        }

        System.out.print("Please enter your name: ");
        salesperson.setName(input.nextLine());
        while(!salesperson.getName().toUpperCase().equals(staffBase[0].getName()) && !salesperson.getName().toUpperCase().equals(staffBase[1].getName())
            && !salesperson.getName().toUpperCase().equals(staffBase[2].getName()) && !salesperson.getName().toUpperCase().equals(staffBase[3].getName())
            && !salesperson.getName().toUpperCase().equals(staffBase[4].getName()) && !salesperson.getName().toUpperCase().equals(staffBase[5].getName())
            && !salesperson.getName().toUpperCase().equals(staffBase[6].getName()) && !salesperson.getName().toUpperCase().equals(staffBase[7].getName())
            && !salesperson.getName().toUpperCase().equals(staffBase[8].getName()) && !salesperson.getName().toUpperCase().equals(staffBase[9].getName())){
                System.out.print("Invalid input, please try again!!\n");
                System.out.print("Please enter your name: ");
                salesperson.setName(input.nextLine());
        }
        System.out.print("\n\n+================================================================+\n");
        System.out.print("|   <** If you are basic member, you will get 10% discount **>   |\n");
        System.out.print("|  <** If you are premium member, you will get 15% discount **>  |\n");
        System.out.print("|   <** If you are not a member, no discount will be given **>   |\n");
        System.out.print("+================================================================+\n");
        System.out.print("Are you the member? (Y/N): ");
        order.isMember = input.nextLine().charAt(0);
        while(Character.toUpperCase(order.isMember) != 'Y' && Character.toUpperCase(order.isMember) != 'N'){
            System.out.print("Invalid input, please try again!!\n");
            System.out.print("Are you the member? (Y/N): ");
            order.isMember = input.nextLine().charAt(0);
        }

        if(Character.toUpperCase(order.isMember) == 'Y'){
            System.out.print("[Basic, Premium]\n");
            System.out.print("Which member type are you: ");
            member.setMemberType(input.nextLine());
            while(!member.getMemberType().toUpperCase().equals("BASIC") && !member.getMemberType().toUpperCase().equals("PREMIUM")){
                System.out.print("Invalid input, please try again!!\n");
                System.out.print("[Basic, Premium]\n");
                System.out.print("Which member type are you: ");
                member.setMemberType(input.nextLine());
            }
            
            System.out.print("\n\n+===================================+\n");
            System.out.print("|     Verify Membership Account     |\n");
            System.out.print("+===================================+\n");
            System.out.print("Please enter your member ID: ");
            member.setMemberID(input.nextLine());
            while(!member.getMemberID().equals(memberBase[0].getMemberID()) && !member.getMemberID().equals(memberBase[1].getMemberID())
            && !member.getMemberID().equals(memberBase[2].getMemberID()) && !member.getMemberID().equals(memberBase[3].getMemberID())
            && !member.getMemberID().equals(memberBase[4].getMemberID()) && !member.getMemberID().equals(memberBase[5].getMemberID())
            && !member.getMemberID().equals(memberBase[6].getMemberID()) && !member.getMemberID().equals(memberBase[7].getMemberID())
            && !member.getMemberID().equals(memberBase[8].getMemberID()) && !member.getMemberID().equals(memberBase[9].getMemberID())){
                System.out.print("Invalid input, please try again!!\n");
                System.out.print("Please enter your member ID: ");
                member.setMemberID(input.nextLine());
            }

            System.out.print("Please enter your name: ");
            member.setName(input.nextLine());
            while(!member.getName().toUpperCase().equals(memberBase[0].getName()) && !member.getName().toUpperCase().equals(memberBase[1].getName())
            && !member.getName().toUpperCase().equals(memberBase[2].getName()) && !member.getName().toUpperCase().equals(memberBase[3].getName())
            && !member.getName().toUpperCase().equals(memberBase[4].getName()) && !member.getName().toUpperCase().equals(memberBase[5].getName())
            && !member.getName().toUpperCase().equals(memberBase[6].getName()) && !member.getName().toUpperCase().equals(memberBase[7].getName())
            && !member.getName().toUpperCase().equals(memberBase[8].getName()) && !member.getName().toUpperCase().equals(memberBase[9].getName())){
                System.out.print("Invalid input, please try again!!\n");
                System.out.print("Please enter your name: ");
                member.setName(input.nextLine());
            }

            System.out.print("Please enter your IC Number: ");
            member.setMemberIC(input.nextLine());
            while(!member.getMemberIC().equals(memberBase[0].getMemberIC()) && !member.getMemberIC().equals(memberBase[1].getMemberIC())
            && !member.getMemberIC().equals(memberBase[2].getMemberIC()) && !member.getMemberIC().equals(memberBase[3].getMemberIC())
            && !member.getMemberIC().equals(memberBase[4].getMemberIC()) && !member.getMemberIC().equals(memberBase[5].getMemberIC())
            && !member.getMemberIC().equals(memberBase[6].getMemberIC()) && !member.getMemberIC().equals(memberBase[7].getMemberIC())
            && !member.getMemberIC().equals(memberBase[8].getMemberIC()) && !member.getMemberIC().equals(memberBase[9].getMemberIC())){
                System.out.print("Invalid input, please try again!!\n");
                System.out.print("Please enter your IC Number: ");
                member.setMemberIC(input.nextLine());
            }
        }

        if(Character.toUpperCase(order.isMember) == 'N'){
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
            count++;
            if(bikeBase[i].getAvailability().toUpperCase().contains("FREE")){
                System.out.print((count) + "\t" + bikeBase[i]);
            }
        }
        
        System.out.print("Please select one of the product to make the order: ");
        order.setSlct(input.nextInt());
        while(order.getSlct() > count || order.getSlct() <= 0){
            System.out.print("Invalid input, please try again!!\n");
            System.out.print("Please select one of the product to make the order: ");
            order.setSlct(input.nextInt());
        }
        input.nextLine();
      
        System.out.print("Confirm to make this order (Y/N): ");
        order.setCfrm(input.nextLine().charAt(0));
        while(Character.toUpperCase(order.getCfrm()) != 'Y' && Character.toUpperCase(order.getCfrm()) != 'N'){
            System.out.print("Invalid input, please try again!!\n");
            System.out.print("Confirm to make this order (Y/N): ");
            order.setCfrm(input.nextLine().charAt(0));
        }

        if(Character.toUpperCase(order.getCfrm()) == 'Y'){
            bikeBase[order.getSlct() - 1].setAvailability("BOOKED");
            if(Character.toUpperCase(order.isMember) == 'Y' && member.getMemberType().toUpperCase().equals("BASIC")){
                System.out.print("\n+=======================+\n");
                System.out.print("|     Order Summary     |\n");
                System.out.print("+=======================+\n");

                System.out.printf("STAFF_NAME: %s\t\t\tSTAFF_ID    : %s\n", salesperson.getName().toUpperCase(), salesperson.getId());
                System.out.printf("CUST_NAME : %s\t\tCurrent_Date: %s\n", member.getName().toUpperCase(), java.time.LocalDate.now());
                System.out.printf("CUST_ICNO : %s\t\tCurrent_Time: %s\n", member.getMemberIC(), java.time.LocalTime.now());
                System.out.print("----------------------------------------------------------------\n");
                System.out.printf("Bike ID      : %s\n", bikeBase[order.getSlct() - 1].getId());
                System.out.printf("Bike Color   : %s\n", bikeBase[order.getSlct() - 1].getColor());
                System.out.printf("Bike Brand   : %s\n", bikeBase[order.getSlct() - 1].getBrand());
                System.out.printf("Bike Price   : %.2f\n", bikeBase[order.getSlct() - 1].getPrice() - (bikeBase[order.getSlct() - 1].getPrice() * 10 / 100));
                System.out.printf("Availability : %s\n", bikeBase[order.getSlct() - 1].getAvailability());
            }

            if(Character.toUpperCase(order.isMember) == 'Y' && member.getMemberType().toUpperCase().equals("PREMIUM")){
                System.out.print("\n+=======================+\n");
                System.out.print("|     Order Summary     |\n");
                
                System.out.print("+=======================+\n");
                System.out.printf("STAFF_NAME: %s\t\t\tSTAFF_ID    : %s\n", salesperson.getName().toUpperCase(), salesperson.getId());
                System.out.printf("CUST_NAME : %s\t\tCurrent_Date: %s\n", member.getName().toUpperCase(), java.time.LocalDate.now());
                System.out.printf("CUST_ICNO : %s\t\tCurrent_Time: %s\n", member.getMemberIC(), java.time.LocalTime.now());
                System.out.print("----------------------------------------------------------------\n");
                System.out.printf("Bike ID      : %s\n", bikeBase[order.getSlct() - 1].getId());
                System.out.printf("Bike Color   : %s\n", bikeBase[order.getSlct() - 1].getColor());
                System.out.printf("Bike Brand   : %s\n", bikeBase[order.getSlct() - 1].getBrand());
                System.out.printf("Bike Price   : %.2f\n", bikeBase[order.getSlct() - 1].getPrice() - (bikeBase[order.getSlct() - 1].getPrice() * 15 / 100));
                System.out.printf("Availability : %s\n", bikeBase[order.getSlct() - 1].getAvailability());
            }

            if(Character.toUpperCase(order.isMember) == 'N'){
                System.out.print("\n+=======================+\n");
                System.out.print("|     Order Summary     |\n");
                System.out.print("+=======================+\n");

                System.out.printf("STAFF_NAME: %s\t\t\tSTAFF_ID    : %s\n", salesperson.getName().toUpperCase(), salesperson.getId());
                System.out.printf("CUST_NAME : %s\t\tCurrent_Date: %s\n", order.getCustName().toUpperCase(), java.time.LocalDate.now());
                System.out.printf("CUST_ICNO : %s\t\tCurrent_Time: %s\n", order.getCustIC(), java.time.LocalTime.now());
                System.out.print("----------------------------------------------------------------\n");
                System.out.printf("Bike ID      : %s\n", bikeBase[order.getSlct() - 1].getId());
                System.out.printf("Bike Color   : %s\n", bikeBase[order.getSlct() - 1].getColor());
                System.out.printf("Bike Brand   : %s\n", bikeBase[order.getSlct() - 1].getBrand());
                System.out.printf("Bike Price   : %.2f\n", bikeBase[order.getSlct() - 1].getPrice());
                System.out.printf("Availability : %s\n", bikeBase[order.getSlct() - 1].getAvailability());
            }
        }
        input.close();
    }

    public static void main(String[] args) {
        Order order = new Order();
        order.order();
    }
}


