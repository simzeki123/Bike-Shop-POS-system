/**
 * @(#)monthly_report.java
 *
 *
 * @author 
 * @version 1.00 2020/7/20
 */


public class Report {
	
	private Transaction_customers customerreport;
	private Transaction_staff staffreport;
    public Report() {
    	
    }
    
	public Transaction_customers getCustomerreport() {
		return customerreport;
	}
	
	public void setCustomerreport(Transaction_customers customerreport) {
		this.customerreport = customerreport;
	}
	
	public Transaction_staff getStaffreport() {
		return staffreport;
	}
	public void setStaffreport(Transaction_staff staffreport) {
		this.staffreport = staffreport;
	}
    
    
}