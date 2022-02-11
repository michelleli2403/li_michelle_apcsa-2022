package Unit08InstructionExamples;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySmallest
{
	public static int go(int[] ray)
	{
		int smallest=ray[0];
		for (int i=0; i<ray.length; i++) {
			if (ray[i]<smallest) {
				smallest=ray[i];
			}
		}
		return smallest;
	}
}