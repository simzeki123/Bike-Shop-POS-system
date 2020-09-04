import java.util.InputMismatchException;
import java.util.Scanner;

public class Daily_report extends Report {

	private String reportID;
	static String report_time;
	private String report_type;

	public Daily_report() {

		reportID = getReportID();
		report_time = Get_Date_Time.generate_date_Time();
		report_type = getReport_Type();
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
	
	public void print_basic_report() {
		System.out.printf("==================================================================================================================\n");
		System.out.printf("						Basic Daily Report\n");
		System.out.printf("==================================================================================================================\n");
		System.out.printf("REPORTID :" + reportID);
		System.out.printf("\n\n");
		System.out.printf("PAYMENT_ID 		MEMBER_ID		SALESPERSON_ID		TIME 		BIKE_ID		TRANSACTION AMMOUNT \n");
		
		for(int i = 0;i < transaction_records.size();i++)
		{		System.out.printf(""+ transaction_records.get(i).getPayment_id() + "		" + transaction_records.get(i).getOrder_member().getMemberID() + "  	" + transaction_records.get(i).getOrder_staff().getId() + "		" + transaction_records.get(i).getDate() + "		"+ transaction_records.get(i).getBike_ordered().getId()+"		" +transaction_records.get(i).getTotal_sales_of_transaction() + "		\n\n");
		contributionAmt += transaction_records.get(i).getTotal_sales_of_transaction();
	}
		System.out.printf("Total amount :																		%.2lf\n",contributionAmt);
		System.out.printf("===================================================================================================================\n");
	}

	public void print_staff_repot(){
		System.out.printf("==================================================================================================================\n");
		System.out.printf("						Daily Staff Transaction Report	\n");
		System.out.printf("==================================================================================================================\n");
		System.out.printf("REPORTID :" + reportID);
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.printf("PAYMENT_ID 		SALESPERSON_ID		SALESPERSON_NAME 		TIME 		CONTRIBUTE AMMOUNT");
		for(int i = 0;i < transaction_records.size();i++){
		System.out.printf(""+ transaction_records.get(i).getPayment_id() + "" + transaction_records.get(i).getOrder_staff().getId()+ "" +""+transaction_records.get(i).getOrder_staff().getName()+"" + transaction_records.get(i).getDate() + "" + transaction_records.get(i).getTotal_sales_of_transaction() + "");
		contributionAmt += transaction_records.get(i).getTotal_sales_of_transaction();
		}
		System.out.printf("Total amount :																		%.2lf\n",contributionAmt);
	}

	public void print_stock_report(){
		
		System.out.printf("==================================================================================================================\n");
		System.out.printf("						Daily stock Report	\n");
		System.out.printf("==================================================================================================================\n");
		System.out.printf("REPORTID :" + reportID+"									AS of:");
		Get_Date_Time.date_time_now();
		System.out.printf("\n");
		System.out.printf("BIKE_ID			COLOUR 			BRAND 			PRICE 			AVALABILITY\n");
		System.out.printf("=======			=======			===== 			===== 			===========\n");
		int i = 0;
		BikeBase bikeList = new BikeBase();
		for(i= 0;i< bikeList.getListOfBike().size();i++)
		{
			System.out.print( bikeList.getListOfBike().get(i).getId()+"			 "+bikeList.getListOfBike().get(i).getColor()+"			"+bikeList.getListOfBike().get(i).getBrand()+"			"+bikeList.getListOfBike().get(i).getPrice()+"			 "+bikeList.getListOfBike().get(i).getAvailability()+"\n");
		}
	}

	public void print_member_report(){
		System.out.printf("==================================================================================================================\n");
		System.out.printf("						Daily Customer Trasacntion Report	\n");
		System.out.printf("==================================================================================================================\n");
		System.out.printf("REPORTID :" + reportID);
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.printf("PAYMENT_ID 	  Member_ID		Member_Name		Bike_Bought		TIME 		Payment used");
		for(int i = 0;i < transaction_records.size();i++){
		System.out.printf(""+ transaction_records.get(i).getPayment_id() + "" + transaction_records.get(i).getOrder_member().getMemberID() +""+ transaction_records.get(i).getOrder_member().getName() + "" + transaction_records.get(i).getBike_ordered().getId() + "" + transaction_records.get(i).getDate()+ "" +transaction_records.get(i).getPayment_used());
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = -1;
		if(transaction_records == null){
		System.out.println("There are no records of transaction to be found.\n");
		System.out.println("Enter anything to exit model :");
		scan.next();
		scan.close();
		return;	
		}
		Daily_report report = new Daily_report();
		System.out.print("+================================+\n");
		System.out.print("|        Pick report type        |\n");
		System.out.print("+================================+\n");
		System.out.print("| 1.  Standard daily             |\n");
		System.out.print("| 2.  Staff daily                |\n");
		System.out.print("| 3.  Stock daily                |\n");
		System.out.print("| 4.  Member daily               |\n");
		System.out.print("| 5.  Exit	  	               |\n");
		System.out.print("+================================+\n");
		System.out.printf("Enter number between 1 - 4 :");
		
		
		do{
			System.out.printf("Please enter a number between 1 - 5 :");
			try {
				choice = scan.nextInt();
			  } catch (InputMismatchException  e) {
				scan.next();
				System.out.println("Something went wrong.\n");}
		}while(choice < 1 || choice > 5);
			
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
				case 5:
				scan.close();
				return;
				default:
					System.out.print("Invalid Input, Please try again.\n");}
			
			
			
					scan.close();
}
}
