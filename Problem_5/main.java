import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("let's play a game of odds and evens!");
		System.out.println("What kind of player do you want the computer to be?(h or c)");
		System.out.println("(H)onest Olivia");
		System.out.println("(C)heating Chelsea");
		String input1 = input.nextLine();
		String[] choices = {"1", "2"};
		if(input1 == "h") {
			Scanner input2 = new Scanner(System.in);
			System.out.println("Choose odd or even (type the number corresponding to your choice)");
			System.out.println("1- Odds");
			System.out.println("2- Evens");
			String input7 = input.nextLine();
			
			Scanner input3 = new Scanner(System.in);
			System.out.println("1.. 2.. 3... go! (How many fingers - 1 or 2)");
			String input4 = input.nextLine();
			java.util.Random random = new java.util.Random();
			int generatedString = random.nextInt(choices.length);
			System.out.println(generatedString);
		}
			
		else if(input1 == "c"){
			Scanner Input = new Scanner(System.in);
			System.out.println("please choose odds or evens");
			String input2 = input.nextLine();
			if(input2 == "odds"){
				Scanner input6 = new Scanner(System.in);
				System.out.println("please enter your number");
				String num_input = input.nextLine();
				if(num_input == "1"){
					System.out.println("Cheating computer cheats");
					System.out.println("the computer puts out 1");
					System.out.println("the total is 2");
					System.out.println("you lost!");
				}
					
				else if(num_input == "2"){
					System.out.println("Cheating computer cheats");
					System.out.println("the computer puts out 2");
					System.out.println("the total is 4");
					System.out.println("you lost!");
				}	
					
			else if(input2 == "evens"){
				Scanner input5 = new Scanner(System.in);
				System.out.println("please enter your number");
				String num_input1 = input.nextLine();
			}
				if(num_input == "1"){
					System.out.println("Cheating computer cheats");
					System.out.println("the computer puts out 2");
					System.out.println("the total is 3");
					System.out.println("you lost!");
				}
					
				else if(num_input == "2"){
					System.out.println("Cheating computer cheats");
					System.out.println("the computer puts out 1");
					System.out.println("the total is 3");
					System.out.println("you lost!"); 
				}	
			

			}
		}
	};
}
