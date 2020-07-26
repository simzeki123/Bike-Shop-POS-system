/**
 * @(#)Transaction_Customers.java
 *
 *
 * @author 
 * @version 1.00 2020/7/22
 */

public class Transaction_staff {
	
	private Staff staffInCharge;
	private Transactiontype transactiontyp;
	private double contributionAmt ;
	
//consturetor for staff transaction

    public Transaction_staff(Staff staffInCharge,Transactiontype transactiontyp,double conAmt) {
    	transactionDate(date);
    	transactionID(ID);
    	this.staffInCharge =staffInCharge;
    	this.transactiontyp = transactiontyp;
    	conAmt=contributionAmt;
    }
    
//geters
    public Staff getStaffInCharge(){
    	return staffInCharge;
    }
    
    
    public Transactiontype getTransactiontyp(){
    	return transactiontyp;
    }
    
    public getContributionAmt(){
    	return contributionAmt;
    }
    
//setters
	public void setStaffInCharge(Staff staffInCharge)
	{
	 	this.staffInCharge = staffInCharge;
	}
	
	public void setTransactiontyp(Transactiontype transactiontyp)
	{
	 	this.transactiontyp = transactiontyp;
	}
	
	public void setContributionAmt(double contributionAmt)
	{
	 	this.contributionAmt = contributionAmt;
	