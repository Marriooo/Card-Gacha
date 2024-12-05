package sesi13;

import java.util.Random;

public class Common extends gacha{
	Random rand = new Random();
	
	
	private String[] commonName = {
			"Lestey the Marksman",
			"Hunterman Kroger",
			"Secret Assasin Vix",
			"Mustof the Richest Man",
			"Ordor the Golem",
			"Mumen the Rider",
			"Zuck the Spy",
			"Osman the Warlord",
			"Kabbal the Abyssal",
			"Mortis the Vampire"
			};
	
	private int maxPrice = 149;
	private int minPrice = 0;

	public Common() {
		super("Common");
		name = randomName();
		price = randomPrice();
	}

	@Override
	String randomName() {
		return commonName[rand.nextInt(10)];
	}

	@Override
	int randomPrice() {
		return rand.nextInt(maxPrice - minPrice + 1) + minPrice;
	}

}
