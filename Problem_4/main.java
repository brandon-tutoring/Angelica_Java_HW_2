package problem3;

import java.util.Scanner;
import java.lang.*;

public class main {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* Circle 1 coordinates */
		Scanner circle_1_coords_input = new Scanner(System.in);
		System.out.println("What are circle 1's center coordinates?");
		String circle_1_coords = circle_1_coords_input.nextLine();
		String[] circle_1_coords_split = circle_1_coords.split("\\s");
		String circle_1_coord_1 = circle_1_coords_split[0];
		String circle_1_coord_2 =circle_1_coords_split[1];
		float circle_1_coord_1_int = Integer.parseInt(circle_1_coord_1);
		float circle_1_coord_2_int = Integer.parseInt(circle_1_coord_2);	
		
		/* Circle 2 coordinates */
		Scanner circle_2_coords_input = new Scanner(System.in);
		System.out.println("What are circle 2's center coordinates?");
		String circle_2_coords = circle_2_coords_input.nextLine();
		String[] circle_2_coords_split = circle_2_coords.split("\\s");
		String circle_2_coord_1 = circle_2_coords_split[0];
		String circle_2_coord_2 =circle_2_coords_split[1];
		float circle_2_coord_1_int = Integer.parseInt(circle_2_coord_1);
		float circle_2_coord_2_int = Integer.parseInt(circle_2_coord_2);
		
		/* Distance between 2 centers */
		double var = (((circle_2_coord_1) - (circle_1_coord_1)) + ((circle_2_coord_2) - (circle_1_coord_2)));
		
		Scanner circle_1_radii_input = new Scanner(System.in);
		System.out.println("What is circle 1's radius?");
		String circle_1_radii = circle_1_radii_input.nextLine();
		float circle_1_radii_int = Integer.parseInt(circle_1_radii);	
		
		Scanner circle_2_radii_input = new Scanner(System.in);
		System.out.println("What is circle 2's radius?");
		String circle_2_radii = circle_2_radii_input.nextLine();
		float circle_2_radii_int = Integer.parseInt(circle_2_radii);
		
		float radii_1_minus_radii_2 = (circle_1_radii_int - circle_2_radii_int);
		
		boolean rad_vs_coord = radii_1_minus_radii_2 <= ;

		  
		if (rad_vs_coord = true);
	}

}
