//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		for (int i=0; i<sentence.length(); i++) {
			wordRay=sentence.split(" ");
		}
	}

	public void sort()
	{
		for (int i=0; i<wordRay.length-1; i++) {
			int minIndex=i;
			for (int j=i+1; j<wordRay.length; j++) {
				if (wordRay[j].compareTo(wordRay[minIndex])<0) {
					minIndex=j;
				}
			}
			String temp=wordRay[i];
			wordRay[i] = wordRay[minIndex];
			wordRay[minIndex]=temp;
			
		}
	}

	public String toString()
	{
		String output="";
		for (int i=0; i<wordRay.length; i++) {
			output+=wordRay[i]+"\n";
		}
		return output+"\n\n";
	}
}