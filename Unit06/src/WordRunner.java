//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		Word word = new Word();
		word.setString("Hello");
		System.out.println(word);
		
		Word word2 = new Word();
		word2.setString("World");
		System.out.println(word2);
		
		Word word3 = new Word();
		word3.setString("JukeBox");
		System.out.println(word3);
		
		Word word4 = new Word();
		word4.setString("TCEA");
		System.out.println(word4);
		
		Word word5 = new Word();
		word5.setString("UIL");
		System.out.println(word5);
	}
}