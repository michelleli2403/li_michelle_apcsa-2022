//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	   WordsCompare test = new WordsCompare();
	   test.setWords("abe", "ape");
	   System.out.println(test);
	   
	   WordsCompare test2 = new WordsCompare();
	   test2.setWords("giraffe", "gorilla");
	   System.out.println(test2);
	   
	   WordsCompare test3 = new WordsCompare();
	   test3.setWords("one", "two");
	   System.out.println(test3);
	   
	   WordsCompare test4 = new WordsCompare();
	   test4.setWords("fun", "funny");
	   System.out.println(test4);
	   
	   WordsCompare test5 = new WordsCompare();
	   test5.setWords("123", "19");
	   System.out.println(test5);
	   
	   WordsCompare test6 = new WordsCompare();
	   test6.setWords("193", "1910");
	   System.out.println(test6);
	   
	   WordsCompare test7 = new WordsCompare("goofy","godfather");
	   test7.setWords("goofy", "godfather");
	   System.out.println(test7);
	   
	   WordsCompare test8 = new WordsCompare("funnel","fun");
	   test8.setWords("funnel", "fun");
	   System.out.println(test8);
	   
	   
	   /*System.out.println(test);
	   System.out.println(test2);
	   System.out.println(test3);
	   System.out.println(test4);
	   System.out.println(test5);
	   System.out.println(test6);
	   System.out.println(test7);
	   System.out.println(test8);*/
	   
	}
}