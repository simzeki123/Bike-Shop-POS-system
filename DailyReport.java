import java.util.ArrayList;

public class DailyReport extends Report_ {
    /**
     * Does nothing
     */
    public DailyReport() {

    }

    public DailyReport(ArrayList<Order> orders, ArrayList<Payment> payments, ReportType rtype) {
        super(orders, payments, rtype);
    }

    /**
     * Print report based on given report type
     * 
     * @see #DailyReport(ArrayList, ArrayList, ReportType)
     */
    public void printReport() {
        switch (rtype) {
            case STANDARD:
                print_basic_report();
                break;
            case STAFF:
                print_staff_report();
                break;
            case STOCK_COUNT:
                print_stock_report();
                break;
            case MEMBER:
                print_member_report();
                break;
            default:
                break;
        }
    }

    public void print_basic_report() {
        System.out.printf(
                "===================================================================\n");
        System.out.printf("		    Basic Daily Report\n");
        System.out.printf(
                "===================================================================\n");
        System.out.printf("REPORT TYP :" + rtype);
        System.out.printf("\n");
        System.out.printf(
                "PAYMENT_ID\t MEMBER_ID\t SALESPERSON_ID\t BIKE_ID\t TRANSACTION AMMOUNT\n");

        for (int i = 0; i < payments.size(); i++) {
            System.out.printf(
                    "" + payments.get(i).getPayment_id() + "\t " + payments.get(i).getOrder_member().getMemberID()
                            + "  \t" + payments.get(i).getOrder().getSalesPerson().getId() +
                             "\t\t " + payments.get(i).getOrder().getBike().getId()
                            + " \t\t" + payments.get(i).getTotal_sales_of_transaction() + "\n\n");
            contributionAmt += payments.get(i).getTotal_sales_of_transaction();
        }
        System.out.printf("Total amount :					                    %.2f\n",
                contributionAmt);
        System.out.printf(
                "========================================================================\n");
    }

    public void print_staff_report() {
         System.out.printf(
                "===================================================================\n");
        System.out.printf("		 Daily Staff Transaction Report\n");
        System.out.printf(
                "===================================================================\n");
        System.out.printf("REPORT TYP :" + rtype + "		      AS of:");
        Get_Date_Time.date_time_now();
        System.out.printf("\n");
        System.out.printf("PAYMENT_ID\tSALESPERSON_ID\tSALESPERSON_NAME\tCONTRIBUTE AMMOUNT\n");
        for (int i = 0; i < payments.size(); i++) {
            System.out.printf(""+ payments.get(i).getPayment_id() + "\t" + payments.get(i).getOrder_staff().getId()
                    + "\t\t" + payments.get(i).getOrder_staff().getName() + "\t\t"
                    + payments.get(i).getTotal_sales_of_transaction() + "\n");
            contributionAmt += payments.get(i).getTotal_sales_of_transaction();
        }
        System.out.printf("Total amount :                                                       %.2f\n",
                contributionAmt);
    }

    public void print_stock_report() {

        System.out.printf(
                "===================================================================\n");
        System.out.printf("		    Daily Stock Report\n");
        System.out.printf(
                "===================================================================\n");
        System.out.printf("REPORT TYP :" + rtype + "		      AS of:");
        Get_Date_Time.date_time_now();
        System.out.printf("\n");
        System.out.printf("BIKE_ID\t\tCOLOUR\t\tBRAND\t\tPRICE\t\tAVALABILITY\n");
        System.out.printf("=======\t\t======\t\t=====\t\t=====\t\t===========\n");
        int i = 0;

        // BikeBase bikeList = new BikeBase();
        for (i = 0; i < BikeBase.getListOfBike().size(); i++) {
            System.out.print(
                    BikeBase.getListOfBike().get(i).getId() + "\t\t" + BikeBase.getListOfBike().get(i).getColor()
                            + "\t\t" + BikeBase.getListOfBike().get(i).getBrand() + "\t\t"
                            + BikeBase.getListOfBike().get(i).getPrice() + "\t\t"
                            + BikeBase.getListOfBike().get(i).getAvailability() + "\n");
        }
    }

    public void print_member_report() {
        System.out.printf(
                "===================================================================\n");
        System.out.printf("	     Daily Customer Transaction Report\n");
        System.out.printf(
                "===================================================================\n");
        ;System.out.printf("REPORT TYP :" + rtype + "		      AS of:");
        Get_Date_Time.date_time_now();
        System.out.printf("\n");
        System.out.printf("PAYMENT_ID\tMember_ID\tMember_Name\tBike_Bought\tPayment used\n");
        for (int i = 0; i < payments.size(); i++) {
            System.out.printf("" + payments.get(i).getPayment_id() + "\t"
                    + payments.get(i).getOrder_member().getMemberID() + "\t\t" + payments.get(i).getOrder_member().getName()
                    + "   " + payments.get(i).getOrder().getBike().getId() + "\t\t"
                    + payments.get(i).getPayment_used() + "\n");
        }
    }
}
