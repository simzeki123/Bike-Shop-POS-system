import java.util.InputMismatchException;
import java.util.Scanner;

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
    private SalesPerson order_staff;

    public Payment() {
        
    }

    public Payment(Bike bike_ordered, SalesPerson order_staff, Membership order_member, String payment_id,
            String payment_used, double total_sales_of_transaction) {
        this.bike_ordered = bike_ordered;
        this.order_staff = order_staff;
        this.order_member = order_member;
        this.payment_id = payment_id;
        this.payment_used = payment_used;
        this.total_sales_of_transaction = total_sales_of_transaction;
    }

    // ============================================
    // CALCULATES total of the slaes of the trasction
    public double calculate_total_sales_of_transaction() {
        char ismember = 'n';
        discounts = 1;
        String member_typ = "null";
        ismember = order.getIsMember();
        member_typ = order_member.getMemberType();

        total_sales_of_transaction = order.getBike().getPrice();

        if (Character.toUpperCase(ismember) == 'Y') {
            if (member_typ == "Premium") {
                discounts = 0.85;
            } else {
                discounts = 0.9;
            }
        }
        double price = total_sales_of_transaction * discounts;
        return price;
    }

    // ============================================
    // @Method over loading verifiying payment
    // checks if cash payment is sufficent
    public void verifiying_payment() {
        Scanner scan = new Scanner(System.in);
        double total = getTotal_sales_of_transaction();
        double pay = 0;
        double remainder = 0;
        System.out.println("Enter the amount of payment :");

        try {
            pay = scan.nextDouble();
        } catch (InputMismatchException e) {
            scan.next();
            System.out.println("Something went wrong\n");
            System.out.println("Please enter an integer\n");
        }
        while (pay < total) {
            System.out.println("The payment is insufficent to cover the fee.\n");
            System.out.println("Please reenter a sufficent amount to cover " + total + ": RM");
            try {
                pay = scan.nextInt();
            } catch (InputMismatchException e) {
                scan.next();
                System.out.println("Something went wrong\n");
                System.out.println("Please enter an integer\n");
            }
        }
        remainder = pay - total;
        System.out.println("Payment successful.\n");
        System.out.printf("Here is your change :RM %.2f\n", remainder);
    }

    // ============================================
    // @Method over loading verifiying payment
    // checks if credit card is valid
    public boolean verifiying_payment(String ccNum) { // this is a method that uses Luhn algorithm that checks validity
                                                      // of a credit card number
        int sum = 0;
        boolean alternate = false;
        for (int i = ccNum.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(ccNum.substring(i, i + 1));// parseInt turns the string into int, substiring will
                                                                // allow to check altenating numbs
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0); // if the credit card is valid sum % 10 will == 0;
    }

    // ============================================
    // generate payment
    public String generate_payment_ID(String pty) {
        String generatedID = "null";
        String trascation_code = pty;
        int num_of_payment = 0;
        String date = Get_Date_Time.generate_date_only();
        num_of_payment++;
        String numOfPayment = String.valueOf(num_of_payment);
        generatedID = trascation_code + date + numOfPayment;
        return generatedID;
    }

    // ============================================
    // print a summary of payment
    public void printPaymentSummary() {
        System.out.print("+========================+\n");
        System.out.print("|     Payment Summary     |\n");
        System.out.print("+========================+\n");
        System.out.printf("Payment_ID: %s\n", payment_id);
        System.out.printf("STAFF_NAME: %s\t\t\tSTAFF_ID  : %s\n", order_staff.getName().toUpperCase(),
                order_staff.getId());
        System.out.printf("CUST_NAME : %s\t\tCurrent_Date: %s\n", order_member.getName().toUpperCase(),
                java.time.LocalDate.now());
        System.out.printf("CUST_ICNO : %s\t\tCurrent_Time: %s\n", order_member.getMemberIC(),
                java.time.LocalTime.now());
        System.out.print("----------------------------------------------------------------\n");
        System.out.printf("Total      : %.2f\n", total_sales_of_transaction);
        System.out.printf("Payment Type Used   : %s\n", payment_used);
        System.out.printf("Bike Brand   : %s\n", order.getBike().getBrand());
        System.out.printf("Bike Price   : %.2f\n", order.getBike().getPrice());
        System.out.println("\n");
        System.out.println("\n");
    }

    // ==============================================================================
    // GETTERS SETTERS
    public void setOrder(Order order) {
        this.order = order;
    }

    public void setOrder_member(Membership order_member) {
        this.order_member = order_member;
    }

    public void setOrder_staff(SalesPerson order_staff) {
        this.order_staff = order_staff;
    }

    public void setCerdit_card_ID(String cerdit_card_ID) {
        this.cerdit_card_ID = cerdit_card_ID;
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

    public Membership getOrder_member() {
        return order_member;
    }

    public SalesPerson getOrder_staff() {
        return order_staff;
    }

    public double getTotal_sales_of_transaction() {
        return total_sales_of_transaction;
    }

    public Order getOrder() {
        return order;
    }

    public String getPayment_id() {
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

    // ====================================================================
    // MAIN PAYMENT CODE
    public void payment(double total_sales_of_transaction) {
        String payment_typ = "";
        Scanner scan = new Scanner(System.in);

        System.out.printf("Which payment type do you wish to use?\n");
        System.out.printf("1. Cash\n");
        System.out.printf("2. Card\n");
        

        do {
            System.out.printf("Please enter your choice :");
            try {
                choice = scan.nextInt();
            } catch (InputMismatchException e) {
                scan.next();
                System.out.println("Something went wrong.\n");
            }
        } while (choice<1 || choice >2);

            


        if (choice == 2) {
            boolean valid_ccN = false;
            cerdit_card_ID = scan.nextLine();
            while (valid_ccN == false) {
                valid_ccN = verifiying_payment(cerdit_card_ID);
                if(valid_ccN == true){break;}
                scan.next();
                System.out.println("Please enter a valid CC number :");
                cerdit_card_ID = scan.nextLine();
            }

            System.out.println("Your payment has been accpeted.\n");
            payment_typ = "CC";
            payment_used = "CARD";

        } else {
            verifiying_payment();
            payment_typ = "C";
            payment_used = "CASH";

        }

        payment_id = generate_payment_ID(payment_typ);
        printPaymentSummary();
    }
}
