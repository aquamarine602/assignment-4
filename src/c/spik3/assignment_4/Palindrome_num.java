package c.spik3.assignment_4;

import java.util.Scanner;
import static java.lang.System.out;

/**
 * @author Chloe
 * 10/22/18
 * determines if input is palindrome
 */

public class Palindrome_num {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		// prompts user to enter integer
		out.println("Enter and integer with 3 or more digits:");
		int number = 99;
		
		// makes sure number has possibility to be palindrome
		while (number < 100) {
			number = input.nextInt();
			out.println();
			
			if (number < 100) {
				out.println("Invalid number! Enter an integer with 3 or more digits:");
			}
		}
		
		// declares variables
		int reverse = 0;
		int remainder;
		int num = number;
		
		// uses modulus to determine the reverse of number
		while (num != 0) {
			remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num /= 10;
		}
		
		// tells user if their number is a palindrome or not
		if (number == reverse) {
			out.println(number + " is a palindrome.");
		} else if (number != reverse) {
			out.println(number + " is not a palindrome.");
		}

	}

}
