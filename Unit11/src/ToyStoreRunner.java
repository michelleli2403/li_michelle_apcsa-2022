//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore sto = new ToyStore();
		System.out.println(sto);
		sto.loadToys("sorry bat sorry sorry sorry train train");
		
		System.out.println(sto);
		System.out.println("max == " + sto.getMostFrequentToy());
		//System.out.println("min == " + sto.getLeastFrequentToy());
		sto.sortToysByCount();
		System.out.println("sort == " + sto);
	}
}