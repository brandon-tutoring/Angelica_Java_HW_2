// GRADE: 9.5/10 (A)

// ONE MORE BUG:  try runnin the program w a very large number (i.e. 592754385789357943).  What happens?  Why do you think this is?
// Try googling integers in Java and see if you can figure it out on your own (if not we will go over in the next lesson)


import java.util.Scanner;
public class main {
	
	public static boolean isNumeric(String str) {
	    for (char c : str.toCharArray()) {
	        if (!Character.isDigit(c)) {
	        	return false;
	        }
	    }
	    return true;
	}

	public static void main(String[] args) {
		
		/* Asks user for input and prints what it equals */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a unicode code point, and I'll print out a report");
		String user_input = input.nextLine();
					
		while (isNumeric(user_input) == false) {
			System.out.println("That is not a number, please enter a number and try again.");
			user_input = input.nextLine();
		}
		
		int user_input_int = Integer.parseInt(user_input);
		char ch = (char) user_input_int;
		
		System.out.print(user_input + " represents the character: " + "'" + ch + "'");
		
		/* Conditional to tell what kind of character it is. */
		if (Character.isLetter(ch)) {
			System.out.print("\nThe character is a letter."); 
		} else if (Character.isDigit(ch)) {
			System.out.print("\nThe character is a number.");
		} else {
			System.out.print("\nThe characters is alphanumeric.");
		}
		 
		/* Next characters. */
		int user_input_plus_1 = user_input_int + 1;
		char ch_user_input_plus_1 = (char) user_input_plus_1;
		System.out.print("\nThe next character is '" + ch_user_input_plus_1 + "'.");
		
		/* Previous characters. */
		int user_input_minus_1 = user_input_int - 1;
		char ch_user_input_minus_1 = (char) user_input_minus_1;
		System.out.println("\nThe previous character is '" + ch_user_input_minus_1 + "'");
	}	
}
