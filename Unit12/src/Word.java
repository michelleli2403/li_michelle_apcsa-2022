//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = new String(s);
	}

	public int compareTo( Word rhs )
	{		
		if (word.length() == rhs.word.length()) {
			return word.compareTo(rhs.word); //comparing instance var word and the word that came in
		}
		else if (word.length() > rhs.word.length()) //the sort is looking for a -1, 0, or 1 which will determine the order
			return 1;
		else 
			return -1;
	}

	public String toString()
	{
		return word;
	}
}