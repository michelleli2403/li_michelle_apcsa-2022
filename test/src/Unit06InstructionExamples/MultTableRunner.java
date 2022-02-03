package Unit06InstructionExamples;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class MultTableRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		MultTable num = new MultTable();
		num.setTable(5, 5);
		num.printTable();
		
		MultTable num2 = new MultTable();
		num2.setTable(3, 7);
		num2.printTable();
		
		MultTable num3 = new MultTable();
		num3.setTable(1, 6);
		num3.printTable();
		
		MultTable num4 = new MultTable();
		num4.setTable(9, 9);
		num4.printTable();
		
		MultTable num5 = new MultTable();
		num5.setTable(7, 8);
		num5.printTable();
		
	}
}