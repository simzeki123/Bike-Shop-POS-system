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
                "==================================================================================================================\n");
        System.out.printf("						Basic Daily Report\n");
        System.out.printf(
                "==================================================================================================================\n");
        System.out.printf("REPORTID :" + reportID);
        System.out.printf("\n\n");
        System.out.printf(
                "PAYMENT_ID 		MEMBER_ID		SALESPERSON_ID		TIME 		BIKE_ID		TRANSACTION AMMOUNT \n");

        for (int i = 0; i < payments.size(); i++) {
            System.out.printf(
                    "" + payments.get(i).getPayment_id() + "		" + payments.get(i).getOrder_member().getMemberID()
                            + "  	" + payments.get(i).getOrder().getSalesPerson().getId() + "		"
                            + payments.get(i).getDate() + "		" + payments.get(i).getOrder().getBike().getId()
                            + "		" + payments.get(i).getTotal_sales_of_transaction() + "		\n\n");
            contributionAmt += payments.get(i).getTotal_sales_of_transaction();
        }
        System.out.printf("Total amount :																		%.2f\n",
                contributionAmt);
        System.out.printf(
                "===================================================================================================================\n");
    }

    public void print_staff_report() {
        System.out.printf(
                "==================================================================================================================\n");
        System.out.printf("						Daily Staff Transaction Report	\n");
        System.out.printf(
                "==================================================================================================================\n");
        System.out.printf("REPORTID :" + reportID);
        System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf(
                "PAYMENT_ID 		SALESPERSON_ID		SALESPERSON_NAME 		TIME 		CONTRIBUTE AMMOUNT\n");
        for (int i = 0; i < payments.size(); i++) {
            System.out.printf("" + payments.get(i).getPayment_id() + "" + payments.get(i).getOrder_staff().getId() + ""
                    + "" + payments.get(i).getOrder_staff().getName() + "" + payments.get(i).getDate() + ""
                    + payments.get(i).getTotal_sales_of_transaction() + "\n");
            contributionAmt += payments.get(i).getTotal_sales_of_transaction();
        }
        System.out.printf("Total amount :																		%.2f\n",
                contributionAmt);
    }

    public void print_stock_report() {

        System.out.printf(
                "==================================================================================================================\n");
        System.out.printf("						Daily stock Report	\n");
        System.out.printf(
                "==================================================================================================================\n");
        System.out.printf("REPORTID :" + reportID + "									AS of:");
        Get_Date_Time.date_time_now();
        System.out.printf("\n");
        System.out.printf("BIKE_ID			COLOUR 			BRAND 			PRICE 			AVALABILITY\n");
        System.out.printf("=======			=======			===== 			===== 			===========\n");
        int i = 0;

        // BikeBase bikeList = new BikeBase();
        for (i = 0; i < BikeBase.getListOfBike().size(); i++) {
            System.out.print(
                    BikeBase.getListOfBike().get(i).getId() + "			 " + BikeBase.getListOfBike().get(i).getColor()
                            + "			" + BikeBase.getListOfBike().get(i).getBrand() + "			"
                            + BikeBase.getListOfBike().get(i).getPrice() + "			 "
                            + BikeBase.getListOfBike().get(i).getAvailability() + "\n");
        }
    }

    public void print_member_report() {
        System.out.printf(
                "==================================================================================================================\n");
        System.out.printf("						Daily Customer Trasacntion Report	\n");
        System.out.printf(
                "==================================================================================================================\n");
        System.out.printf("REPORTID :" + reportID);
        System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf("PAYMENT_ID 	  Member_ID		Member_Name		Bike_Bought		TIME 		Payment used\n");
        for (int i = 0; i < payments.size(); i++) {
            System.out.printf("" + payments.get(i).getPayment_id() + ""
                    + payments.get(i).getOrder_member().getMemberID() + "" + payments.get(i).getOrder_member().getName()
                    + "" + payments.get(i).getOrder().getBike().getId() + "" + payments.get(i).getDate() + ""
                    + payments.get(i).getPayment_used() + "\n");
        }
    }
}
