package sesi13;

import java.util.Random;

public class Legendary extends gacha{
	Random rand = new Random();
	
	private String[] legendaryName = {
			"Agnolus the Midgod",
			"Barvert the God Slayer",
			"Zeonas the Chosen One",
			"Winter Guard Andor",
			"Selise the Empress of Sun",
			"Raibs the Empress of Moon",
			"Thodem the Immortal King",
			"Yordus the Dark Knight",
			"Erlang the One Being",
			"Paxnel the Ancient"
			};
	
	private int maxPrice = 1300;
	private int minPrice = 1000;

	public Legendary() {
		super("Legendary");
		name = randomName();
		price = randomPrice();
	}

	@Override
	String randomName() {
		return legendaryName[rand.nextInt(10)];
	}

	@Override
	int randomPrice() {
		return rand.nextInt(maxPrice - minPrice + 1) + minPrice;
	}
	
	

}
