import java.util.Scanner;

public class Daily_report extends Report {

	private String reportID;
	static String report_time;
	private String report_type;
	
	public Daily_report(double conAmt) {
		super(conAmt);
		reportID = getReportID();
		report_time = Get_Date_Time.generate_date_Time();
		report_type = getReport_Type();
	}

	public  String generate_report_ID(int choice){
		String generatedID = "null";
		String report_type_code = "null";
		int num_of_report = 0;
		String date = Get_Date_Time.generate_date_only();
		Scanner scan = new Scanner(System.in);
        
        switch(choice){
            case 1: report_type_code = "SD";
                break;
            case 2: report_type_code = "DSTF";
                break;
            case 3: report_type_code = "DSC";
                break;
            case 4: report_type_code = "MC";
                break;
            default:
				System.out.print("Invalid Input, Please try again.\n");
        }
		scan.close();

		num_of_report++;
		String numOfReport = String.valueOf(num_of_report);
		generatedID = report_type_code + date + numOfReport;
		System.out.println(generatedID);

		return generatedID;
	}

	public String getReport_Type()
	{
		return report_type;
	}

	public String getReportID(){
		return reportID;
	}

	public void setReportType(String report_type){
		this.report_type = report_type;
	}

	public void setReportID(String reportID){
		this.reportID=reportID;
	}
	
	public void print_basic_report(){
		System.out.printf("REPORTID :" + reportID);
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.printf("PAYMENT_ID 		MEMBER_ID		SALESPERSON_ID		TIME 		TRANSACTION AMMOUNT");
		System.out.printf(""+ bikeBought.get(1).getId() + "" + membership.getMemberID() + "" + "" + salesPersonincharge.get(1).getId() + "" + report_time + "" + conAmt + "");
		System.out.printf("Total amount :																		%lf");
	}

	public void print_staff_repot(){
		System.out.printf("REPORTID :" + reportID;
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.printf("PAYMENT_ID 		SALESPERSON_ID		SALESPERSON_NAME 	TRASCACTIONS MADE		TIME 		CONTRIBUTE AMMOUNT");
		System.out.printf(""+ PAYMENT_ID + "" + salesPersonincharge.get(1).getName()+ "" +""+salesPersonincharge.get(1).getName()+""+ TransactionID + "" + report_time + "" + conAmt + "");
		System.out.printf("Total amount :																		%lf");
	}

	public void print_stock_report(){
		System.out.printf("REPORTID :" + reportID)
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.printf("BIKE_ID	COLOUR BRAND PRICE AVALABILITY");
		System.out.print(bikeBought.get(1));
	}

	public void print_member_report(){
		System.out.printf("REPORTID :" + reportID)
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.printf("PAYMENT_ID 	  memberID		bike bought		TIME 		point gained");
		System.out.printf(""+ PAYMENT_ID + "" + membership.getMemberID() + "" + "" + SalesPerson + "" + "" + report_time + "" + conAmt + "");
		System.out.printf("Total amount :	%lf");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice;

		Daily_report report = new Daily_report(12345);
		System.out.print("+================================+\n");
		System.out.print("|        Pick report type        |\n");
		System.out.print("+================================+\n");
		System.out.print("| 1.  Standard daily             |\n");
		System.out.print("| 2.  Staff daily                |\n");
		System.out.print("| 3.  Stock daily                |\n");
		System.out.print("| 4.  Member daily               |\n");
		System.out.print("+================================+\n");

		try {
			choice = scan.nextInt();
		  } catch (Exception e) {
			System.out.println("Something went wrong.\n");
			if(choice !=(int)choice )
			System.out.println("Please enter an integer\n.");
		  }
		
		while(choice < 1 || choice > 4){
			
			switch(choice){
				case 1:  
				report.generate_report_ID(choice);
				report.print_basic_report();
					break;
				case 2: 
				report.generate_report_ID(choice);
				report.print_staff_repot();
					break;
				case 3: 
				report.generate_report_ID(choice);
				report.print_stock_report();
					break;
				case 4:  
				report.generate_report_ID(choice);
				report.print_member_report();
					break;
				default:
					System.out.print("Invalid Input, Please try again.\n");

            scan.close();
		}
		

    }

}
