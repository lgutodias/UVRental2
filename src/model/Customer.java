package model;

public class Customer {
	private String fname;
	private String lname;
	private String email;
	private static int id = 1;
	private int creditcard;
	
	public Customer() {
		id++;
	}
	
	public Customer setFName(String fname) {
		this.fname = fname;
		return this;
	}
	public String getFName() {
		return this.fname;
	}
	public Customer setLName(String lname) {
		this.lname = lname;
		return this;
	}
	public String getLName() {
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
	public Customer setCreditCard(int creditcard) {
		this.creditcard = creditcard;
		return this;
	}
	public int getCreditCard() {
		return this.creditcard;
	}
	@Override
	public String toString() {
		return "Customer [fname=" + fname + ", lname=" + lname + ", email=" + email + ", id=" + id + ", creditcard=" + creditcard + "]";
	}
	
	
}

