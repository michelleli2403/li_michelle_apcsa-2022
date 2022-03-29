//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		while (number>0) {
			number/=10;
			count++;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		int index=0;
		while (number>0) {
			sorted[index]=number%10;
			number/=10;
			index++;
		}
		for (int i=0; i<sorted.length-1; i++) {
			int minIndex=i;
			for (int j=i+1; j<sorted.length; j++) {
				if (sorted[j]<sorted[minIndex]) {
					minIndex=j;
				}
			}
			int temp = sorted[i];
			sorted[i] = sorted[minIndex];
			sorted[minIndex]=temp;
		}
		return sorted;
	}
}