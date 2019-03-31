package com.creational.builderpattern;

public class BikeTyre {
	
	private String brand;
	private int cost;
	private int warranty;
	private int serviceinyears;	
	
	public BikeTyre(String brand, int cost, int warranty, int serviceinyears) {
		super();
		this.brand = brand;
		this.cost = cost;
		this.warranty = warranty;
		this.serviceinyears = serviceinyears;
	}

	@Override
	public String toString() {
		return "BikeTyre [brand=" + brand + ", cost=" + cost + ", warranty=" + warranty + ", serviceinyears="
				+ serviceinyears + "]";
	}
	
	

}
