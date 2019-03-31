package com.creational.factorypattern;


public class FactoryProducts {
	public MotorBikes getInstance(String str) {		
		if(str.equals("150cc"))
			return new Men();
		else if(str.equals("220cc"))
			return new Boys();
		else
			return new Ladies();
	}
}
