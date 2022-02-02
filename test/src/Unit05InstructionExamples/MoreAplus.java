package Unit05InstructionExamples;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class MoreAplus
{
	public static String go( String a )
	{
	   a=a.replaceFirst("aplus", "");
	   if (a.indexOf("aplus")!=-1) {
		   return "yes";
	   }
	   else {
		   return "no";
	   }
	}
}
