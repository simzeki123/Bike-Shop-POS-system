import java.util.Scanner;

public class Daily_report extends Report {

	private String reportID;
	static String report_time;
	private String report_type;
	
	public Daily_report() {
		
	}

	public static String generate_report_ID(int choice){
		String generatedID = "null";
		String report_type_code = "null";
		int num_of_report = 0;
		String date = Get_Date_Time.generate_date_only();
		Scanner scan = new Scanner(System.in);


        while(choice < 1 || choice > 4){
			System.out.print("Invalid Input, Please try again!!!\n");
			
            System.out.print("+================================+\n");
        	System.out.print("|        Pick report type        |\n");
        	System.out.print("+================================+\n");
        	System.out.print("| 1.  Standard daily             |\n");
        	System.out.print("| 2.  Staff daily                |\n");
        	System.out.print("| 3.  Stock daily                |\n");
        	System.out.print("| 4.  Member daily               |\n");
        	System.out.print("+================================+\n");

            choice = scan.nextInt();
        }
        
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

	public static void main(String[] args) {
		generate_report_ID(1);
    }

}
