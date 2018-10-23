package c.spik3.assignment_4;

import java.util.Scanner;
import java.util.Random;
import static java.lang.System.out;

public class Rock_p_s {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		// finds cpu's choice
		int rps = rand.nextInt(3) + 1;
		
		// prompts user input
		out.println("Rock (1), Paper (2), Scissors (3)?");
		int user = 0;
		
		// makes sure the number is either 1, 2 or 3
		while (user != 1 && user != 2 && user != 3) {
			user = input.nextInt();
			out.println();
			
			if (user != 1 && user != 2 && user != 3) {
				out.println("Invalid number! Choose 1 for Rock, 2 for Paper, or 3 for Scissors:");
			}
		}
		
		// declares string variables
		String you = "";
		String cpu = "";
		String w_l = "";
		
		// determines your choice, computer's choice and whether you won or lost
		if (user == 3) {
			you = "scissors";
			if (rps == 2) {
				cpu = "paper";
				w_l = "won";
			} else if (rps == 1) {
				cpu = "rock";
				w_l = "lost";
			} else {
				cpu = "scissors";
				w_l = "tied";
			}
		} else if (user == 2) {
			you = "paper";
			if (rps == 2) {
				cpu = "paper";
				w_l = "tied";
			} else if (rps == 1) {
				cpu = "rock";
				w_l = "won";
			} else {
				cpu = "scissors";
				w_l = "lost";
			}
		} else {
			you = "rock";
			if (rps == 2) {
				cpu = "paper";
				w_l = "lost";
			} else if (rps == 1) {
				cpu = "rock";
				w_l = "tied";
			} else {
				cpu = "scissors";
				w_l = "won";
			}
		}
		
		// tells user choices and outcome
		out.println("You chose " + you + " and the computer chose " + cpu + ".\nYou " + w_l + ".");
		
		
	}

}
