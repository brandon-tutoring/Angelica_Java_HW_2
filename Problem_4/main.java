package problem3;

import java.util.Scanner;
import java.lang.*;

public class main {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* Circle 1 coordinates */
		Scanner circle_1_coords_input = new Scanner(System.in);
		System.out.println("Enter circle1's center x-, y-coordinates, and radius:");
		String circle_1_coords = circle_1_coords_input.nextLine();
		String[] circle_1_coords_split = circle_1_coords.split("\\s");
		String circle_1_x_coord = circle_1_coords_split[0];
		String circle_1_y_coord =circle_1_coords_split[1];
		String circle_1_radii =circle_1_coords_split[2];
		double circle_1_x_coord_int = Integer.parseInt(circle_1_x_coord);
		double circle_1_y_coord_int = Integer.parseInt(circle_1_y_coord);	
		double circle_1_radii_int = Integer.parseInt(circle_1_radii);	
		
		/* Circle 2 coordinates */
		Scanner circle_2_coords_input = new Scanner(System.in);
		System.out.println("Enter circle2's center x-, y-coordinates, and radius:");
		String circle_2_coords = circle_2_coords_input.nextLine();
		String[] circle_2_coords_split = circle_2_coords.split("\\s");
		String circle_2_x_coord = circle_2_coords_split[0];
		String circle_2_y_coord =circle_2_coords_split[1];
		String circle_2_radii =circle_1_coords_split[2];
		double circle_2_x_coord_int = Integer.parseInt(circle_2_x_coord);
		double circle_2_y_coord_int = Integer.parseInt(circle_2_y_coord);
		double circle_2_radii_int = Integer.parseInt(circle_2_radii);	

		
		/* Distance between 2 centers */
		double dist_btw_2_centers = (((circle_2_x_coord_int) - (circle_1_x_coord_int)) + ((circle_2_y_coord_int) - (circle_1_y_coord_int)));
		/* Radius 1 minus radius 2 */
		double radii_1_minus_radii_2 = (circle_1_radii_int - circle_2_radii_int);
		/* Radius 1 plus radius 2 */
		double radii_1_plus_radii_2 = (circle_1_radii_int + circle_2_radii_int);

		if (dist_btw_2_centers <= radii_1_minus_radii_2) {
			System.out.println("circle2 is inside circle1");
		}
		else if (dist_btw_2_centers <= radii_1_plus_radii_2) {
			System.out.println("circle2 overlaps circle1");
		}
		else {
			System.out.println("circle2 does not overlap circle1");
		}
	}

}
