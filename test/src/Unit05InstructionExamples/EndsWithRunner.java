package Unit05InstructionExamples;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;

public class EndsWithRunner
{
	public static void main ( String[] args )
	{
		System.out.println( EndsWith.endsWith("chicken", "en"));
		System.out.println( EndsWith.endsWith("chicken", "dog"));
		System.out.println( EndsWith.endsWith("alligator", "gator"));
		System.out.println( EndsWith.endsWith("alligator", "all"));
		System.out.println( EndsWith.endsWith("apluscompsci", "sci"));
		System.out.println( EndsWith.endsWith("apluscompsci", "comp"));
		
		
		//test cases				
		/*chicken en
			chicken dog
			alligator gator
			alligator all
			apluscompsci sci */
			
		//output
		/*true
			false
			true
			false
			true
			false*/

	}
}