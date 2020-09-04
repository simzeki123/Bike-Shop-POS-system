import java.util.List;
import java.util.ArrayList;


public class Report_OLD {
	
	protected Bike bikeBought;
	protected Membership membership;
	protected SalesPerson salesPersonincharge;
	static List <Payment> payment_records;
	protected Payment payment;
	protected Order order;
	protected double contributionAmt;
	protected BikeBase bikelist;
	protected int numOfTransaction;
	
	
	public Report_OLD(){
		bikelist = getBikelist();
		bikeBought =  getBikeBought();
		membership = getMembership();
		salesPersonincharge = getSalesPersonincharge();
    	payment_records = getTransaction_records();
		contributionAmt = getContributionAmt();
	}

	public void store_records(){
		payment_records = new ArrayList<>();
		
		Payment [] payments = new Payment[100];
		
		payments[0] = new Payment(payment.getBike_ordered(),payment.getOrder_staff(),payment.getOrder_member(),payment.getPayment_id(),payment.getPayment_used(),payment.getTotal_sales_of_transaction());
		
		payment_records.add(payments[0]);

		numOfTransaction = payment_records.size();
	}

	public int getNumOfTransactionn() {
		return numOfTransaction;
	}

	public Payment getPayment() {
		return payment;
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
	public List<Payment> getTransaction_records() {
		return payment_records;
	}
	
	public double getContributionAmt(){
		return contributionAmt;
	}
	
	public void setTransaction_records(List<Payment> transaction_records) {
		Report_OLD.payment_records = transaction_records;
	}

	public void setNumOfTransactionn(int numOfTransaction) {
		this.numOfTransaction = numOfTransaction;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
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


	public void setContributionAmt(double contributionAmt)
	{
	 	this.contributionAmt = contributionAmt;
	}

}