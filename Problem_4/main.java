// GRADE: 7/10


import java.util.Scanner;
import java.lang.*;
import java.lang.Math; 

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
		
		/* Circle 1 coordinates */
		Scanner circle_1_coords_input = new Scanner(System.in);
		System.out.println("Enter circle1's center x-, y-coordinates, and radius:");
		String circle_1_coords = circle_1_coords_input.nextLine();
		
		// should include error checking for non valid inputs (i.e. not space seperated, not 3 values given, not integers given, etc.)
		String[] circle_1_coords_split = circle_1_coords.split("\\s");
		if (isNumerin(circle_1_coords_split[0]) == true){
			String circle_1_x_coord = circle_1_coords_split[0];
			String circle_1_y_coord =circle_1_coords_split[1];
			String circle_1_radii =circle_1_coords_split[2];
		} else {
			System.out.println("That is not a number, please enter a number and try again.");
			circle_1_x_coord = circle_1_coords_split[0];
		}


		if (isNumeric(circle_1_x_coord) == false)
			System.out.println("That is not a number, please enter a number and try again.");
			circle_1_x_coord = circle_1_coords_split[0];
		
		// minor note calling these ints in variable names but saving as double
		double circle_1_x_coord_int = Double.parseDouble(circle_1_x_coord);
		double circle_1_y_coord_int = Double.parseDouble(circle_1_y_coord);	
		double circle_1_radii_int = Double.parseDouble(circle_1_radii);	
		
		/* Circle 2 coordinates */
		Scanner circle_2_coords_input = new Scanner(System.in);
		System.out.println("Enter circle2's center x-, y-coordinates, and radius:");
		String circle_2_coords = circle_2_coords_input.nextLine();
		
		// same comments as above.  Can also probably put all this logic in a function and call it twice in order to re-use code and not re-write the same code twice
		String[] circle_2_coords_split = circle_2_coords.split("\\s");
		String circle_2_x_coord = circle_2_coords_split[0];
		String circle_2_y_coord =circle_2_coords_split[1];
		String circle_2_radii =circle_1_coords_split[2];
		double circle_2_x_coord_int = Double.parseDouble(circle_2_x_coord);
		double circle_2_y_coord_int = Double.parseDouble(circle_2_y_coord);
		double circle_2_radii_int = Double.parseDouble(circle_2_radii);	

		
		/* Distance between 2 centers */
		// not how you calculate distance between two points (look up distance formula to find how to calculate this correctly)
		// i.e. https://www.baeldung.com/java-distance-between-two-points
		double dist_btw_2_centers = Math.sqrt(((circle_2_x_coord_int) - (circle_1_x_coord_int))*((circle_2_x_coord_int) - (circle_1_x_coord_int))) + ((circle_2_y_coord_int) - (circle_1_y_coord_int))*((circle_2_y_coord_int) - (circle_1_y_coord_int));
		/* Radius 1 minus radius 2 */
		double radii_1_minus_radii_2 = (circle_1_radii_int - circle_2_radii_int);
		/* Radius 1 plus radius 2 */
		double radii_1_plus_radii_2 = (circle_1_radii_int + circle_2_radii_int);

		if (dist_btw_2_centers <= radii_1_minus_radii_2) {
			System.out.println("circle2 is inside circle1");
		// missing space below before else statement
		}else if (dist_btw_2_centers <= radii_1_plus_radii_2) {
			System.out.println("circle2 overlaps circle1");
		// missing space below before else statement
		}else {
			System.out.println("circle2 does not overlap circle1");
		}
	}
}
