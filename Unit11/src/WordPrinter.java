//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class WordPrinter
{
	//instance variables and constructors could be present, but are not necessary
	private String wordInput;
	private int timesInput;
	
	public WordPrinter() {
		wordInput="";
		timesInput=0;
	}
	
	public WordPrinter(String word, int times) {
		wordInput=word;
		timesInput=times;
	}
		
	public static void printWord(String word, int times)
	{
		for (int i=0; i<times; i++) {
			System.out.println(word);
		}
	}
}