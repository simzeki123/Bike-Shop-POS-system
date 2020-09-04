import java.util.ArrayList;

public class Report_ {
    protected String reportID;
    protected String reportTime;
    protected ArrayList<Order> orders;
    protected ArrayList<Payment> payments;
    protected ReportType rtype;
    /**
     * Final amount of all the transactions
     */
    protected double contributionAmt;

    /**
     * Does nothing
     */
    public Report_() {

    }

    /**
     * Constructor to create a Basic Report <br>
     * Assumes Orders and Payments are closly related and should have same size <br>
     * Contribution Amount is calculated upon report creation<br>
     * 
     * @param orders   Orders in the form of arraylist
     * @param payments Payments in the form of Array list
     * @param rtype    Report Type
     * @see ReportType
     */
    public Report_(ArrayList<Order> orders, ArrayList<Payment> payments, ReportType rtype) {
        this.orders = orders;
        this.payments = payments;
        this.rtype = rtype;
        for (int a = 0; a < payments.size(); a++) {
            contributionAmt += payments.get(a).getTotal_sales_of_transaction();
        }
    }

}
