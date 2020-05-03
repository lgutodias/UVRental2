/*package model;

import java.util.ArrayList;
import java.util.List;

public class Test extends Customer {
	
	static List<Customer> customers = new ArrayList<>();
	
	public Test searchCustomer() {
		String email;
		Customer customer = null;
		
		email = Keyboard.textInput("TYPE CUSTOMER'S EMAIL: ");
		
		for (Customer c1 : customers) {
			if (c1.getEmail().equalsIgnoreCase(email)) {
				System.out.println("Customer: "+ c1.getFName() + " " + c1.getLName() + " | " + "Email: "+ c1.getEmail());
				customer = c1;
				break;
			}
		}
		
		if (customer == null) {
			System.out.println("CUSTOMER NOT FOUND.");
		}
			return (Test) customer;
	}

}*/
