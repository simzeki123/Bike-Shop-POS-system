/**
 * @(#)Transaction_Staff.java
 *
 *
 * @author 
 * @version 1.00 2020/7/22
 */

public class Transaction_staff {
	
	private SalesPerson salesPersonincharge;
	private Transactiontype transactiontyp;
	private double contributionAmt ;
	
//consturetor for staff transaction

    public Transaction_staff(SalesPerson salesPersonincharge,Transactiontype transactiontyp,double conAmt) {
    	transactionDate(date);
    	transactionID(ID);
    	this.salesPersonincharge = salesPersonincharge;
    	this.transactiontyp = transactiontyp;
    	conAmt=contributionAmt;
    }
    
//geters
    public SalesPerson getStaffInCharge(){
    	return salesPersonincharge;
    }
    
    
    public Transactiontype getTransactiontyp(){
    	return transactiontyp;
    }
    
    public double getContributionAmt(){
    	return contributionAmt;
    }
    
//setters
	public void setStaffInCharge(SalesPerson staffInCharge)
	{
	 	this.salesPersonincharge = staffInCharge;
	}
	
	public void setTransactiontyp(Transactiontype transactiontyp)
	{
	 	this.transactiontyp = transactiontyp;
	}
	
	public void setContributionAmt(double contributionAmt)
	{
	 	this.contributionAmt = contributionAmt;
	}
	