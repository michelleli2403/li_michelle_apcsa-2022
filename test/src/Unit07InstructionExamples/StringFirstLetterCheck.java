package Unit07InstructionExamples;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringFirstLetterCheck
{
	String wordOne, wordTwo;

	public StringFirstLetterCheck()
	{
		wordOne = "";
		wordTwo = "";
	}

	public StringFirstLetterCheck(String one, String two)
	{
		setWords(one, two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkFirstLetter( )
	{
		if (wordOne.charAt(0) == wordTwo.charAt(0)) {
			return true;
		}
		return false;
	}

	public String toString()
	{
		if (checkFirstLetter()) {
			return wordOne + " has the same first letter as " + wordTwo + "\n";
		}
	   return wordOne + " does not have the same first letter as " + wordTwo + "\n";
	}
}