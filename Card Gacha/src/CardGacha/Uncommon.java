package sesi13;

import java.util.Random;

public class Uncommon extends gacha{
	Random rand = new Random();
	
	private String[] uncommonName = {
			"Grandmaster Yorsn",
			"Jonthor the Taskmaster",
			"Burhan the Envelope Carrier",
			"Xander Liar Wolf",
			"Richarn the Lycan",
			"Blaire the Witch of Oz",
			"Pedroz the Dragontamer",
			"Adrian the Strongman",
			"Anabel Cursed Doll",
			"Sigros the Tree Sentinel"
			};
	
	private int maxPrice = 499;
	private int minPrice = 150;

	public Uncommon() {
		super("Uncommon");
		name = randomName();
		price = randomPrice();
	}

	@Override
	String randomName() {
		return uncommonName[rand.nextInt(10)];
	}

	@Override
	int randomPrice() {
		return rand.nextInt(maxPrice - minPrice + 1) + minPrice;
	}

}
