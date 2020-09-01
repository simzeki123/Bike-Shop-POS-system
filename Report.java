import java.util.List;

/**
 * @(#)Report.java
 *
 *
 * @author 
 * @version 1.00 2020/7/20
 */


public class Report {
	
	protected List<Bike> bikeBought;
	protected Membership membership;
	protected List<SalesPerson> salesPersonincharge;
	private Payment paymenttyp;
	private double contributionAmt ;

	
	
    public Report(double conAmt) {
		bikeBought =  new BikeBase().getListOfBike();
		membership = getMembership();
		salesPersonincharge = new SalesPersonBase().getListOfStaff();
    	paymenttyp = getPayment();
		conAmt=contributionAmt;
    }
	
	
    public Membership getMembership() {
    	return membership;
    }
	

	public Payment getPayment(){
		return paymenttyp;
	}

	public double getContributionAmt(){
		return contributionAmt;
	}
    
    public void setMembership(Membership membership) {
		this.membership = membership;
	}
	
	public void setPayment(Payment paymenttyp)
	{
	 	this.paymenttyp = paymenttyp;
	}
	
	public void setContributionAmt(double contributionAmt)
	{
	 	this.contributionAmt = contributionAmt;
	}

	public void calContributeAmt(){
		
	}
}