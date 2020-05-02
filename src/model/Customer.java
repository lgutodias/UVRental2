package model;

public class Customer {
	private String FName;
	private String LName;
	private String Email;
	private int id;
	private int debitcard;
	private int creditcard;
	
	public Customer setFName(String FName) {
		this.FName = FName;
		return this;
	}
	public String getFName() {
		return this.FName;
	}
	public Customer setLName(String LName) {
		this.LName = LName;
		return this;
	}
	public String geLName() {
		return this.LName;
	}
	public Customer setEmail(String Email) {
		this.Email = Email;
		return this;
	}
	public String getEmail() {
		return this.Email;
	}
	public Customer setId(int id) {
		this.id = id;
		return this;
	}
	public int getId() {
		return this.id;
	}
	public Customer setDebitCard(int debitcard) {
		this.debitcard = debitcard;
		return this;
	}
	public int getDebitCard() {
		return this.debitcard;
	}
	public Customer setCreditCard(int creditcard) {
		this.creditcard = creditcard;
		return this;
	}
	public int getCreditCard() {
		return this.creditcard;
	}
	
	@Override
	public String toString() {
		return "Customer [FName=" + FName + ",LName=" + LName + ", id=" + id + "]";
	}
}

