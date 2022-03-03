package Unit11InstructionExamples;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.print("Enter 1st monster's name : ");
		String name = keyboard.next();
		System.out.print("Enter 1st monster's size : ");
		int size = keyboard.nextInt();
		
		//instantiate monster one
		Monster one = new Monster(name, size);
		
		//ask for name and size
		
		//instantiate monster two
		
		
		
	}
}