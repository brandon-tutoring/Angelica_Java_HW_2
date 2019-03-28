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
		System.out.println(kind_player);
		
		Scanner odd_even_input = new Scanner(System.in);
		System.out.println("Choose odd or even (type the number corresponding to your choice) \n1- Odds \n2- Evens");
		String odd_even = odd_even_input.nextLine();
			
		if (odd_even.equals("1")){
			System.out.println("You chose odds");
		}else if (odd_even.equals("2")) {
			System.out.println("You chose evens");
		}

		Scanner fingers_input = new Scanner(System.in);
		System.out.println("1.. 2.. 3... go! (How many fingers - 1 or 2)");
		String fingers_amount = fingers_input.nextLine();
		int fingers_amount_int = Integer.parseInt(fingers_amount);
		
		if(kind_player.equals("h") || kind_player.equals("H")) {

			String[] choices = {"1", "2"};
			java.util.Random random = new java.util.Random();
			int random_number = random.nextInt(choices.length);

			int total = random_number + fingers_amount_int;
			String result = "";
			if (total % 2 == 0){
				result = "even";
			} else if (total % 2 != 0) {
				result = "odd";
			}
			System.out.println(odd_even + "odd even");
			if(odd_even.equals("1")){
				String win_lose = "";
				System.out.println("odd even loop if");
				if (result.equals("odd")){
					win_lose = "won";
				} else if (result.equals("even")){
					win_lose = "lose";
				}

				if(fingers_amount.equals("1")){
					System.out.println("The computer puts out " + random_number + "\nthe total is " + total + "\nyou " + win_lose + "!");
				}else if(fingers_amount.equals("2")){
					System.out.println("The computer puts out " + random_number + "\nthe total is " + total + "\nyou " + win_lose + "!");
				}
			}else if(odd_even.equals("2")){
				System.out.println("odd even loop elseif");
				String win_lose = "";
				if (result.equals("odd")){
					win_lose = "lose";
				} else if (result.equals("even")){
					win_lose = "won";
				}
			
				if(fingers_amount.equals("1")){
					System.out.println("The computer puts out " + random_number + "\nthe total is " + total + "\nyou " + win_lose + "!");
				}else if(fingers_amount.equals("2")){
					System.out.println("The computer puts out " + random_number + "\nthe total is " + total + "\nyou " + win_lose + "!");
				}	
			}

		}else if (kind_player.equals("c") || kind_player.equals("C")) {

			if(odd_even.equals("1")){
				System.out.println("Inside for loop odd");

				if(fingers_amount.equals("1")){
					System.out.println("Cheating computer cheats \nthe computer puts out 1 \nthe total is 2 \nyou lost!");
				}else if(fingers_amount.equals("2")){
					System.out.println("Cheating computer cheats \nthe computer puts out 2 \nthe total is 4 \nyou lost!");
				}
			}else if(odd_even.equals("2")){
				System.out.println("Inside for loop even");

				if(fingers_amount.equals("1")){
					System.out.println("Cheating computer cheats \nthe computer puts out 2 \nthe total is 3 \nyou lost!");
				}else if(fingers_amount.equals("2")){
					System.out.println("Cheating computer cheats \nthe computer puts out 1 \nthe total is 2 \nyou lost!");
				}	
			}
		}
	};
}

