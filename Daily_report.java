
public class Daily_report extends Report {

	String reportID;
	String report_time;

	public Daily_report() {

	}

	public void generate_report_ID(){
		
		Get_Date.date_Now();
	}
}
