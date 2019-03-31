package com.structural.adapterpattern;

public class ShoeAdapter implements Shoes {

	StudShoes stud = new StudShoes();
	
	@Override
	public void run(String str) {
		stud.traction(str);
	}

}
