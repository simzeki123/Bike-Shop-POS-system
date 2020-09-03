import java.util.InputMismatchException;
import java.util.Scanner;

public class Daily_report extends Report {

	private String reportID;
	static String report_time;
	private String report_type;
	static String todays_records[];
	
	public Daily_report(double conAmt) {
		super(conAmt);
		reportID = getReportID();
		report_time = Get_Date_Time.generate_date_Time();
		report_type = getReport_Type();
		String todays_records[] = new String[20];
	}

	public  void generate_report_ID(int choice){
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

		reportID = generatedID;
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
	
	public void print_basic_report(Double conAmt) {
		System.out.printf("==================================================================================================================\n");
		System.out.printf("						Basic Daily Report\n");
		System.out.printf("==================================================================================================================\n");
		System.out.printf("REPORTID :" + reportID);
		System.out.printf("\n\n");
		System.out.printf("PAYMENT_ID 		MEMBER_ID		SALESPERSON_ID		TIME 			TRANSACTION AMMOUNT \n");
		System.out.printf(""+ bikeBought.getId() + "		" + membership.getMemberID() + "  	" + salesPersonincharge.getId() + "		" + report_time + "		" + conAmt + "		\n\n");
		System.out.printf("Total amount :																		\n");
		System.out.printf("===================================================================================================================\n");
	}

	public void print_staff_repot(){
		System.out.printf("==================================================================================================================\n");
		System.out.printf("						Daily Staff Trasacntion Report	\n");
		System.out.printf("==================================================================================================================\n");
		System.out.printf("REPORTID :" + reportID);
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.printf("PAYMENT_ID 		SALESPERSON_ID		SALESPERSON_NAME 	TRASCACTIONS MADE		TIME 		CONTRIBUTE AMMOUNT");
		System.out.printf(""+ payment.getPayment_id() + "" + salesPersonincharge.getId()+ "" +""+salesPersonincharge.getName()+""+ TransactionID + "" + report_time + "" + conAmt + "");
		System.out.printf("Total amount :																		%lf");
	}

	public void print_stock_report(){
		BikeBase displayBike = new BikeBase();
		
		System.out.printf("==================================================================================================================\n");
		System.out.printf("						Daily stock Report	\n");
		System.out.printf("==================================================================================================================\n");
		System.out.printf("REPORTID :" + reportID+"									AS of:");
		Get_Date_Time.date_time_now();
		System.out.printf("\n");
		System.out.printf("BIKE_ID			COLOUR 			BRAND 			PRICE 			AVALABILITY\n");
		System.out.printf("=======			=======			===== 			===== 			===========\n");
		int i = 0;
		for(i= 0;i< bikeBought.size();i++)
		{
		System.out.print( bikeBought.getId()+"			 "+bikeBought.getColor()+"			"+bikeBought.getBrand()+"			"+bikeBought.getPrice()+"			 "+bikeBought.getAvailability()+"\n");
		};
	}

	public void print_member_report(){
		System.out.printf("==================================================================================================================\n");
		System.out.printf("						Daily Customer Trasacntion Report	\n");
		System.out.printf("==================================================================================================================\n");
		System.out.printf("REPORTID :" + reportID);
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.printf("PAYMENT_ID 	  memberID		bike bought		TIME 		point gained");
		System.out.printf(""+ payment.getPayment_id() + "" + membership.getMemberID() + "" + "" + bikeBought.getId() + "" + report_time + "" + conAmt + "");
		System.out.printf("Total amount :	%lf");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = -1;

		Daily_report report = new Daily_report(12345);
		System.out.print("+================================+\n");
		System.out.print("|        Pick report type        |\n");
		System.out.print("+================================+\n");
		System.out.print("| 1.  Standard daily             |\n");
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
				report.print_basic_report(1000.00);
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
					System.out.print("Invalid Input, Please try again.\n");}
			
			
			
					scan.close();
}
}
