package com.Configuration;

public class Laptop 
{
	private String name;
	private double price;
	private int quantity;
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	public Laptop(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
