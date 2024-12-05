package sesi13;

import java.util.Random;

public class Rare extends gacha{
	Random rand = new Random();
	
	private String[] rareName = {
			"Reggin the Barbarian",
			"Hatojin No Master Ronin",
			"Sergeant Private",
			"Radagam the Dragon",
			"Oz the Magician",
			"Balurds the Gatekeeper",
			"Jered the Pirate King",
			"Percys Seven Seas Guardian",
			"Morses the High Priest",
			"Freiren the Myhtical Elf"
			};
	
	private int maxPrice = 699;
	private int minPrice = 450;

	public Rare() {
		super("Rare");
		name = randomName();
		price = randomPrice();
	}

	@Override
	String randomName() {
		return rareName[rand.nextInt(10)];
	}

	@Override
	int randomPrice() {
		return rand.nextInt(maxPrice - minPrice + 1) + minPrice;
	}

}
