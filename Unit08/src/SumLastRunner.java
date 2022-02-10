//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumLastRunner
{
	public static void main( String args[] )
	{
		int[] vals = {-99,1,2,3,4,5,6,7,8,9,10,5};
		System.out.println(RaySumLast.go(vals));
		
		int[] vals2 = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.println(RaySumLast.go(vals2));
		
		int[] vals3 = {10,20,30,40,50,-11818,40,30,20,10};
		System.out.println(RaySumLast.go(vals3));
		
		int[] vals4 = {32767};
		System.out.println(RaySumLast.go(vals4));
		
		int[] vals5 = {255,255};
		System.out.println(RaySumLast.go(vals5));
		
		int[] vals6 = {9,10,-88,100,-555,2};
		System.out.println(RaySumLast.go(vals6));
		
		int[] vals7 = {10,10,10,11,456};
		System.out.println(RaySumLast.go(vals7));
		
		int[] vals8 = {-111,1,2,3,9,11,20,1};
		System.out.println(RaySumLast.go(vals8));
		
		int[] vals9 = {9,8,7,6,5,4,3,2,0,-2,6};
		System.out.println(RaySumLast.go(vals9));
		
		int[] vals10 = {12,15,18,21,23,1000};
		System.out.println(RaySumLast.go(vals10));
		
		int[] vals11 = {250,19,17,15,13,11,10,9,6,3,2,1,0};
		System.out.println(RaySumLast.go(vals11));
		
		int[] vals12 = {9,10,-8,10000,-5000,-3000};
		System.out.println(RaySumLast.go(vals12));
		
		
	}
}