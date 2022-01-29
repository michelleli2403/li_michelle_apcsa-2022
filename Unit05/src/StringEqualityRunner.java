//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		StringEquality test = new StringEquality();
		test.setWords("hello","goodbye");
		StringEquality test2 = new StringEquality();
		test2.setWords("one","two");
		StringEquality test3 = new StringEquality();
		test3.setWords("three","four");
		StringEquality test4 = new StringEquality();
		test4.setWords("TCEA","UIL");
		StringEquality test5 = new StringEquality();
		test5.setWords("State","Champions");
		StringEquality test6 = new StringEquality();
		test6.setWords("ABC","ABC");
		StringEquality test7 = new StringEquality();
		test7.setWords("ABC","CBA");
		StringEquality test8 = new StringEquality();
		test8.setWords("Same","Same");
		
		System.out.println(test);
		System.out.println(test2);
		System.out.println(test3);
		System.out.println(test4);
		System.out.println(test5);
		System.out.println(test6);
		System.out.println(test7);
		System.out.println(test8);
	}
}