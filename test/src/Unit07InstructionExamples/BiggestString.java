package Unit07InstructionExamples;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestString
{
	private String one,two,three;

	public BiggestString()
	{
		this("","","");
	}

	public BiggestString(String a, String b, String c)
	{
		setStrings(a, b, c);
	}

	public void setStrings(String a, String b, String c)
	{
		one=a;
		two=b;
		three=c;
	}

	public String getBiggest()
	{
		String biggest="";
		if (one.compareTo(two)>0 && one.compareTo(three)>0) {
			biggest=one;
		} 
		else if (two.compareTo(three)>0 && two.compareTo(one)>0) {
			biggest=two;
		}
		else {
			biggest=three;
		}
		return biggest;
	}

	public String toString()
	{
	   return getBiggest();
	}
}