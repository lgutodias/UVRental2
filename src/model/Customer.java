package model;

public class Customer {
	private String fname;
	private String lname;
	private String email;
	private int id;
	private int debitcard;
	private int creditcard;
	
	public Customer setFName(String fname) {
		this.fname = fname;
		return this;
	}
	public String getfname() {
		return this.fname;
	}
	public Customer setLName(String lname) {
		this.lname = lname;
		return this;
	}
	public String geLName() {
		return this.lname;
	}
	public Customer setEmail(String email) {
		this.email = email;
		return this;
	}
	public String getEmail() {
		return this.email;
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
		return "Customer [fname=" + fname + ", lname=" + lname + ", email=" + email + ", id=" + id + ", debitcard="
				+ debitcard + ", creditcard=" + creditcard + "]";
	}
	
	
}

