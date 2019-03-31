package com.creational.builderpattern;


public class Shop {

	public static void main(String[] args) {
		BikeTyre bt = new TyreBuilder().setBrand("MRF").getBikeTyre();
		System.out.println(bt);
	}

}
