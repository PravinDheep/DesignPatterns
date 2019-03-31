package com.structural.adapterpattern;

public class PlayTournament{
	
	private Shoes shoes;
	
	public Shoes getShoes() {
		return shoes;
	}

	public void setShoes(Shoes shoes) {
		this.shoes = shoes;
	}

	public void playMatches(String str) {
		shoes.run(str);
	}
	
}