// make sure to test if there is unicode character for the number
// GRADE: 8/10 (B-)


import java.util.Scanner;
public class main {
	
	public static boolean isNumeric(String str)
	{
	    for (char c : str.toCharArray())
	    {
	        if (!Character.isDigit(c)) return false;
	    }
	    return true;
	}

	public static void main(String[] args) {
		
		/* Asks user for input and prints what it equals */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a unicode code point, and I'll print out a report.");
		String amount = input.nextLine();
					
		if (isNumeric(amount) == false) {
			System.out.println("That is not a number, please enter a number and try again.");
			main(args);
		}
		else if (isNumeric(amount) == true) {
			
	
			int amount_int = Integer.parseInt(amount);
			char ch = (char) amount_int;
			
			System.out.print(amount + " represents the character " + "'"ch"'");
			
			/* Previous characters. */
			int amount_minus_1 = amount_int - 1;
			char ch_amount_minus_1 = (char) amount_minus_1;
			System.out.print("\nThe previous character is " + "'"ch_amount_minus_1"'");
			
			
			/* Conditional to tell what kind of character it is. */
	
			if (Character.isLetter(ch)) {
				System.out.print("\nThe character is a letter."); 
			}
			else if (Character.isDigit(ch)) {
				System.out.print("\nThe character is a number.");
			}
			
			else {
				System.out.print("\nThe characters is alphanumeric.");
			 }
		
			
			/* Next characters. */
			int amount_plus_1 = amount_int + 1;
			char ch_amount_plus_1 = (char) amount_plus_1;
			System.out.println("\nThe next character is " + "'"ch_amount_plus_1"'");
			
			 
			
		};
		}
	}


