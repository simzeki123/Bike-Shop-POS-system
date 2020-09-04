import java.util.ArrayList;
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
        Staff staff = new Staff();
        Membership member = new Membership();
        ArrayList<Order> orders = new ArrayList<Order>();
        ArrayList<Payment> payments = new ArrayList<Payment>();

        Scanner input = new Scanner(System.in);
        int choice = 0;
        do {
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

            try {
                choice = input.nextInt();
                while (choice < 1 || choice > 7) {
                    System.out.print("Invalid input!!\n");
                    System.out.print("<!! Please select between 1-6 !!>\n");
                    System.out.print("Please select one of the selection: ");
                    choice = input.nextInt();
                }

                switch (choice) {
                    case 1:
                        product.getProduct();
                        break;
                    case 2:
                        staff.getStaff();
                        break;

                    case 3:
                        member.member();
                        break;

                    case 4:
                        Order order = new Order();
                        order.order();
                        Payment payment = new Payment();
                        payment.setOrder(order);
                        payment.setOrder_member(order.getMember());
                        payment.setOrder_staff(order.getSalesPerson());
                        payment.payment(payment.calculate_total_sales_of_transaction());
                        orders.add(order);
                        payments.add(payment);
                        break;

                    case 5:
                        ReportType rtype = null;
                        Scanner scan = new Scanner(System.in);
                        int rtype_choice = -1;
                        System.out.print("+================================+\n");
                        System.out.print("|        Pick report type        |\n");
                        System.out.print("+================================+\n");
                        System.out.print("| 1.  Standard daily             |\n");
                        System.out.print("| 2.  Staff daily                |\n");
                        System.out.print("| 3.  Stock daily                |\n");
                        System.out.print("| 4.  Member daily               |\n");
                        System.out.print("| 5.  Exit	  	         |\n");
                        System.out.print("+================================+\n");
                        System.out.printf("Enter number between 1 - 4 :");

                        do {
                            System.out.printf("Please enter a number between 1 - 5 :");
                            try {
                                rtype_choice = scan.nextInt();
                            } catch (InputMismatchException e) {
                                scan.next();
                                System.out.println("Something went wrong.\n");
                            }
                        } while (rtype_choice < 1 || rtype_choice > 5);

                        // Ask for which report to print
                        boolean doNotPrintReport = false;
                        switch (rtype_choice) {
                            case 1:
                                rtype = ReportType.STANDARD;
                                break;
                            case 2:
                                rtype = ReportType.STAFF;
                                break;
                            case 3:
                                rtype = ReportType.STOCK_COUNT;
                                break;
                            case 4:
                                rtype = ReportType.MEMBER;
                                break;
                            case 5:
                                doNotPrintReport = true;
                            default:
                                System.out.print("Invalid Input, Please try again.\n");
                        }
                        System.out.println(rtype);
                        // If 5 is selected just skip
                        if (doNotPrintReport)
                            break;

                        // Pass in the data and call the print method
                        DailyReport dreport = new DailyReport(orders, payments, rtype);
                        dreport.printReport();
                        break;
                    case 6: // Monthly report

                        // Calculate total sales because its needed in Monthly report
                        double totalSales = 0;
                        for(int a=0; a<payments.size();a++) {
                            totalSales += payments.get(a).getTotal_sales_of_transaction();
                        }
                        Monthly_report mr = new Monthly_report(payments.size(), totalSales);
                        mr.displayMonthlyReport();
                        break;
                    case 7:
                    return;
                }
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Something went wrong\n");
                System.out.println("Please enter an integer\n");
            }
        } while (choice != 7);

        switch (choice) {
            case 1:
                product.getProduct();
                break;

            case 2:
                staff.getStaff();
                break;

            case 3:
            member.member();
                break;

            case 4:
            Order order = new Order();
                        order.order();
                        Payment payment = new Payment();
                        payment.setOrder(order);
                        payment.setOrder_member(order.getMember());
                        payment.setOrder_staff(order.getSalesPerson());
                        payment.payment(payment.calculate_total_sales_of_transaction());
                        orders.add(order);
                        payments.add(payment);
                break;

            case 5:
            ReportType rtype = null;
            Scanner scan = new Scanner(System.in);
            int rtype_choice = -1;
            System.out.print("+================================+\n");
            System.out.print("|        Pick report type        |\n");
            System.out.print("+================================+\n");
            System.out.print("| 1.  Standard daily             |\n");
            System.out.print("| 2.  Staff daily                |\n");
            System.out.print("| 3.  Stock daily                |\n");
            System.out.print("| 4.  Member daily               |\n");
            System.out.print("| 5.  Exit	  	         |\n");
            System.out.print("+================================+\n");
            System.out.printf("Enter number between 1 - 4 :");

            do {
                System.out.printf("Please enter a number between 1 - 5 :");
                try {
                    rtype_choice = scan.nextInt();
                } catch (InputMismatchException e) {
                    scan.next();
                    System.out.println("Something went wrong.\n");
                }
            } while (rtype_choice < 1 || rtype_choice > 5);

            // Ask for which report to print
            boolean doNotPrintReport = false;
            switch (rtype_choice) {
                case 1:
                    rtype = ReportType.STANDARD;
                    break;
                case 2:
                    rtype = ReportType.STAFF;
                    break;
                case 3:
                    rtype = ReportType.STOCK_COUNT;
                    break;
                case 4:
                    rtype = ReportType.MEMBER;
                    break;
                case 5:
                    doNotPrintReport = true;
                default:
                    System.out.print("Invalid Input, Please try again.\n");
            }
            System.out.println(rtype);
            // If 5 is selected just skip
            if (doNotPrintReport)
                break;

            // Pass in the data and call the print method
            DailyReport dreport = new DailyReport(orders, payments, rtype);
            dreport.printReport();
            break;
            case 6:
            double totalSales = 0;
                        for(int a=0; a<payments.size();a++) {
                            totalSales += payments.get(a).getTotal_sales_of_transaction();
                        }
                        Monthly_report mr = new Monthly_report(payments.size(), totalSales);
                        mr.displayMonthlyReport();
                break;

            case 7:
            return;

            default:
                System.out.print("Invalid input!!\n");
        }
    }
}
