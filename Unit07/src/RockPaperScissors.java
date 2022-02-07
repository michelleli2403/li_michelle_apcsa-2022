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
		System.out.println("player had " + player);
		int random = (int)Math.floor(Math.random()*3);
		char compChoice = ' ';
		switch (random) {
			case 0 : compChoice = 'R'; break;
			case 1 : compChoice = 'P'; break;
			case 2 : compChoice = 'S'; break;
		}
		System.out.println("computer had " + compChoice);
	}

	public String determineWinner()
	{
		String winner="";
		return winner;
	}

	public String toString()
	{
		String output="";
		return output;
	}
}