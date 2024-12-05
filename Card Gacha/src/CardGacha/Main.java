package sesi13;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	int coin = 1000;
	ArrayList<gacha> cards = new ArrayList<>();
	
	void printList() {
		System.out.println("+--------------------------------------------------------------+");
		 System.out.printf("| %-30s | %-14s | %-10s |\n", " Champion Name", "Card Rarity", "Sell Price");
		 System.out.println("+--------------------------------------------------------------+");
		 for (gacha g : cards) {
			 System.out.printf("| %-30s | %-14s | %-10d |\n", g.getName(), g.getRarity(), g.getPrice());
		 }
		 System.out.println("+--------------------------------------------------------------+");
	}
	
	 void gacha() {
		if((coin-100) < 0) {
			System.out.println("No coin");
			System.out.print("Please enter to continue...");
			input.nextLine();
			System.out.println("");
			menu();
		}
		
		coin -= 100;
		int chance = rand.nextInt(100) + 1;
		gacha temp = null;
		
		if(chance <= 40) {
			temp = new Common();
		} else if(chance <= 65) {
			temp = new Uncommon();
		} else if(chance <= 85) {
			temp = new Rare();
		} else if(chance <= 95) {
			temp = new Epic();
		}else {
			temp = new Legendary();
		}
		cards.add(temp);
		temp.print();
		System.out.print("Please enter to continue...");
		input.nextLine();
		
		System.out.println("");
		menu();
	 }
	 
	 void collection() {
		 if(cards.isEmpty()) {
			 System.out.print("You have no card\n");
			 System.out.print("Please enter to continue...");
			 input.nextLine();
			 System.out.println("");
			 menu();
		 }
		 
		 printList();
		 System.out.print("Please enter to continue...");
		 input.nextLine();
		 
		 System.out.println("");
		 menu();
	 }
	 
	 void sell() {
		 if(cards.isEmpty()) {
			 System.out.print("You have no card\n");
			 System.out.print("Please enter to continue...");
			 input.nextLine();
			 System.out.println("");
			 menu();
		 }
		 
		 printList();
		 
		 while(true) {
			 System.out.print("Card name you want to sell: ");
			 String name = input.nextLine();
			 boolean isFound = false;
			 
			 for (gacha g : cards) {
				 if(g.getName().equals(name)) {
					 coin += g.getPrice();
					 System.out.printf("You get %d from selling %s.\n", g.getPrice(), g.getName());
					 cards.remove(g);
					 isFound = true;
					 break;
				 }
			 }
			 
			 if(isFound == true) {
				 break;
			 }
			 
			 System.out.println("Card no found. Please enter the name in your collection.");
		 }
		 
		 System.out.print("Please enter to continue...");
		 input.nextLine();
		 
		 System.out.println("");
		 menu();
	 }
	 
	 void exit() {
		 if(cards.isEmpty()) {
			 System.out.println("You have no card");
			 System.out.printf("You won %d coins and the rest of card in collection!", coin);
			 System.exit(0);
		 }
		 
		 printList();
		 System.out.printf("You won %d coins and the rest of card in collection!", coin);
		 System.exit(0);
	 }
	 
	 void menu() {
		 System.out.print("Dungeon Master Card Gacha\n"
		 		+ "==========================\n"
		 		+ "COIN : " + coin + "\n"
		 		+ "==========================\n"
		 		+ "1. Gacha (100 coins)\n"
		 		+ "2. Your collection\n"
		 		+ "3. Sell\n"
		 		+ "4. Exit\n"
		 		+ ">> ");
		 int pick = input.nextInt(); input.nextLine();
		 System.out.println("");
		 
		 if(pick == 1) {
			 gacha();
		 } else if(pick == 2) {
			 collection();
		 } else if(pick == 3) {
			 sell();
		 } else if(pick == 4) {
			 exit();
		 }
	 }
	 
	 public Main() {
		 menu();
	 };
	 
	public static void main(String[] args) {
		new Main();
	}

}