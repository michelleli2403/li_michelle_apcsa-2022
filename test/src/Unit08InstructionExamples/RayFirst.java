package Unit08InstructionExamples;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayFirst
{
	public static boolean go(int[] ray)
	{
		int count=0;
		if (ray.length==0) {
			return false;
		}
		for (int i=1; i<ray.length; i++) {
			if (ray[i]==ray[0]) {
				count++;
			}
		}
		if (count>0) {
			return true;
		}
		return false;
	}
}