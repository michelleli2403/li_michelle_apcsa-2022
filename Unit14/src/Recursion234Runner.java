//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Recursion234Runner
{
	public static void main(String args[])
	{
		System.out.println("RecursionFunOne:");
		System.out.println(RecursionFunOne.countOddDigits(4532));
		
		//add more test cases
		System.out.println(RecursionFunOne.countOddDigits(2324242));
		System.out.println(RecursionFunOne.countOddDigits(0));
		System.out.println(RecursionFunOne.countOddDigits(-3));
		System.out.println(RecursionFunOne.countOddDigits(56));
		
		System.out.println("\nRecursionFunThree:");
		System.out.println(RecursionFunThree.luckyThrees(3));
		System.out.println(RecursionFunThree.luckyThrees(31332));
		System.out.println(RecursionFunThree.luckyThrees(134523));
		System.out.println(RecursionFunThree.luckyThrees(3113));
		System.out.println(RecursionFunThree.luckyThrees(13331));
		System.out.println(RecursionFunThree.luckyThrees(777337777));
		
	}
}