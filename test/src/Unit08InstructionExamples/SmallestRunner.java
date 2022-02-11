package Unit08InstructionExamples;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SmallestRunner
{
	public static void main( String args[] )
	{		
		System.out.println(RaySmallest.go(new int[] {-99,1,2,3,4,5,6,7,8,9,10,12345}));
		System.out.println(RaySmallest.go(new int[] {32767}));
		System.out.println(RaySmallest.go(new int[] {255,255}));
		System.out.println(RaySmallest.go(new int[] {250,19,17,15,13,11,10,9,6,3,2,1,-455}));
	}
}