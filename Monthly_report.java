import java.util.Scanner;

public class Monthly_report extends Report_OLD {
    private Double total_sales;
    private int total_transaction;
    private String reportID;
    static String report_time;

    public Monthly_report(int totalTrans, double totalSales) {
        total_transaction = totalTrans;
        total_sales = totalSales;
    }

    public void calNum_Of_t() {
        total_transaction += payment_records.size();
    }

    public void calTot_sales() {
        for (int i = 0; i < payment_records.size(); i++)
            total_sales += payment_records.get(i).getTotal_sales_of_transaction();
    }

    public String generate_report_ID(int choice) {
        String generatedID = "null";
        String report_type_code = "M";
        int num_of_report = 0;
        String date = Get_Date_Time.generate_date_only();
        num_of_report++;
        String numOfReport = String.valueOf(num_of_report);
        generatedID = report_type_code + date + numOfReport;
        System.out.println(generatedID);

        return generatedID;
    }

    public Double getTotal_sales() {
        return total_sales;
    }

    public int getTotal_transaction() {
        return total_transaction;
    }

    public void setTotal_sales(Double total_sales) {
        this.total_sales = total_sales;
    }

    public void setTotal_transaction(int total_transaction) {
        this.total_transaction = total_transaction;
    }

    public String getReportID() {
        return reportID;
    }

    public void displayMonthlyReport() {
        Scanner scan = new Scanner(System.in);
        if (false) {
            System.out.println("There are no records of transaction to be found.\n");
            System.out.println("Enter anything to exit model :");
            scan.next();
            
            return;
        }

        System.out.printf("REPORTID :" + reportID);
        System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf("Sales\tTotal Transaction\tTIME\n");
        System.out.printf(total_sales + "\t" + total_transaction + "\n"); 
        
    }
}
/*
 * public static void main(String[] args) {
 * 
 * Monthly_report report = new Monthly_report(); } }
 */