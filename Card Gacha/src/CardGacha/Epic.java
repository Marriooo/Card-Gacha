package sesi13;

import java.util.Random;

public class Epic extends gacha{
	Random rand = new Random();
	
	private String[] epicName = {
			"Javas the Hollow",
			"Jabbahut Slavemaster",
			"Gosbu Angnoluson",
			"Albion the Fallen Knight",
			"Pecados the Stonearm",
			"Firegod Magnus",
			"Jordmungan the Giant",
			"Honuros the Phoenix",
			"Krico of the Madagas",
			"Fredrickson the Conqueror"
			};
	
	private int maxPrice = 999;
	private int minPrice = 700;

	public Epic() {
		super("Epic");
		name = randomName();
		price = randomPrice();
	}

	@Override
	String randomName() {
		return epicName[rand.nextInt(10)];
	}

	@Override
	int randomPrice() {
		return rand.nextInt(maxPrice - minPrice + 1) + minPrice;
	}
	
	

}
