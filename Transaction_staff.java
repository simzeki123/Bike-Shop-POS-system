/**
 * @(#)Transaction_Staff.java
 *
 *
 * @author 
 * @version 1.00 2020/7/22
 */

public class Transaction_staff {
	
	private SalesPerson salesPersonincharge;
	private Payment paymenttyp;
	private double contributionAmt ;
	
//consturetor for staff transaction

    public Transaction_staff(SalesPerson salesPersonincharge,Payment paymenttyp,double conAmt) {
    	this.salesPersonincharge = salesPersonincharge;
    	this.paymenttyp = paymenttyp;
    	conAmt=contributionAmt;
    }
    
//geters
    public SalesPerson getStaffInCharge(){
    	return salesPersonincharge;
    }
    
    
    public Payment getPayment(){
    	return paymenttyp;
    }
    
    public double getContributionAmt(){
    	return contributionAmt;
    }
    
//setters
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