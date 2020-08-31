/**
 * @(#)Report.java
 *
 *
 * @author 
 * @version 1.00 2020/7/20
 */


public class Report {
	
	private Bike bikeBought;
	private Membership membership;
	private SalesPerson salesPersonincharge;
	private Payment paymenttyp;
	private double contributionAmt ;

	
	
    public Report(SalesPerson salesPersonincharge,Payment paymenttyp,double conAmt) {
		bikeBought = getBikeBought();
		membership = getMembership();
		this.salesPersonincharge = salesPersonincharge;
    	this.paymenttyp = paymenttyp;
		conAmt=contributionAmt;
    }
    
	
	public Bike getBikeBought() {
    	return bikeBought;
	}
	
    public Membership getMembership() {
    	return membership;
    }
	
	public SalesPerson getStaffInCharge(){
		return salesPersonincharge;
	}

	public Payment getPayment(){
		return paymenttyp;
	}

	public double getContributionAmt(){
		return contributionAmt;
	}

    public void setBikeBought(Bike bikeBought) {
    	this.bikeBought = bikeBought;
    }

    
    public void setMembership(Membership membership) {
		this.membership = membership;
	}

	public void setStaffInCharge(SalesPerson staffInCharge)
	{
	 	this.salesPersonincharge = staffInCharge;
	}
	
	public void setPayment(Payment paymenttyp)
	{
	 	this.paymenttyp = paymenttyp;
	}
	
	public void setContributionAmt(double contributionAmt)
	{
	 	this.contributionAmt = contributionAmt;
	}

}