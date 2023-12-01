package demo;

public class ClientAccount {

	private String name;
	private double funds;
	private String currency;
	
	
	public ClientAccount() {
        // Initialize default values or leave fields uninitialized
    }
	public ClientAccount(String currency, double initialFunds,String name) {
		
		this.name=name;
		this.currency=currency;
		this.funds= initialFunds;
		
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	
	public void setFunds(double funds) {
		this.funds = funds;
	}
	public String getName() {
		return name;
	}


	public double getFunds() {
		return funds;
	}


	public void addFunds(double amount) {
		this.funds += amount;
	}
	
	public boolean  removeFunds (double amount ) {
		
		if(funds -amount >0) {
			this.funds -= amount;
			System.out.println("HAS ON ACCOUNT: "+funds );
			return true;
			
		}
		return false;
	}
	


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}


	
	
	

}
