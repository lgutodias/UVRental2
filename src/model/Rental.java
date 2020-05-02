package model;

import java.util.ArrayList;
import java.util.List;

public class Rental {
	
	private Customer c;
	private List<Titles> t = new ArrayList<>();

	public void setCustomer(Customer c){
	     this.c = c;
	}

	public Customer getCostumer(){
	     return this.c;
	}

	public void addProduct(Titles t){
	      this.t.add(t);
	}

	public Titles getProduct(int index){
	     return t.get(index);
	}

	@Override
	public String toString() {
		return "Rental [c=" + c + ", t=" + t + "]";
	}

	
}
