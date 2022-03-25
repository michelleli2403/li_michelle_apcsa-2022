//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.IOException;
import java.util.Arrays;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases
		
		int[] test = NumberShifter.makeLucky7Array(20);
		System.out.println(Arrays.toString(test));
		NumberShifter.shiftEm(test);
		System.out.println(Arrays.toString(test));
		
		System.out.println();
		int[] test2 = NumberShifter.makeLucky7Array(20);
		System.out.println(Arrays.toString(test2));
		NumberShifter.shiftEm(test2);
		System.out.println(Arrays.toString(test2));
		
		System.out.println();
		int[] test3 = NumberShifter.makeLucky7Array(20);
		System.out.println(Arrays.toString(test3));
		NumberShifter.shiftEm(test3);
		System.out.println(Arrays.toString(test3));
		
	}
}



