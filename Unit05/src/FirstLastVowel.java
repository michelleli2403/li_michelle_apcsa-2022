//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class FirstLastVowel
{
   public static String go( String a )
	{
	   String vowel = "aeiouAEIOU";
	   char first = a.charAt(0);
	   char last = a.charAt(a.length()-1);
	   if (vowel.indexOf(first)!=-1) {
		   return "yes";
	   }
	   else if (vowel.indexOf(last)!=-1) {
		   return "yes";
	   }
	   return "no";
	}
}