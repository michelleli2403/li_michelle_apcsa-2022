package Unit05InstructionExamples;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a character :: ");
		char letter = keyboard.next().charAt(0);
		CharacterAnalyzer test = new CharacterAnalyzer(letter);
		out.println(test);   

		//add more test cases
		
		out.print("Enter a character :: ");
		char letter2 = keyboard.next().charAt(0);
		CharacterAnalyzer test2 = new CharacterAnalyzer(letter2);
		out.println(test2);
		
		out.print("Enter a character :: ");
		char letter3 = keyboard.next().charAt(0);
		CharacterAnalyzer test3 = new CharacterAnalyzer(letter3);
		out.println(test3);
		
		out.print("Enter a character :: ");
		char letter4 = keyboard.next().charAt(0);
		CharacterAnalyzer test4 = new CharacterAnalyzer(letter4);
		out.println(test4);
		
		

	}
}