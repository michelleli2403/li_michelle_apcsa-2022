//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases	
		LetterRemover remove = new LetterRemover();
		remove.setRemover("I am Sam I am", 'a');
		System.out.println(remove);
		
		LetterRemover remove2 = new LetterRemover();
		remove2.setRemover("ssssssssxssssesssssesss", 's');
		System.out.println(remove2);
		
		LetterRemover remove3 = new LetterRemover();
		remove3.setRemover("qwertyqwertyqwerty", 'a');
		System.out.println(remove3);
		
		LetterRemover remove4 = new LetterRemover();
		remove4.setRemover("abababababa", 'b');
		System.out.println(remove4);
		
		LetterRemover remove5 = new LetterRemover();
		remove5.setRemover("abaababababa", 'x');
		System.out.println(remove5);
											
	}
}