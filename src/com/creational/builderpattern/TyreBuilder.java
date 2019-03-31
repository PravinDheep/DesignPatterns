package com.creational.builderpattern;

public class TyreBuilder {
	private String brand;
	private int cost = 10000;
	private int warranty;
	private int serviceinyears;
	
	public TyreBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	public TyreBuilder setCost(int cost) {
		this.cost = cost;
		return this;
	}
	public TyreBuilder setWarranty(int warranty) {
		this.warranty = warranty;
		return this;
	}
	public TyreBuilder setServiceinyears(int serviceinyears) {
		this.serviceinyears = serviceinyears;
		return this;
	}
	
	public BikeTyre getBikeTyre() {
		return new BikeTyre(brand, cost, warranty, serviceinyears);
	}
	
}
