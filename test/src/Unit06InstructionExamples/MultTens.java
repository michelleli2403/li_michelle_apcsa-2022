package Unit06InstructionExamples;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class MultTens
{
	public static String go(  int x )
	{
		String s = "";
		if (x<=0) {
			return "aplus";
		}
		for (int i=1; i<x+1; i++) {
			s = s+i*10;
		}
		return s;
	}
}