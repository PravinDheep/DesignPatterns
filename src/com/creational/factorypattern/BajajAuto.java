package com.creational.factorypattern;

public class BajajAuto {

	public static void main(String[] args) {
		FactoryProducts fp = new FactoryProducts();
		MotorBikes mb = fp.getInstance("220cc");
		mb.variantName();
	}

}
