/*
NEED ADD METHOD TO CALCULATE NUMBER OF TRANSACTION AND NUMBER OF TIME A CENTERN BIKE IS USED
NEED PASS IN RECORDS
NEED CAHNGE DISPLAY VALUES
*/
import java.util.InputMismatchException;
import java.util.Scanner;
public class Monthly_report extends Report{
    private int num_of_bike_used;
    private int num_of_transaction;
    private String reportID;
    static String report_time;
    
    public  Monthly_report(){
        num_of_bike_used = getNum_of_bike_used();
        num_of_transaction = getNum_of_trasaction();
    }

    public void calNum_Of_t(){

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
        System.out.printf(""+ payment.getTotal_sales_of_transaction() + "" + num_of_transaction + "" + bikeBought.getId() + "" + salesPersonincharge.getId() + "" + report_time + "\n");
    }

    public void displayMonthlyReport_Mem(){
        System.out.printf("REPORTID :" + reportID);
		System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf("MemberID 	memberName	   Point_Earn		TIME");
        System.out.printf(""+ membership.getMemberID() + "" + membership.getName() + "" + bikeBought.getId()  + "" + report_time + "\n");
    }

    public void displayMonthlyReport_Stock(){
        System.out.printf("REPORTID :" + reportID);
		System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf("BIKE_ID  color  brand  price  BIKE USAGE COUNT");
        System.out.printf(""+ bikeBought.getId() + "" + bikeBought.getColor() + "" + bikeBought.getBrand()+"" +bikeBought.getPrice()+""+getNum_of_bike_used() +""+ report_time + "\n");
    }

    public void calBikeUsage(){
        num_of_bike_used =0;

    }

    public void displayMonthlyReport_Staff(){
        System.out.printf("REPORTID :" + reportID);
		System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf("SALESPERSON_ID		SALESPERSON_NAME 	TRASCACTIONS MADE		TIME 		CONTRIBUTE AMMOUNT");
        System.out.printf(salesPersonincharge.getId()+ "" +""+salesPersonincharge.getName()+""+ "NUMBER OF TRANSACTION " + "" + report_time + "" + payment.getTotal_sales_of_transaction() + "");    }

	public void setReportID(String reportID){
		this.reportID=reportID;
    }
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = -1;

		Monthly_report report = new Monthly_report();
		System.out.print("+================================+\n");
		System.out.print("|        Pick report type        |\n");
		System.out.print("+================================+\n");
		System.out.print("| 1.  Standard Monthly           |\n");
		System.out.print("| 2.  Staff daily                |\n");
		System.out.print("| 3.  Stock daily                |\n");
		System.out.print("| 4.  Member daily               |\n");
		System.out.print("+================================+\n");
		System.out.printf("Enter number between 1 - 4 :");
		
		
		do{
			System.out.printf("Please enter a number between 1 - 4 :");
			try {
				choice = scan.nextInt();
			  } catch (InputMismatchException  e) {
				scan.next();
				System.out.println("Something went wrong.\n");}
}while(choice < 1 || choice > 4);
			
			switch(choice){
				case 1:  
				report.generate_report_ID(choice);
				report.displayMonthlyReport();
					break;
				case 2: 
				report.generate_report_ID(choice);
				report. displayMonthlyReport_Mem();
					break;
				case 3: 
				report.generate_report_ID(choice);
				report.displayMonthlyReport_Stock();
					break;
				case 4:  
				report.generate_report_ID(choice);
				report.displayMonthlyReport_Staff();
					break;
				default:
					System.out.print("Invalid Input, Please try again.\n");}
			
			
			
					scan.close();
}

}