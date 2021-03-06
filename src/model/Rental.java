package model;

import java.util.ArrayList;
import java.util.List;

import interfaces.Title;

public class Rental {
	
	private List<Title> titles = new ArrayList<>();
	private Customer customer;
	
	public Rental(Customer customer) {
		this.customer = customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	
	public void setProducts(List<Title> products) {
		this.titles = products;
	}
	
	public List<Title> getProducts(List<Title> products){
		return this.titles = products;
	}
	
	public Rental addTitle(Title product) {
		this.titles.add(product);
		return this;
	}
	
	@Override
	public String toString() {
		
		String content = "";
		
		for (Title t : this.titles) {
			content = "Customer [id=" + this.customer.getId() + ", customer=" + this.customer.getFName() 
					+ "], Title[title=" + t.getTitle() + ", genre=" + t.getGenre() + "]";
		}
		return content;
	}

	
}
