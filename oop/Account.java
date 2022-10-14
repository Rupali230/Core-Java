package in.com.rays.oop;

public class Account {
	
	private String number;
	
	private String accounttype ;
	
	private double balance;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccounttype() {
  		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
    

    public  void paybill(double pb) {
    	this.balance=this.balance-pb;
    }
    
    public void withdraw(double W) {
    	this.balance= this.balance-W;
    	}
    
    public void deposite (double ds) {
    	this.balance =ds+this.balance ;
    
    
    			
    }
}