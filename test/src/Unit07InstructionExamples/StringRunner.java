package Unit07InstructionExamples;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class StringRunner
{
	public static void main(String args[])
	{
		//add test cases
		BiggestString test = new BiggestString("abc","cba","bca");
		System.out.println(test);
		
		test.setStrings("one","fourteen", "twenty");
		System.out.println(test);

	}
}