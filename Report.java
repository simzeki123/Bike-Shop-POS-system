import java.util.List;


public class Report {
	
	protected Bike bikeBought;
	protected Membership membership;
	protected SalesPerson salesPersonincharge;
	protected Payment payment;
	protected double contributionAmt ;
	protected BikeBase bikelist;

	
	
	public Report(){
		bikelist = getBikelist();
		bikeBought =  getBikeBought();
		membership = getMembership();
		salesPersonincharge = getSalesPersonincharge();
    	payment = getPayment();
		contributionAmt = getContributionAmt();
	}
	public BikeBase getBikelist() {
		return bikelist;

	}
	public void setBikelist(BikeBase bikelist) {
		this.bikelist = bikelist;
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

}