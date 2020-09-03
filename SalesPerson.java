import java.util.Scanner;

public class SalesPerson {
    private String id;
    private String name;
    private String gender;
    private double basicSalary;
    private double allowance;
    private char ctn;
    private char cfrm;
    private int choice;
    
    public SalesPerson(){
        
    }

    public SalesPerson(String id, String name, String gender,double basicSalary, double allowance){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.basicSalary = basicSalary;
        this.allowance = allowance;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getGender(){
        return gender;
    }

    public double getBasicSalary(){
        return basicSalary;
    }

    public double getAllowance(){
        return allowance;
    }

    public char getCtn()    {
        return ctn;
    }

    public char getCfrm()   {
        return cfrm;
    }

    public int getChoice()  {
        return choice;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setBasicSalary(double basicSalary){
        this.basicSalary = basicSalary;
    }

    public void setAllowance(double allowance){
        this.allowance = allowance;
    }

    public void setCtn(char ctn)    {
        this.ctn = ctn;
    }

    public void setCfrm(char cfrm)  {
        this.cfrm = cfrm;
    }

    public void setChoice(int choice)   {
        this.choice = choice;
    }

    public String toString(){
        return String.format("%s\t\t%s\t\t%s\t\t%.2f\t\t%.2f\n", id, name, gender, basicSalary, allowance);
    }

    static SalesPerson[] staffBase = new SalesPerson[20];

    public static void displayStaff(){
        SalesPersonBase staffBase = new SalesPersonBase();
        System.out.print("+=============================+\n");
        System.out.print("|      Display All Staff      |\n");
        System.out.print("+=============================+\n");
        System.out.println("List of the Staff: ");
        System.out.println("No.\tStaff_ID\tName\t\t\tGender\t\tBasic_Salary\tAllowance\n");
        for (int i = 0; i < staffBase.getListOfStaff().size(); i++) {
            System.out.println((i + 1) + "\t" + staffBase.getListOfStaff().get(i));
        }
    }

    public static void addStaff(){
        Scanner input = new Scanner(System.in);
        SalesPersonBase addStaff = new SalesPersonBase();
        SalesPerson salesPerson = new SalesPerson();
        int count = 0;

        System.out.print("+=====================+\n");
        System.out.print("|      Add Staff      |\n");
        System.out.print("+=====================+\n");

        for (int i = 0; i < addStaff.getListOfStaff().size(); i++) {
            staffBase[i] = addStaff.listOfSalesPersons.get(i);
            count++;
        }

        do{
            System.out.print("Please enter the staff ID (Sxxxx): ");
            salesPerson.setId(input.nextLine());
            for (int i = 0; i < salesPerson.getId().length(); i++) {
                while(salesPerson.getId().length() != 5 || salesPerson.getId().charAt(0) != 'S' ||
                 !Character.isDigit(salesPerson.getId().charAt(1)) || !Character.isDigit(salesPerson.getId().charAt(2))
                || !Character.isDigit(salesPerson.getId().charAt(3)) || !Character.isDigit(salesPerson.getId().charAt(4))
                || salesPerson.getId().contains(staffBase[i].getId())){
                    System.out.print("Invalid Input, please try again!!\n");
                    System.out.print("Please Enter the staff ID (Sxxxx): ");
                    salesPerson.setId(input.nextLine());
                }
            }

            System.out.print("Please enter the staff Name: ");
            salesPerson.setName(input.nextLine());
            for(int i = 0; i < salesPerson.getName().length(); i++){
                while(!Character.isLetter(salesPerson.getName().charAt(i)) &&
                !Character.isWhitespace(salesPerson.getName().charAt(i))){
                    System.out.print("Invalid Input, please try again!!\n");
                    System.out.print("Please enter the staff Name: ");
                    salesPerson.setName(input.nextLine());
                }
            }

            System.out.print("Please enter the staff Gender: ");
            salesPerson.setGender(input.nextLine());
            while(!salesPerson.getGender().toUpperCase().equals("MALE") &&
            !salesPerson.getGender().toUpperCase().equals("FEMALE")){
                System.out.print("Invalid Input, please try again!!\n");
                System.out.print("Please enter the staff Gender: ");
                salesPerson.setGender(input.nextLine());
            }

            System.out.print("Please enter the staff Basic Salary: ");
            salesPerson.setBasicSalary(input.nextDouble());

            System.out.print("Please enter the staff Allowance: ");
            salesPerson.setAllowance(input.nextDouble());

            input.nextLine();
            System.out.print("Confirm to add this staff? (Y/N): ");
            salesPerson.setCfrm(input.nextLine().charAt(0));
            while (Character.toUpperCase(salesPerson.getCfrm()) != 'Y' && Character.toUpperCase(salesPerson.getCfrm()) != 'N'){
                System.out.print("Invalid input, please try again.");
                System.out.print("Confirm to add this staff? (Y/N): ");
                salesPerson.setCfrm(input.nextLine().charAt(0));
            }

            if(Character.toUpperCase(salesPerson.getCfrm()) == 'Y'){
                staffBase[count] = new SalesPerson(salesPerson.getId(), salesPerson.getName().toUpperCase(),
                salesPerson.getGender().toUpperCase(), salesPerson.getBasicSalary(), salesPerson.getAllowance());
                addStaff.listOfSalesPersons.add(staffBase[count]);
            }

            System.out.print("Continue to add more staff? (Y/N): ");
            salesPerson.setCtn(input.nextLine().charAt(0));
            while (Character.toUpperCase(salesPerson.getCtn()) != 'Y' && Character.toUpperCase(salesPerson.getCtn()) != 'N') {
                System.out.print("Invalid input, please try again.");
                System.out.print("Continue to add another staff? (Y/N): ");
                salesPerson.setCtn(input.nextLine().charAt(0));
            }
        }while(Character.toUpperCase(salesPerson.getCtn()) == 'Y');

        System.out.println("List of the Staff: ");
        System.out.println("No.\tStaff_ID\tName\t\t\tGender\t\tBasic_Salary\tAllowance\n");
        for (int i = 0; i < addStaff.getListOfStaff().size(); i++) {
            System.out.println((i + 1) + "\t" + addStaff.getListOfStaff().get(i));
        }

    }

    public static void editStaff(){
        Scanner input = new Scanner(System.in);
        SalesPersonBase editStaff = new SalesPersonBase();
        SalesPerson salesPerson = new SalesPerson();

        for (int i = 0; i < editStaff.getListOfStaff().size(); i++) {
            staffBase[i] = editStaff.listOfSalesPersons.get(i);
        }

        System.out.print("+======================+\n");
        System.out.print("|      Edit Staff      |\n");
        System.out.print("+======================+\n");


        do{
            System.out.println("List of the Staff: ");
            System.out.println("No.\tStaff_ID\tName\t\t\tGender\t\tBasic_Salary\tAllowance\n");
            for (int i = 0; i < editStaff.getListOfStaff().size(); i++) {
                System.out.println((i + 1) + "\t" + editStaff.getListOfStaff().get(i));
            }

            System.out.print("Please enter ther record you want to modify: ");
            salesPerson.setChoice(input.nextInt());
            System.out.println("Staff_ID\tName\t\t\tGender\t\tBasic_Salary\tAllowance");
            System.out.print(editStaff.getListOfStaff().get(salesPerson.getChoice()-1));
            input.nextLine();

            System.out.print("Please enter the new staff ID (Sxxxx): ");
            salesPerson.setId(input.nextLine());
            for (int i = 0; i < salesPerson.getId().length(); i++) {
                while(salesPerson.getId().length() != 5 || salesPerson.getId().charAt(0) != 'S' ||
                 !Character.isDigit(salesPerson.getId().charAt(1)) || !Character.isDigit(salesPerson.getId().charAt(2))
                || !Character.isDigit(salesPerson.getId().charAt(3)) || !Character.isDigit(salesPerson.getId().charAt(4))
                || salesPerson.getId().contains(staffBase[i].getId())){
                    System.out.print("Invalid Input, please try again!!\n");
                    System.out.print("Please Enter the staff ID (Sxxxx): ");
                    salesPerson.setId(input.nextLine());
                }
            }

            System.out.print("Please enter the new staff Name: ");
            salesPerson.setName(input.nextLine());
            for(int i = 0; i < salesPerson.getName().length(); i++){
                while(!Character.isLetter(salesPerson.getName().charAt(i)) &&
                !Character.isWhitespace(salesPerson.getName().charAt(i))){
                    System.out.print("Invalid Input, please try again!!\n");
                    System.out.print("Please enter the staff Name: ");
                    salesPerson.setName(input.nextLine());
                }
            }

            System.out.print("Please enter the new staff Gender: ");
            salesPerson.setGender(input.nextLine());
            while(!salesPerson.getGender().toUpperCase().equals("MALE") &&
            !salesPerson.getGender().toUpperCase().equals("FEMALE")){
                System.out.print("Invalid Input, please try again!!\n");
                System.out.print("Please enter the staff Gender: ");
                salesPerson.setGender(input.nextLine());
            }

            System.out.print("Please enter the new staff Basic Salary: ");
            salesPerson.setBasicSalary(input.nextDouble());

            System.out.print("Please enter the new staff Allowance: ");
            salesPerson.setAllowance(input.nextDouble());

            input.nextLine();
            System.out.print("Comfirm to modify this record? (Y/N): ");
            salesPerson.setCfrm(input.nextLine().charAt(0));
            while (Character.toUpperCase(salesPerson.getCfrm()) != 'Y' && Character.toUpperCase(salesPerson.getCfrm()) != 'N') {
                System.out.print("Invalid input, please try again.");
                System.out.print("Continue to add another product? (Y/N): ");
                salesPerson.setCfrm(input.nextLine().charAt(0));
            }

            if(Character.toUpperCase(salesPerson.getCfrm()) == 'Y'){
                staffBase[salesPerson.getChoice()] = new SalesPerson(salesPerson.getId().toUpperCase(), salesPerson.getName().toUpperCase(),
                 salesPerson.getGender().toUpperCase(), salesPerson.getBasicSalary(), salesPerson.getAllowance());
                editStaff.listOfSalesPersons.set(salesPerson.getChoice()-1, staffBase[salesPerson.getChoice()]);
                
                System.out.println("No.\tStaff_ID\tName\t\t\tGender\t\tBasic_Salary\tAllowance\n");
                for (int i = 0; i < editStaff.getListOfStaff().size(); i++) {
                    System.out.println((i + 1) + "\t" + editStaff.getListOfStaff().get(i));
                }
            }

            System.out.print("Continue to modify more record? (Y/N): ");
            salesPerson.setCtn(input.nextLine().charAt(0));
            while (Character.toUpperCase(salesPerson.getCtn()) != 'Y' && Character.toUpperCase(salesPerson.getCtn()) != 'N') {
                System.out.print("Invalid input, please try again.");
                System.out.print("Continue to add another product? (Y/N): ");
                salesPerson.setCtn(input.nextLine().charAt(0));
            }
        }while(Character.toUpperCase(salesPerson.getCtn()) == 'Y');

    }

    public static void searchStaff(){
        Scanner input = new Scanner(System.in);
        SalesPersonBase searchStaff = new SalesPersonBase();
        SalesPerson salesPerson = new SalesPerson();

        System.out.print("+=======================+\n");
        System.out.print("|     Search Staff      |\n");
        System.out.print("+=======================+\n\n");

        for (int i = 0; i < searchStaff.getListOfStaff().size(); i++) {
            staffBase[i] = searchStaff.listOfSalesPersons.get(i);
        }

        do{
            int count = 0;

            System.out.print("+==================+\n");
            System.out.print("| Detail to Search |\n");
            System.out.print("+==================+\n");
            System.out.print("| 1. Staff ID      |\n");
            System.out.print("| 2. Staff Name    |\n");
            System.out.print("| 3. Staff Gender  |\n");
            System.out.print("| 4. Basic salary  |\n");
            System.out.print("| 5. Allowance     |\n");
            System.out.print("+==================+\n");

            System.out.print("Please select one of the staff detail to search: ");
            salesPerson.setChoice(input.nextInt());
            input.nextLine();
            while(salesPerson.getChoice() < 1 || salesPerson.getChoice() > 5){
                System.out.print("Invalid Input, Please try again!!!\n");
                System.out.print("\nPlease choose one of the options: ");
                salesPerson.setChoice(input.nextInt());
                input.nextLine();
            }

            switch(salesPerson.getChoice()){
                case 1:
                    System.out.print("Please enter the staff ID (Sxxxx): ");
                    salesPerson.setId(input.nextLine());
                    for (int i = 0; i < salesPerson.getId().length(); i++) {
                        while(salesPerson.getId().length() != 5 || salesPerson.getId().charAt(0) != 'S' ||
                        !Character.isDigit(salesPerson.getId().charAt(1)) || !Character.isDigit(salesPerson.getId().charAt(2))
                        || !Character.isDigit(salesPerson.getId().charAt(3)) || !Character.isDigit(salesPerson.getId().charAt(4))){
                            System.out.print("Invalid Input, please try again!!\n");
                            System.out.print("Please Enter the staff ID (Sxxxx): ");
                            salesPerson.setId(input.nextLine());
                        }
                    }

                    System.out.println("Staff_ID\tName\t\t\tGender\t\tBasic_Salary\tAllowance");
                    for(int i = 0; i < searchStaff.getListOfStaff().size(); i++){
                        if(staffBase[i].getId().toUpperCase().contains(salesPerson.getId().toUpperCase())) {
                            System.out.print(staffBase[i]);
                            count++;
                        }
                    }
                    System.out.printf("\n<** Total %d record founded **>\n", count);
                    break;

                case 2:
                    System.out.print("Please enter the staff Name: ");
                    salesPerson.setName(input.nextLine());
                    for(int i = 0; i < salesPerson.getName().length(); i++){
                        while(!Character.isLetter(salesPerson.getName().charAt(i)) &&
                        !Character.isWhitespace(salesPerson.getName().charAt(i))){
                            System.out.print("Invalid Input, please try again!!\n");
                            System.out.print("Please enter the staff Name: ");
                            salesPerson.setName(input.nextLine());
                        }
                    }
                    System.out.println("Staff_ID\tName\t\t\tGender\t\tBasic_Salary\tAllowance");
                    for(int i = 0; i < searchStaff.getListOfStaff().size(); i++){
                        if(staffBase[i].getName().toUpperCase().contains(salesPerson.getName().toUpperCase())) {
                            System.out.print(staffBase[i]);
                            count++;
                        }
                    }
                    System.out.printf("\n<** Total %d record founded **>\n", count);
                    break;

                case 3:
                    System.out.print("Please enter the staff Gender: ");
                    salesPerson.setGender(input.nextLine());
                    while(!salesPerson.getGender().toUpperCase().equals("MALE") &&
                    !salesPerson.getGender().toUpperCase().equals("FEMALE")){
                        System.out.print("Invalid Input, please try again!!\n");
                        System.out.print("Please enter the staff Gender: ");
                        salesPerson.setGender(input.nextLine());
                    }
                    System.out.println("Staff_ID\tName\t\t\tGender\t\tBasic_Salary\tAllowance");
                    for(int i = 0; i < searchStaff.getListOfStaff().size(); i++){
                        if(staffBase[i].getGender().toUpperCase().equals(salesPerson.getGender().toUpperCase())) {
                            System.out.print(staffBase[i]);
                            count++;
                        }
                    }
                    System.out.printf("\n<** Total %d record founded **>\n", count);
                    break;

                case 4:
                    System.out.print("Please enter the staff Basic Salary that below: ");
                    salesPerson.setBasicSalary(input.nextDouble());
                    System.out.println("Staff_ID\tName\t\t\tGender\t\tBasic_Salary\tAllowance");
                    for(int i = 0; i < searchStaff.getListOfStaff().size(); i++){
                        if(staffBase[i].getBasicSalary() <= salesPerson.getBasicSalary()) {
                            System.out.print(staffBase[i]);
                            count++;
                        }
                    }
                    System.out.printf("\n<** Total %d record founded **>\n", count);
                    input.nextLine();
                    break;

                case 5:
                    System.out.print("Please enter the staff Allowance that below: ");
                    salesPerson.setAllowance(input.nextDouble());
                    System.out.println("Staff_ID\tName\t\t\tGender\t\tBasic_Salary\tAllowance");
                    for(int i = 0; i < searchStaff.getListOfStaff().size(); i++){
                        if(staffBase[i].getAllowance() <= salesPerson.getAllowance()) {
                            System.out.print(staffBase[i]);
                            count++;
                        }
                    }
                    System.out.printf("\n<** Total %d record founded **>\n", count);
                    input.nextLine();
                    break;

                default:

            }

            System.out.print("Continue to search more record? (Y/N): ");
            salesPerson.setCtn(input.nextLine().charAt(0));
            while(Character.toUpperCase(salesPerson.getCtn()) != 'Y' && Character.toUpperCase(salesPerson.getCtn()) != 'N'){
                System.out.print("Invalid input, please try again!!\n");
                System.out.print("Continue to search more record? (Y/N): ");
                salesPerson.setCtn(input.nextLine().charAt(0));
            }
        }while(Character.toUpperCase(salesPerson.getCtn()) == 'Y');

    }
}