//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		Grid x = new Grid(20,20,new String[] {"a","b","c","7","9","x","2"});
		System.out.println(x);
		System.out.println("\n"+x.findMax(new String[] {"a","b","c","7","9","x","2"}) + " occurs the most.");
	}
}