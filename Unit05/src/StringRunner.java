//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a word :: ");
		String word = keyboard.next();
		System.out.println("Enter a word :: ");
		String word2 = keyboard.next();
		System.out.println("Enter a word :: ");
		String word3 = keyboard.next();
		
		StringOddOrEven test = new StringOddOrEven(word);
		test.setString(word);
		StringOddOrEven test2 = new StringOddOrEven(word2);
		test2.setString(word2);
		StringOddOrEven test3 = new StringOddOrEven(word3);
		test3.setString(word3);
		
		System.out.println(test);
		System.out.println(test2);
		System.out.println(test3);
	}
}