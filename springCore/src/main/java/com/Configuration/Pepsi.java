package com.Configuration;

public class Pepsi 
{
	private int price;
	private int quality;
	public Pepsi(int price, int quality) {
		super();
		this.price = price;
		this.quality = quality;
	}
	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Pepsi [price=" + price + ", quality=" + quality + "]";
	}
	
	

}
