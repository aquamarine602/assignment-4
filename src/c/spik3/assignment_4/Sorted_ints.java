package c.spik3.assignment_4;

import java.util.Scanner;
import static java.lang.System.out;

/**
 * @author Chloe
 * 10/22/18
 * sorting 3 integers
 */

public class Sorted_ints {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// prompt user to input three integers
		out.println("Enter three integers.");
		out.print("First int: ");
		int int_1 = input.nextInt();
		out.print("Second int: ");
		int int_2 = input.nextInt();
		out.print("Thrid int: ");
		int int_3 = input.nextInt();
		out.println();
		
		// sorts integers
		if (int_1 > int_2 && int_1 > int_3) {
			if (int_2 > int_3) {
				out.println("Your order is: " + int_2 + " " + int_3 + " " + int_1);
			} else if (int_3 > int_2) {
				out.println("Your order is: " + int_3 + " " + int_2 + " " + int_1);
			}
		} else if (int_2 > int_1 && int_2 > int_3) {
			if (int_1 > int_3) {
				out.println("Your order is: " + int_1 + " " + int_3 + " " + int_2);
			} else if (int_3 > int_1) {
				out.println("Your order is: " + int_3 + " " + int_1 + " " + int_2);
			}
		} else if (int_3 > int_1 && int_3 > int_2) {
			if (int_1 > int_2) {
				out.println("Your order is: " + int_1 + " " + int_2 + " " + int_3);
			} else if (int_2 > int_1) {
				out.println("Your order is: " + int_2 + " " + int_1 + " " + int_3);
			}
		}
		
		// tells user the order sorted in
		out.println("(The order is Middle, Smallest, Biggest.");

	}

}
