//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		int intOne, intTwo, intThree;
		Scanner keyboard = new Scanner(System.in);
		
		//add in input
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5) + "\n");
		
		System.out.print("Enter a whole number :: ");
		intOne = keyboard.nextInt();
		System.out.println(intOne + " is odd :: " + NumberVerify.isOdd(intOne));
		System.out.println(intOne + " is even :: " + NumberVerify.isEven(intOne) + "\n");
		
		System.out.print("Enter a whole number :: ");
		intTwo = keyboard.nextInt();
		System.out.println(intTwo + " is odd :: " + NumberVerify.isOdd(intTwo));
		System.out.println(intTwo + " is even :: " + NumberVerify.isEven(intTwo) + "\n");
		
		System.out.print("Enter a whole number ::");
		intThree = keyboard.nextInt();
		System.out.println(intThree + " is odd :: " + NumberVerify.isOdd(intThree));
		System.out.println(intTwo + " is even :: " + NumberVerify.isEven(intThree) + "\n");
		
		//add in more test cases
		
		System.out.println("3 is odd :: " + NumberVerify.isOdd(3));
		System.out.println("3 is even :: " + NumberVerify.isEven(3) + "\n");
		
		System.out.println("100 is odd :: " + NumberVerify.isOdd(100));
		System.out.println("100 is even :: " + NumberVerify.isEven(100) + "\n");
	}
}