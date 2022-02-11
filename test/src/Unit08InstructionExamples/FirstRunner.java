package Unit08InstructionExamples;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class FirstRunner
{
	public static void main( String args[] )
	{
		System.out.println(RayFirst.go(new int[] {-99,1,2,3,4,5,6,7,8,9,10,12345}));
		System.out.println(RayFirst.go(new int[] {10,20,30,40,50,-11818,40,30,20,10}));
		System.out.println(RayFirst.go(new int[] {32767}));
		System.out.println(RayFirst.go(new int[] {7,7,7,7}));
		System.out.println(RayFirst.go(new int[] {}));
	}
}