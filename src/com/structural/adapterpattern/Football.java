package com.structural.adapterpattern;

public class Football{
	
	public static void main(String[] args) {
		
		ShoeAdapter joinStudsToShoes = new ShoeAdapter();
		PlayTournament pt = new PlayTournament();
		pt.setShoes(joinStudsToShoes);
		pt.playMatches("Game starts now..");
		
	}
	
}