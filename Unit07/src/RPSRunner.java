//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		char response;

		// add in a do while loop after you get the basics up and running

		char player = ' ';

		do {
			out.print("Rock-Paper-Scissors - pick your weapon[R,P,S] :: ");

			// read in the player value
			player = keyboard.next().charAt(0);
			player = Character.toUpperCase(player);

			RockPaperScissors game = new RockPaperScissors();
			// System.out.println("player had " + response);
			game.setPlayers(player);
			System.out.println(game);

			System.out.print("Do you want to play again? [y,n] ");
			response = keyboard.next().charAt(0);
			System.out.print("\n");
		} while (response == 'y');
		
		System.out.println("Thank you for playing!");

	}
}
