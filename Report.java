import java.util.List;
import java.util.ArrayList;


public class Report {
	
	protected Bike bikeBought;
	protected Membership membership;
	protected SalesPerson salesPersonincharge;
	static List <Payment> transaction_records;
	protected Payment payment;
	protected Order order;
	protected double contributionAmt ;
	protected BikeBase bikelist;
	protected int numOfTransaction;
	
	
	public Report(){
		bikelist = getBikelist();
		bikeBought =  getBikeBought();
		membership = getMembership();
		salesPersonincharge = getSalesPersonincharge();
    	transaction_records = getTransaction_records();
		contributionAmt = getContributionAmt();
	}

	public void store_records(){
		transaction_records = new ArrayList<>();
		
		Payment [] payments = new Payment[100];
		
		payments[0] = new Payment(payment.getBike_ordered(),payment.getOrder_staff(),payment.getOrder_member(),payment.getPayment_id(),payment.getPayment_used(),payment.getTotal_sales_of_transaction());
		
		transaction_records.add(payments[0]);

		numOfTransaction = transaction_records.size();
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
		return transaction_records;
	}
	
	public double getContributionAmt(){
		return contributionAmt;
	}
	
	public void setTransaction_records(List<Payment> transaction_records) {
		Report.transaction_records = transaction_records;
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