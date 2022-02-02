package Unit05InstructionExamples;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class Social
{
   public static String go( String a )
	{
	   if (a.charAt(3)!='-' || a.charAt(6)!='-') {
		   return "bad";
	   }
	   else {
		   return a.substring(a.length()-4);
	   }
		
	}
}



/*

EXPECTED RUNNER OUTPUT
 
good
bad
good
bad
good
good
bad
bad




*/