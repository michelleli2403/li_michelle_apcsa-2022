//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] randomArray = new int[size];
		for (int i=0; i<randomArray.length; i++) {
			randomArray[i]=(int) (Math.random()*10+1);
		}
		return randomArray;
	}
	public static void shiftEm(int[] array)
	{
		for (int i=0; i<array.length-1; i++) {
			for (int j=i; j<array.length; j++) {
				int temp=array[i];
				if (array[j]==7) {
					array[i]=7;
					array[j]=temp;
				}
			}
		}
	}
}