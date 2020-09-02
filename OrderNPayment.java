/**
 * @(#)Payment.java
 *
 *
 * @author 
 * @version 1.00 2020/7/22
 */


public class OrderNPayment {
private double total_sales_of_transaction;
private String payment_id;
private int choice;
private String payment_used;
private double discounts;
private String date;

    public OrderNPayment() {

    }
    
    public void setTotal_sales_of_transaction(double total_sales_of_transaction) {
        this.total_sales_of_transaction = total_sales_of_transaction;
    }
    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }
    public void setChoice(int choice) {
        this.choice = choice;
    }
    public void setPayment_used(String payment_used) {
        this.payment_used = payment_used;
    }
    public void setDiscounts(double discounts) {
        this.discounts = discounts;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public double getTotal_sales_of_transaction() {
        return total_sales_of_transaction;
    }

    public String getPayment_id(){
        return payment_id;
    }

    public int getChoice() {
        return choice;
    }
    public String getPayment_used() {
        return payment_used;
    }
    public double getDiscounts() {
        return discounts;
    }
    public String getDate() {
        return date;
    }

}