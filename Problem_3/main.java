// GRADE: 0/10 DOES NOT COMPILE


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		
		List<String> card_nums = new ArrayList <>();
		card_nums.add("A");
		card_nums.add("2");
		card_nums.add("3");
		card_nums.add("4");
		card_nums.add("5");
		card_nums.add("6");
		card_nums.add("7");
		card_nums.add("8");
		card_nums.add("9");
		card_nums.add("10");
		card_nums.add("J");
		card_nums.add("Q");
		card_nums.add("K");


		List<String> card_suits = new ArrayList <>();
		int c = 0x2660;
		String spade = Character.toString((char)c);
		card_suits.add(spade);

		int cheart = 0x2665;
		String heart = Character.toString((char)cheart);
		card_suits.add(heart);

		int cclubs = 0x2666;
		String clubs = Character.toString((char)cclubs);
		card_suits.add(clubs);

		int cdiamond = 0x2663;
		String diamond = Character.toString((char)cdiamond);
		card_suits.add(diamond);

		Random rand = new Random();
		String random_card_num = card_nums.get(rand.nextInt(card_nums.size()));
		
		String random_card_suit = card_suits.get(rand.nextInt(card_suits.size()));
		
		System.out.println("Your card is the " + (random_card_num) + " of " + random_card_suit + "s");
		
		
	}

}
