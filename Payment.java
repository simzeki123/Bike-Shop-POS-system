public class Payment {
private double total_sales_of_transaction;
private String payment_id;
private int choice;
private String payment_used;
private double discounts;
private String cerdit_card_ID;
private String date;
private Order order;
private Bike bike_ordered;
private Membership order_member;

public void calculate_total_sales_of_transaction(){
    char ismember = 'n';
    discounts = 1;
    String member_typ = "null";
    member_typ = order_member.getMemberType();
    total_sales_of_transaction =bike_ordered.getPrice();
    ismember = order.getIsMember();
    if(Character.toUpperCase(ismember)== 'Y'){
        if( member_typ=="Premium"){discounts = 0.85;}
        else{discounts = 0.9;}
    }
    total_sales_of_transaction = total_sales_of_transaction * discounts;
    }

public void payment(double total_sales_of_transaction){
    String payment_typ = "";
    Scanner scan = new Scanner(System.in);

    System.out.printf("Which payment type do you wish to use?\n");
    System.out.printf("1. Cash\n");
    System.out.printf("2. Card\n");
    System.out.printf("Please enter your choice :");
do{
    try {
        choice = scan.nextInt();
    } catch (InputMismatchException e) {
        scan.next();
        System.out.println("Something went wrong\n");
        System.out.println("Please enter an integer\n");
    }
}while(choice < 1 || choice > 2);

   if(choice == 2){
    boolean valid_ccN = false;
    System.out.println("Please enter your credit card number (16 DIGIT) :");
    cerdit_card_ID = scan.nextLine();
    while(valid_ccN == false)
    {
    valid_ccN = verifiying_payment(cerdit_card_ID);
    }
    System.out.println("Your payment has been accpeted.\n");
    payment_typ = "CC";
   }
   else{
    verifiying_payment(); 
    payment_typ = "C";
}
payment_id = generate_payment_ID(payment_typ);

    scan.close();
}

public void verifiying_payment(){
    Scanner scan = new Scanner(System.in);
    double total = getTotal_sales_of_transaction();
    double pay = 0;
    double remainder =0;
    System.out.println("Enter the amount of payment :");

    try {
    pay = scan.nextInt();
    }
    catch(InputMismatchException e){
    scan.next();
    System.out.println("Something went wrong\n");
    System.out.println("Please enter an integer\n");
    }
    while(pay < total)
    {
        System.out.println("The payment is insufficent to cover the fee.\n");
        System.out.println("Please reenter a sufficent amount to cover " + total + ": RM");
        try {
            pay = scan.nextInt();
            }
            catch(InputMismatchException e){
            scan.next();
            System.out.println("Something went wrong\n");
            System.out.println("Please enter an integer\n");
            }
    }
    remainder = pay - total;
    System.out.println("Payment successful.\n");
    System.out.printf("Here is your chanage :RM %.2lf",remainder);
    scan.close();
}

public boolean verifiying_payment(String ccNum){ // this is a method that uses Luhn algorithm that checks validity of a credit card number
    int sum = 0;
    boolean alternate = false;
    for (int i = ccNum.length() - 1; i >= 0; i--)
    {
            int n = Integer.parseInt(ccNum.substring(i, i + 1));// parseInt turns the string into int, substiring will allow to check altenating numbs
            if (alternate)
            {
                    n *= 2; 
                    if (n > 9)
                    {
                            n = (n % 10) + 1;
                    }
            }
            sum += n;
            alternate = !alternate;
    }
    return (sum % 10 == 0); //if the credit card is valid sum % 10 will == 0;
}

public  String generate_payment_ID(String pty){
    String generatedID = "null";
    String trascation_code = pty;
    int num_of_payment = 0;
    String date = Get_Date_Time.generate_date_only();        
    num_of_payment++;
    String numOfPayment = String.valueOf(num_of_payment);
    generatedID = trascation_code + date + numOfPayment;

    return  generatedID;
}


    public void setTotal_sales_of_transaction(double total_sales_of_transaction) {
        this.total_sales_of_transaction = total_sales_of_transaction;
    }
    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }
    public void setChoice(int choice) {
        this.choice = choice;
    }
    public void setPayment_used(String payment_used) {
        this.payment_used = payment_used;
    }
    public void setDiscounts(double discounts) {
        this.discounts = discounts;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public Bike getBike_ordered() {
        return bike_ordered;
    }
    public void setBike_ordered(Bike bike_ordered) {
        this.bike_ordered = bike_ordered;
    }
    
    public double getTotal_sales_of_transaction() {
        return total_sales_of_transaction;
    }

    public String getPayment_id(){
        return payment_id;
    }

    public int getChoice() {
        return choice;
    }
    public String getPayment_used() {
        return payment_used;
    }
    public double getDiscounts() {
        return discounts;
    }
    public String getDate() {
        return date;
    }
    public static void main(String[] args) {
       Payment pay = new Payment();
    }
}