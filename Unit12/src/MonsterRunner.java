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
		Skeleton one = new Skeleton(name, size);
		
		//ask for name and size
		System.out.print("Enter 2nd monster's name : ");
		String name2 = keyboard.next();
		
		System.out.print("Enter 2nd monster's size : ");
		int size2 = keyboard.nextInt();
		
		//instantiate monster two
		Skeleton two = new Skeleton(name2, size2);
		
		System.out.println("\nMonster 1 - " + one);
		System.out.println("Monster 2 - " + two + "\n");
		
		if (one.isBigger(two)) {
			System.out.println("Monster one is bigger than Monster two.");
		}
		if (one.isSmaller(two)) {
			System.out.println("Monster one is smaller than Monster two.");
		}
		if (one.getHowBig()==two.getHowBig()) {
			System.out.println("Monster one is the same size as Monster two.");
		}
		
		if (one.namesTheSame(two)) {
			System.out.println("Monster one has the same name as Monster two.");
		}
		if (!one.namesTheSame(two)) {
			System.out.println("Monster one does not have the same name as Monster two.");
		}
	}
}