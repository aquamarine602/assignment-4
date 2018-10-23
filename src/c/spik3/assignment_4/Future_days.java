package c.spik3.assignment_4;

import java.util.Scanner;
import static java.lang.System.out;

/**
 * @author Chloe
 * 10/22/18
 * find the date and future dates
 */

public class Future_days {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// day key for user
		out.println("Enter a day of the week:\n"
				+ "0 Sunday\n"
				+ "1 Monday\n"
				+ "2 Tuesday\n"
				+ "3 Wednesday\n"
				+ "4 Thursday\n"
				+ "5 Friday\n"
				+ "6 Saturday\n");
		
		// declaring the day variables
		int day = 7;
		String day_string = "";
		
		// while the user hasn't entered a valid day number
		while (day != 0 && day != 1 && day != 2 && day != 3 &&
				day != 4 && day != 5 && day != 6) {
			
			day = input.nextInt();
			out.println();
			
			// ties number to string
			if (day == 0) {
				day_string = "Sunday";
				
			} else if (day == 1) {
				day_string = "Monday";
				
			} else if (day == 2) {
				day_string = "Tuesday";
				
			} else if (day == 3) {
				day_string = "Wednesday";
				
			} else if (day == 4) {
				day_string = "Thursday";
				
			} else if (day == 5) {
				day_string = "Friday";
				
			} else if (day == 6) {
				day_string = "Saturday";
				
			} else if (day != 0 && day != 1 && day != 2 && day != 3 &&
					day != 4 && day != 5 && day != 6) {
				out.println("Invalid day!");
				out.println();
			}
			
		}
		
		// prompts user to enter days passed
		out.println("Enter the amount of days passed:");
		int passed = input.nextInt();
		
		// declare future variables
		int future = day + passed;
		String future_string = "";
		
		// switch to find future day
		switch (future % 7) {
		
		case 0:
			future_string = "Sunday";
			break;
		
		case 1:
			future_string = "Monday";
			break;
			
		case 2:
			future_string = "Tuesday";
			break;
			
		case 3:
			future_string = "Wednesday";
			break;
			
		case 4:
			future_string = "Thursday";
			break;
			
		case 5:
			future_string = "Friday";
			break;
			
		case 6:
			future_string = "Saturday";
			break;
		}
		
		// tells user their day and the future day
		out.println("\nToday's day is " + day_string + " and the future day is " + future_string + ".");

	}

}
