package sesi13;

abstract class gacha {
	protected String name;
	protected String rarity;
	protected int price;
	
	gacha(String rarity){
		this.rarity = rarity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRarity() {
		return rarity;
	}

	public void setRarity(String rarity) {
		this.rarity = rarity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void print() {
		System.out.printf("You got %s with rarity %s and price %d.\n", name, rarity, price);
	}
	
	abstract String randomName();
	
	abstract int randomPrice();
	
	
	
	
}
