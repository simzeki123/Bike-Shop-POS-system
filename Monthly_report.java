import java.lang.reflect.Member;
import java.util.Scanner;
public class Monthly_report extends Report{
    private int num_of_bike_used;
    private int num_of_transaction;
    private String reportID;
    static String report_time;
    
    public  Monthly_report(double contribution_Amt){
        super(contribution_Amt);
        num_of_bike_used = getNum_of_bike_used();
        num_of_transaction = getNum_of_trasaction();
    }

    public  String generate_report_ID(int choice){
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

    public int getNum_of_bike_used()
	{
		return num_of_bike_used;
    }
    
    public int getNum_of_trasaction()
	{
		return num_of_transaction;
	}

	public String getReportID(){
		return reportID;
    }
    
    public void displayMonthlyReport(){
        System.out.printf("REPORTID :" + reportID);
		System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf("Sales 		Number_of_Trasction_by_staff	BIKEID	    SALESPERSON_ID		TIME");
        System.out.ptintf(""+ conAmt + "" + num_of_transaction + "" + bikeBought.get(1).getId() + "" + salesPersonincharge.get(1).getId() + "" + report_time + "\n");
    }

    public void displayMonthlyReport_Mem(){
        System.out.printf("REPORTID :" + reportID);
		System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf("MemberID 	memberName	   Point_Earn		TIME");
        System.out.printf(""+ membership.getMemberID() + "" + membership.getName() + "" + bikeBought.get(1).getId()  + "" + report_time + "\n");
    }

    public void displayMonthlyReport_Stock(){
        System.out.printf("REPORTID :" + reportID);
		System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf("BIKE_ID  color  brand  price  BIKE USAGE COUNT");
        System.out.printf(""+ bikeBought.get(1).getId() + "" + bikeBought.get(1).getColor() + "" + bikeBought.get(1).getBrand()+"" +bikeBought.get(1).getPrice()+""+getNum_of_bike_used() +""+ report_time + "\n");
    }

    public void displayMonthlyReport_Staff(){
        System.out.printf("REPORTID :" + reportID);
		System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf("SALESPERSON_ID		SALESPERSON_NAME 	TRASCACTIONS MADE		TIME 		CONTRIBUTE AMMOUNT");
        System.out.printf(salesPersonincharge.get(1).getId()+ "" +""+salesPersonincharge.get(1).getName()+""+ TransactionID + "" + report_time + "" + conAmt + "");    }

	public void setReportID(String reportID){
		this.reportID=reportID;
	}
}