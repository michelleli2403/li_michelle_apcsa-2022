//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

/*public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
		setRemover("", ' ');
	}

	//add in second constructor
	public LetterRemover(String s, char rem) {
		setRemover(s,rem);
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		int cleanedLength = cleaned.length();
		int index = 0;
		while (cleanedLength>0) {
			if (cleaned.indexOf(lookFor)!=-1) {
				index=cleaned.indexOf(lookFor);
				cleaned=cleaned.substring(0,index)+cleaned.substring(index+1);
			}
			cleanedLength--;
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters() + "\n";
	}
}*/



public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
		setRemover("", ' ');
	}

	//add in second constructor
	public LetterRemover(String s, char rem) {
		setRemover(s,rem);
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		int index = 0;
		while (cleaned.indexOf(lookFor)!=-1) {
			index = cleaned.indexOf(lookFor);
			cleaned=cleaned.substring(0,index)+cleaned.substring(index+1);
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters() + "\n";
	}
}