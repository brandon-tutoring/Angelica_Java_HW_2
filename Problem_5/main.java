// dont include .class file (same as previous problem)
// GRADE: 0/10 (DOES NOT COMPILE !)




import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
		System.out.println("let's play a game of odds and evens!");
		System.out.println("-------------------------------------------------");
		System.out.println("-------------------------------------------------");
		
		Scanner kind_player_input = new Scanner(System.in);
		System.out.println("What kind of player do you want the computer to be?(h or c) \n(H)onest Olivia \n(C)heating Chelsea");
		String kind_player = kind_player_input.nextLine();
		
		String[] choices = {"1", "2"};
		
		Scanner odd_even_input = new Scanner(System.in);
		System.out.println("Choose odd or even (type the number corresponding to your choice) \n1- Odds \n2- Evens");
		String odd_even = odd_even_input.nextLine();
			
		if (odd_even == 1){
			System.out.println("You chose odds.")
		}
		else if (odd_even == 2) {
			System.out.println("You chose evens.")
		}
			
		Scanner fingers_input = new Scanner(System.in);
		System.out.println("1.. 2.. 3... go! (How many fingers - 1 or 2)");
		String fingers_amount = input.nextLine();
		
		if(kind_player == "h" of kind_player == "H") {
			
			java.util.Random random = new java.util.Random();
			int generatedString = random.nextInt(choices.length);
			System.out.println(generatedString);
			
			
					

		else if(kind_player == "c" or kind_player == "C"){
		
			Scanner fingers_input = new Scanner(System.in);
			System.out.println("1.. 2.. 3... go! (How many fingers - 1 or 2)");
			String fingers_amount = input.nextLine();
			
			if(input2 == "odds"){

				if(fingers_input == "1"){
					System.out.println("Cheating computer cheats \nthe computer puts out 1 \nthe total is 2 \nyou lost!");
				}
					
				else if(num_input == "2"){
					System.out.println("Cheating computer cheats \nthe computer puts out 2 \nthe total is 4 \nyou lost!");
				}	
					
			else if(fingers_amount == "evens"){
			
				if(num_input == "1"){
					System.out.println("Cheating computer cheats \nthe computer puts out 2 \nthe total is 3 \nyou lost!");
				}
					
				else if(num_input == "2"){
					System.out.println("Cheating computer cheats \nthe computer puts out 1 \nthe total is 2 \nyou lost!");
				}	
			}
	};
}
