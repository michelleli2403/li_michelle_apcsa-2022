package Unit07InstructionExamples;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		theChar = ' ';
	}

	public CharacterAnalyzer(char c)
	{
		setChar(c);
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if (theChar>64 && theChar<91) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean isLower( )
	{
		if (theChar>96 && theChar<123) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isNumber( )
	{
		if (theChar>47 && theChar<58) {
			return true;
		}
		else {
			return false;
		}
	}	

	public int getASCII( )
	{
		return theChar;
	}

	public String toString()
	{
		if (isUpper()) {
			return getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";	 
		}
		if (isLower()) {
			return getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	 
		}
		else {
			return getChar() + " is a number. ASCII == " + getASCII() + "\n";	 
		}
	}
}

//line 23 is that right and why
