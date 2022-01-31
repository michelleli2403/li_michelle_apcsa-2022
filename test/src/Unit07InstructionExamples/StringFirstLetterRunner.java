package Unit07InstructionExamples;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringFirstLetterRunner
{
	public static void main( String args[] )
	{
		//add test cases
		StringFirstLetterCheck test = new StringFirstLetterCheck();
		test.setWords("hello", "howdy");
		System.out.println(test);
		
		StringFirstLetterCheck test2 = new StringFirstLetterCheck();
		test2.setWords("one", "two");
		System.out.println(test2);
	}
}