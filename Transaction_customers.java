/**
 * @(#)Transaction_Customers.java
 *
 *
 * @author 
 * @version 1.00 2020/7/22
 */


public class Transaction_customers {
	
	private Customer customerInvolved;
	private Bike bikeBought;
	private Membership membership;
	
    public Transaction_customers() {
    	customerInvolved = getCustomerInvolved();
    	bikeBought = getBikeBought();
    	membership = getMembership();
    }
    
    public Bike getBikeBought() {
    	return bikeBought;
    }
    
    public Customer getCustomerInvolved() {
    	return customerInvolved;
    }
    
    public Membership getMembership() {
    	return membership;
    }
    
    public void setBikeBought(Bike bikeBought) {
    	this.bikeBought = bikeBought;
    }
    
    public void setCustomerInvolved( Customer customerInvolved){
    	this.customerInvolved = customerInvolved;
    }
    
    public void setMembership(Membership membership) {
    	this.membership = membership;
    }
}