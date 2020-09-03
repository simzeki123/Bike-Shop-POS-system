import java.util.List;

/**
 * @(#)Report.java
 *
 *
 * @author 
 * @version 1.00 2020/7/20
 */


public class Report {
	
	protected Bike bikeBought;
	protected Membership membership;
	protected SalesPerson salesPersonincharge;
	protected Payment payment;
	private double contributionAmt ;

	
	
    public Report(double conAmt) {
		bikeBought =  getBikeBought();
		membership = getMembership();
		salesPersonincharge = getSalesPersonincharge();
    	payment = getPayment();
		conAmt=contributionAmt;
	}
	
	public SalesPerson getSalesPersonincharge() {
		return salesPersonincharge;
	}

	public Bike getBikeBought() {
		return bikeBought;
	}
	
    public Membership getMembership() {
    	return membership;
    }
	

	public Payment getPayment(){
		return payment;
	}

	public double getContributionAmt(){
		return contributionAmt;
	}
    
    public void setMembership(Membership membership) {
		this.membership = membership;
	}
	
	public void setBikeBought(Bike bikeBought){
		this.bikeBought = bikeBought;
	}

	public void setSalesPersonincharge(SalesPerson salesPersonincharge){
		this.salesPersonincharge = salesPersonincharge;
	}

	public void setPayment(Payment payment)
	{
	 	this.payment = payment;
	}
	
	public void setContributionAmt(double contributionAmt)
	{
	 	this.contributionAmt = contributionAmt;
	}

	public void calContributeAmt(){
		
	}
}