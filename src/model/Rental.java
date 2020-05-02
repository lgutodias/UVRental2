package model;

import java.util.ArrayList;
import java.util.List;

public class Rental {
	
	private Customer c;
	private List<Product> p = new ArrayList<>();

	public void setCustomer(Customer c){
	     this.c = c;
	}

	public Customer getCostumer(){
	     return this.c;
	}

	public void addProduct(Product p){
	      this.p.add(p);
	}

	public Product getProduct(int index){
	     return p.get(index);
	}

	@Override
	public String toString() {
		return "Rental [c=" + c + ", p=" + p + "]";
	}

	
}
