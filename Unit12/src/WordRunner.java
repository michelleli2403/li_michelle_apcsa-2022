//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\miche\\Desktop\\apcsa\\li_michelle_apcsa-2022\\Unit12\\src\\words.dat")); //find where I put it. put double backslash btwn each part

		int size = file.nextInt();
		file.nextLine();
		
		Word[] words = new Word[size];
		for(int i=0; i<words.length; i++) {
			words[i]=new Word(file.nextLine());
		}
		
		Arrays.sort(words); //looking for a 0, 1, or -1
		
		for (Word word : words) {
			System.out.println(word);
		}
		











	}
}