//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		out.printf("Bill after discount :: %.2f", Discount.getDiscountedBill(amt));

	}
}

/* using a constructor

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		Discount myFinalBill = new Discount(5000);
		
		//out.print("Enter the original bill amount :: ");
		//double amt = keyboard.nextDouble();
		out.printf("Bill after discount :: %.2f", myFinalBill.getDiscountedBill(myFinalBill.getter()));

	}
}*/

