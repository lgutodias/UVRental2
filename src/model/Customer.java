package model;

class Customer {
	private String name;
	private int id;
	
	public Customer setName(String name) {
		this.name = name;
		return this;
	}
	public String getName() {
		return this.name;
	}
	
	public Customer setId(int id) {
		this.id = id;
		return this;
	}
	public int getId() {
		return this.id;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + "]";
	}
}

