package c.spik3.assignment_4;

import java.util.Scanner;
import java.util.Random;
import static java.lang.System.out;

public class Heads_or_tails {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		// gets random number for heads or tails
		int one_2 = rand.nextInt(2) + 1;
		
		// prompts user input
		out.print("Heads or tails?\n"
				+ "Input 1 for heads and 2 for tails:\n");
		int user = 0;
		
		// while the user's answer isn't 1 or 2
		while (user != 1 && user != 2) {
			user = input.nextInt();
			out.println();
			
			if (user != 1 && user != 2) {
				out.println("Invalid answer! Input 1 for heads and 2 for tails:");
			}
		}
		
		// tells user if they won or lost
		if (user == one_2) {
			out.println("You won!");
		} else {
			out.println("You lost!");
		}

	}

}
