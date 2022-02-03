package Unit06InstructionExamples;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class StringRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases	
		StringRemover clean = new StringRemover();
		clean.setRemover("xR-MxR-MHelloxR-M", "R-M");
		System.out.println(clean);
		
		StringRemover clean2 = new StringRemover();
		clean2.setRemover("sxsssxssxsxssexssxsesss", "xs");
		System.out.println(clean2);
		
		StringRemover clean3 = new StringRemover();
		clean3.setRemover("fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn", "qwerty");
		System.out.println(clean3);
											
	}
}