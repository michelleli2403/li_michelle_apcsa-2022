//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private char playChoice;
	private char compChoice;

	public RockPaperScissors()
	{
		setPlayers(' ');
	}

	public RockPaperScissors(char player)
	{
		setPlayers(player);
	}

	public void setPlayers(char player)
	{
		playChoice = player;
		
		int random = (int)Math.floor(Math.random()*3);
		switch (random) {
			case 0 : compChoice = 'R'; break;
			case 1 : compChoice = 'P'; break;
			case 2 : compChoice = 'S'; break;
		}
	}

	public String determineWinner()
	{
		if (compChoice == playChoice) {
			return "!Draw Game!";
		}
		else if (compChoice=='R' && playChoice=='S') {
			return "!Computer wins <<Rock Break Scissors>>!";
		}
		else if (compChoice=='R' && playChoice=='P') {
			return "!Player wins <<Paper Covers Rock>>!";
		}
		else if (compChoice=='P' && playChoice=='R') {
			return "!Computer wins <<Paper Covers Rock>>!";
		}
		else if (compChoice=='P' && playChoice=='S') {
			return "!Player wins <<Scissors Cuts Paper>>!";
		}
		else if (compChoice=='S'&&playChoice=='R') {
			return "!Player wins <<Rock Breaks Scissors>>!";
		}
		else if (compChoice=='S' && playChoice=='P'){
			return "!Computer wins <<Scissors Cuts Paper>>!";
		}
		else {
			return "Please enter R, P, or S";
		}
	}

	public String toString()
	{
		String output= "player had " + playChoice + "\n" + "computer had " + compChoice + "\n" + determineWinner() + "\n";
		return output;
	}
}