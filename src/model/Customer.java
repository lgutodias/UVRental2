package model;

import java.util.ArrayList;
import interfaces.RegisterC;

public class Customer implements RegisterC {
	
	// Attributes
	private String fname;
	private String lname;
	private String email;
	
	// Constructor
	public Customer() {}
	
	public ArrayList<Customer> customerList = new ArrayList<>();
	
	
	@Override
	public void addCustomer() {
		
		Customer c1 = new Customer();
		
		System.out.println("..........::::: ADD NEW CUSTOMER :::::..........");
		
		c1.setFName(Keyboard.input("FIRST NAME: "));
		
		c1.setLName(Keyboard.input("LAST NAME: "));
		
		c1.setEmail(Keyboard.input("EMAIL: "));
		
		customerList.add(c1);
			
	}
	

	@Override
	public Customer searchCustomer() {
		
		String email;
		Customer customer = null;
		
		email = Keyboard.input("TYPE CUSTOMER'S EMAIL: ");
		
		for (Customer c1 : customerList) {
			if (c1.getEmail().equalsIgnoreCase(email)) {
				System.out.println("Customer: "+ c1.getFName() + " " + c1.getLName() + " | " + "Email: "+ c1.getEmail());
				customer = c1;
				break;
			}
		}
		
		if (customer == null) {
			System.out.println("CUSTOMER NOT FOUND.");
		}
			return customer;
	}
	

	@Override
	public void deleteCustomer() {
		
		String email;
		String choice = null;
		
		email = Keyboard.input("TYPE CUSTOMER'S EMAIL: ");
		
		for (Customer c1 : customerList) {
			if (c1.getEmail().equals(email)) {
				System.out.println("Customer: "+ c1.getFName() + " " + c1.getLName() + " | " + "Email: "+ c1.getEmail());
			}
		}
		
		choice = Keyboard.input("DO YOU CONFIRM THAT WANT TO DELETE THIS CUSTOMER? (Y/N)");
		
		if (choice == "y") {
			customerList.remove(email);
		}
	}
	
	public String getFName() {
        return fname;
    }

    public void setFName(String fname) {
        this.fname = fname;
    }
    
    public String getLName() {
        return lname;
    }

    public void setLName(String lname) {
        this.lname = lname;
    }
        
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public ArrayList<Customer> getCustomerList() {
    	return customerList;
    }
    
    public void setCustomerList(ArrayList<Customer> customerList) {
    	this.customerList = customerList;
    }

	@Override
	public String toString() {
		return "Customer [fname=" + fname + ", lname=" + lname + ", email=" + email + ", customerList=" + customerList
				+ "]";
	} 
}
