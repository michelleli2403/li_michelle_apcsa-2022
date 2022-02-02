package Unit05InstructionExamples;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class First
{
   public static String go( String a )
	{
	   if (a.length()==1) {
		   return "no";
	   }
	   String first = a.substring(0,1);
	   a=a.replaceFirst(first, "");
	   if (a.indexOf(first)!=-1) {
			return "yes";
	   }
	   else {
		   return "no";
	   }
	}
}



/*

EXPECTED RUNNER OUTPUT
 
no
yes
no
no
yes
no
yes
yes
no
no


*/