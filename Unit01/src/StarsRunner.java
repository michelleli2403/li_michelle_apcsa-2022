//? A+ Computer Science
//www.apluscompsci.com

//Name - Michelle Li
//Date - 1/18/22
//Class - Period 1
//Lab  - StarsAndStripes

import static java.lang.System.*;

public class StarsRunner
{
   public static void main(String args[])
   {
      //instantiate a StarsAndStripes object
      
      //call the methods needed to make the patterns on the word document
      StarsAndStripes pattern = new StarsAndStripes();
      pattern.printTwentyStars();
      pattern.printTwentyDashes();
      pattern.printTwoBlankLines();
      pattern.printASmallBox();
      pattern.printTwoBlankLines();
      pattern.printABigBox();
   }
}